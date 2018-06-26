package wetickets.wescanapp.domain.models.json

import java.io.*

data class StatsModel(
        val total : Int,
        val checked_in : Int,
        val checked_out : Int)
    : Serializable