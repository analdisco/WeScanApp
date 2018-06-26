package wetickets.wescanapp.domain.interfaces.api

import wetickets.wescanapp.domain.models.requests.ActionCheckInTicketResponseModel
import wetickets.wescanapp.domain.models.requests.ActionCheckOutTicketResponseModel
import wetickets.wescanapp.domain.models.requests.ActionListTicketTypesResponseModel
import wetickets.wescanapp.domain.models.requests.ActionListTicketsResponseModel

interface IApiController {

    fun actionListTickets(
            basePath: String,
            weTicketsCode: String,
            deviceName: String,
            successHandler: (response: ActionListTicketsResponseModel) -> Unit,
            errorHandler: (errorType: String, msg: String) -> Unit)

    fun actionListTicketsAfterTime(
            basePath: String,
            weTicketsCode: String,
            lastUpdate: String,
            deviceName: String,
            successHandler: (response: ActionListTicketsResponseModel) -> Unit,
            errorHandler: (errorType: String, msg: String) -> Unit)

    fun actionListTicketTypes(
            basePath: String,
            weTicketsCode: String,
            deviceName: String,
            successHandler: (response: ActionListTicketTypesResponseModel) -> Unit,
            errorHandler: (errorType: String, msg: String) -> Unit)

    fun actionCheckInTicket(
            basePath: String,
            weTicketsCode: String,
            ticketCode: String,
            force: Boolean,
            deviceName: String,
            successHandler: (responseOut: ActionCheckInTicketResponseModel) -> Unit,
            errorHandler: (errorType: String, msg: String) -> Unit)

    fun actionCheckOutTicket(
            basePath: String,
            weTicketsCode: String,
            ticketCode: String,
            deviceName: String,
            successHandler: (responseOut: ActionCheckOutTicketResponseModel) -> Unit,
            errorHandler: (errorType: String, msg: String) -> Unit)
}