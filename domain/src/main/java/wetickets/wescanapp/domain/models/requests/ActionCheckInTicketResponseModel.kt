package wetickets.wescanapp.domain.models.requests

import wetickets.wescanapp.domain.enums.ApiErrorType
import wetickets.wescanapp.domain.models.json.StatsModel
import java.io.Serializable

data class ActionCheckInTicketResponseModel(
        val server_time: String,
        val error: Boolean,
        val error_type: ApiErrorType,
        val msg: String,
        val stats: StatsModel,
        val time: String)
    : Serializable