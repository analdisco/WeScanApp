import wetickets.wescanapp.domain.interfaces.api.IApiController
import wetickets.wescanapp.domain.models.requests.ActionCheckTicketResponseModel
import wetickets.wescanapp.domain.models.requests.ActionListTicketTypesResponseModel
import wetickets.wescanapp.domain.models.requests.ActionListTicketsResponseModel

class ApiController : IApiController {

    val TAG = BackendVolley::class.java.simpleName

    override fun actionListTickets(
            weTicketsCode: String,
            successHandler: (response: ActionListTicketsResponseModel) -> Unit,
            errorHandler: (errorType: String, msg: String) -> Unit) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun actionListTicketTypes(
            weTicketsCode: String,
            successHandler: (response: ActionListTicketTypesResponseModel) -> Unit,
            errorHandler: (errorType: String, msg: String) -> Unit) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun actionCheckInTicket(
            weTicketsCode: String,
            ticketCode: String,
            force: Boolean,
            successHandler: (response: ActionCheckTicketResponseModel) -> Unit,
            errorHandler: (errorType: String, msg: String) -> Unit) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}