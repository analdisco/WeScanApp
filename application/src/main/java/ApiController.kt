import interfaces.api.IApiController
import models.requests.ActionCheckInTicketResponseModel
import models.requests.ActionCheckOutTicketResponseModel
import models.requests.ActionListTicketTypesResponseModel
import models.requests.ActionListTicketsResponseModel
import wetickets.wescanapp.domain.models.requests.*

class ApiController : IApiController {
    val TAG = "WeTicketsServer"

    override fun actionListTickets(
            basePath : String,
            weTicketsCode: String,
            successHandler: (response: ActionListTicketsResponseModel) -> Unit,
            errorHandler: (errorType: String, msg: String) -> Unit) {
        val path = "action=list_all"
    }

    override fun actionListTicketTypes(
            basePath : String,
            weTicketsCode: String,
            successHandler: (response: ActionListTicketTypesResponseModel) -> Unit,
            errorHandler: (errorType: String, msg: String) -> Unit) {
        val path = "action=list_ticket_types"
    }

    override fun actionCheckInTicket(
            basePath : String,
            weTicketsCode: String,
            ticketCode: String,
            force: Boolean,
            successHandler: (response: ActionCheckInTicketResponseModel) -> Unit,
            errorHandler: (errorType: String, msg: String) -> Unit) {

        // Set default action
        var path = "action=check_in_code&code=$ticketCode"
        // Force is off by default
        if (force) path = "action=check_in_code_force&code=$ticketCode"

        path += "asd"
    }

    override fun actionCheckOutTicket(
            basePath : String,
            weTicketsCode: String,
            ticketCode: String,
            force: Boolean,
            successHandler: (response: ActionCheckOutTicketResponseModel) -> Unit,
            errorHandler: (errorType: String, msg: String) -> Unit) {
        val path = "action=check_in_code&code=$ticketCode"
    }
}