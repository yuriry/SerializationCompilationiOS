package org.example.serialization

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JSON
import kotlin.jvm.JvmStatic

@Serializable
data class Foo(val bar: String) {
    companion object {
        @JvmStatic
        fun parse(jsonText: String): Foo = JSON.parse(serializer(), jsonText)
    }
}
