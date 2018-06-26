package wetickets.wescanapp.application.models.requests

import wetickets.wescanapp.application.models.json.StatsModel
import wetickets.wescanapp.application.models.json.TicketModel
import java.io.Serializable
import java.util.*

data class ActionListAllModel(
        val server_time : String,
        val error : Boolean,
        val msg : String,
        val list : Array<TicketModel>,
        val stats : StatsModel,
        val time : String)
    : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ActionListAllModel

        if (server_time != other.server_time) return false
        if (error != other.error) return false
        if (msg != other.msg) return false
        if (!Arrays.equals(list, other.list)) return false
        if (stats != other.stats) return false
        if (time != other.time) return false

        return true
    }

    override fun hashCode(): Int {
        var result = server_time.hashCode()
        result = 31 * result + error.hashCode()
        result = 31 * result + msg.hashCode()
        result = 31 * result + Arrays.hashCode(list)
        result = 31 * result + stats.hashCode()
        result = 31 * result + time.hashCode()
        return result
    }
}