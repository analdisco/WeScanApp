package models.json

import java.io.Serializable

data class TicketModel(
        val id: Int,
        val inside: String,
        val code: String,
        val ticket_id: String,
        val check_done: String,
        val check_time: String,
        val device_name: String,
        val device_id: String,
        val deleted: String,
        val code_order: String,
        val visitor_name: String,
        val visitor_email: String,
        val ticket_name: String,
        val check_in_until_active: String,
        val check_in_until: String,
        val check_in_after_active: String,
        val check_in_after: String,
        val event_name: String,
        val shop_name: String)
    : Serializable