package enums

import com.google.gson.annotations.SerializedName

enum class ApiErrorType(
        val titleResourceId: Int,
        val messageResourceId: Int)
{
    @SerializedName("too_late") TOO_LATE(0, 0),
    @SerializedName("not_found") NOT_FOUND(0,0),
    @SerializedName("already_inside") ALREADY_INSIDE(0, 0);
}