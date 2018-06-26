package wetickets.wescanapp.application.models.requests

import wetickets.wescanapp.application.models.json.StatsModel
import wetickets.wescanapp.application.models.json.TicketTypeModel
import java.io.Serializable
import java.util.*

data class ActionListTicketTypesModel(
        val error : Boolean,
        val list : Array<TicketTypeModel>,
        val stats : StatsModel,
        val time : String)
    : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ActionListTicketTypesModel

        if (error != other.error) return false
        if (!Arrays.equals(list, other.list)) return false
        if (stats != other.stats) return false
        if (time != other.time) return false

        return true
    }

    override fun hashCode(): Int {
        var result = error.hashCode()
        result = 31 * result + Arrays.hashCode(list)
        result = 31 * result + stats.hashCode()
        result = 31 * result + time.hashCode()
        return result
    }
}