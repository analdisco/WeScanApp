package wetickets.wescanapp.application.volley

import com.android.volley.Request

import com.android.volley.toolbox.JsonObjectRequest
import com.google.gson.Gson
import wetickets.wescanapp.domain.interfaces.api.IApiController
import wetickets.wescanapp.domain.models.requests.ActionCheckInTicketResponseModel
import wetickets.wescanapp.domain.models.requests.ActionCheckOutTicketResponseModel
import wetickets.wescanapp.domain.models.requests.ActionListTicketTypesResponseModel
import wetickets.wescanapp.domain.models.requests.ActionListTicketsResponseModel

class ApiController: IApiController {

    private val tag = "WeTicketsServer"
    private val pathPrefix = "/wescantickets/?wescantickets_code="

    override fun actionListTickets(
            basePath: String,
            weTicketsCode: String,
            deviceName: String,
            successHandler: (response: ActionListTicketsResponseModel) -> Unit,
            errorHandler: (errorType: String, msg: String) -> Unit) {

        val requestUrl = "$basePath$pathPrefix$weTicketsCode&action=list_all"
        val jsonRequest = JsonObjectRequest(Request.Method.GET,
                requestUrl,
                null,
                { response ->
                    val jsonResponse = Gson().fromJson<ActionListTicketsResponseModel>(
                            response.toString(),
                            ActionListTicketsResponseModel::class.java)
                    successHandler(jsonResponse)
                })
                { error ->
                    errorHandler(error.toString(), error.message.toString())
                }

        BackendVolley.instance?.addToRequestQueue(jsonRequest, tag)
    }

    override fun actionListTicketsAfterTime(
            basePath: String,
            weTicketsCode: String,
            lastUpdate: String,
            deviceName: String,
            successHandler: (response: ActionListTicketsResponseModel) -> Unit,
            errorHandler: (errorType: String, msg: String) -> Unit) {
    }

    override fun actionListTicketTypes(
            basePath: String,
            weTicketsCode: String,
            deviceName: String,
            successHandler: (response: ActionListTicketTypesResponseModel) -> Unit,
            errorHandler: (errorType: String, msg: String) -> Unit) {

        val requestUrl = "$basePath$pathPrefix&action=list_ticket_types"

        val jsonRequest = JsonObjectRequest(Request.Method.GET,
                requestUrl,
                null,
                { response ->
                    val jsonResponse = Gson().fromJson<ActionListTicketTypesResponseModel>(
                            response.toString(),
                            ActionListTicketTypesResponseModel::class.java)
                    successHandler(jsonResponse)
                })
                { error ->
                    errorHandler(error.toString(), error.message.toString())
                }
        BackendVolley.instance?.addToRequestQueue(jsonRequest, tag)
    }

    override fun actionCheckInTicket(
            basePath: String,
            weTicketsCode: String,
            ticketCode: String,
            force: Boolean,
            deviceName: String,
            successHandler: (response: ActionCheckInTicketResponseModel) -> Unit,
            errorHandler: (errorType: String, msg: String) -> Unit) {

        // Build 'normal' or 'force' url
        val requestUrl = ("$basePath$pathPrefix&") +
                if (!force) "action=check_in_code&code=$ticketCode"
                else "action=check_in_code_force&code=$ticketCode"

        val jsonRequest = JsonObjectRequest(Request.Method.GET,
                requestUrl,
                null,
                { response ->
                    val jsonResponse = Gson().fromJson<ActionCheckInTicketResponseModel>(
                            response.toString(),
                            ActionCheckInTicketResponseModel::class.java)
                    successHandler(jsonResponse)
                })
        { error ->
            errorHandler(error.toString(), error.message.toString())
        }
        BackendVolley.instance?.addToRequestQueue(jsonRequest, tag)
    }

    override fun actionCheckOutTicket(
            basePath: String,
            weTicketsCode: String,
            ticketCode: String,
            deviceName: String,
            successHandler: (response: ActionCheckOutTicketResponseModel) -> Unit,
            errorHandler: (errorType: String, msg: String) -> Unit) {

        val requestUrl = "action=check_out_code&code=$ticketCode"

        val jsonRequest = JsonObjectRequest(Request.Method.GET,
                requestUrl,
                null,
                { response ->
                    val jsonResponse = Gson().fromJson<ActionCheckOutTicketResponseModel>(
                            response.toString(),
                            ActionCheckOutTicketResponseModel::class.java)
                    successHandler(jsonResponse)
                })
        { error ->
            errorHandler(error.toString(), error.message.toString())
        }
        BackendVolley.instance?.addToRequestQueue(jsonRequest, tag)
    }
}