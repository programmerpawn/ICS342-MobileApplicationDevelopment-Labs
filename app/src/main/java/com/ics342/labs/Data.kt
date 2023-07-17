package com.ics342.labs

// Add the data classes here.
import com.squareup.moshi.Json

data class DataItems(
    @Json(name = "id") val id: Int,
    @Json(name = "give_name") val giveName: String,
    @Json(name = "family_name") val familyName: String,
    @Json(name = "age") val age: Int,
)