package org.example.serialization

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JSON
import kotlin.jvm.JvmStatic

@Serializable
data class Foo(@SerialName("Bars") val Bars: List<String>? = null) {
    companion object {
        @JvmStatic
        fun parse(jsonText: String): Foo = JSON.nonstrict.parse(serializer(), jsonText)
    }
}
