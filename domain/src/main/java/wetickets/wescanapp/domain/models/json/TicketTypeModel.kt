package wetickets.wescanapp.domain.models.json

import java.io.Serializable

data class TicketTypeModel(
        val ticket_name : String,
        val ticket_id : String,
        val event_name : String,
        val shop_name : String)
    : Serializable