package com.gojuno.commander.android

data class AdbDevice(
        val id: String,
        val online: Boolean
) {
    val isEmulator = id.startsWith("emulator-")
}
