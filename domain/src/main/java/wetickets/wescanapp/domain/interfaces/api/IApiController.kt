package wetickets.wescanapp.domain.interfaces.api

import wetickets.wescanapp.domain.models.requests.ActionCheckTicketResponseModel
import wetickets.wescanapp.domain.models.requests.ActionListTicketTypesResponseModel
import wetickets.wescanapp.domain.models.requests.ActionListTicketsResponseModel

interface IApiController {
    // List all tickets
    fun actionListTickets(
            weTicketsCode : String,
            successHandler: (response: ActionListTicketsResponseModel) -> Unit,
            errorHandler: (errorType : String, msg: String) -> Unit)

    // List all ticket types
    fun actionListTicketTypes(
            weTicketsCode : String,
            successHandler: (response: ActionListTicketTypesResponseModel) -> Unit,
            errorHandler: (errorType : String, msg: String) -> Unit)

    // Check in
    fun actionCheckInTicket(
            weTicketsCode : String,
            ticketCode : String,
            force : Boolean,
            successHandler: (response: ActionCheckTicketResponseModel) -> Unit,
            errorHandler: (errorType : String, msg: String) -> Unit)
}