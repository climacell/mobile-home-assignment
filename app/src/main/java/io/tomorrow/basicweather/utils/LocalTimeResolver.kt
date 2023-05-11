package io.tomorrow.basicweather.utils

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

object LocalTimeResolver {

    suspend fun resolve(timestampIsoString: String, timeZoneId: String): String {
        val timezone = TimeZone.of(timeZoneId)
        val localTime = Instant.parse(timestampIsoString).toLocalDateTime(timezone).time
        return "${localTime.hour}:${localTime.minute}"
    }
}
