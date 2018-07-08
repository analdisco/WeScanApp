package wetickets.wescanapp.domain.models.requests

import wetickets.wescanapp.domain.models.json.StatsModel
import wetickets.wescanapp.domain.models.json.TicketTypeModel
import java.io.Serializable
import java.util.*

data class ActionListTicketTypesResponseModel(
        val error: Boolean,
        val list: ArrayList<TicketTypeModel>,
        val stats: StatsModel,
        val time: String)
    : Serializable