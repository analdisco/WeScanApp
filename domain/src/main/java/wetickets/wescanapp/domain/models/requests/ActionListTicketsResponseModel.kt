package wetickets.wescanapp.domain.models.requests

import wetickets.wescanapp.domain.models.json.StatsModel
import wetickets.wescanapp.domain.models.json.TicketModel
import java.io.Serializable
import java.util.*

data class ActionListTicketsResponseModel(
        val server_time: String,
        val error: Boolean,
        val msg: String,
        val list: ArrayList<TicketModel>,
        val stats: StatsModel,
        val time: String)
    : Serializable