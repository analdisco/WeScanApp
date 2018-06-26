package interfaces.api

import models.requests.ActionCheckInTicketResponseModel
import models.requests.ActionCheckOutTicketResponseModel
import models.requests.ActionListTicketTypesResponseModel
import models.requests.ActionListTicketsResponseModel

interface IApiController {

    fun actionListTickets(
            basePath : String,
            weTicketsCode : String,
            successHandler: (response: ActionListTicketsResponseModel) -> Unit,
            errorHandler: (errorType : String, msg: String) -> Unit)

    fun actionListTicketTypes(
            basePath : String,
            weTicketsCode : String,
            successHandler: (response: ActionListTicketTypesResponseModel) -> Unit,
            errorHandler: (errorType : String, msg: String) -> Unit)

    fun actionCheckInTicket(
            basePath : String,
            weTicketsCode : String,
            ticketCode : String,
            force : Boolean,
            successHandler: (responseOut: ActionCheckInTicketResponseModel) -> Unit,
            errorHandler: (errorType : String, msg: String) -> Unit)

    fun actionCheckOutTicket(
            basePath : String,
            weTicketsCode : String,
            ticketCode : String,
            force : Boolean,
            successHandler: (responseOut: ActionCheckOutTicketResponseModel) -> Unit,
            errorHandler: (errorType : String, msg: String) -> Unit)
}