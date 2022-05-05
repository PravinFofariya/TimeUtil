package com.example.timeutil

fun getDuration(duration: Int): String {
    var hours = 0
    var min = 0
    var sec = 0
    if (duration != 0) {
        hours = (duration / (1000 * 60 * 60)) % 24
        min = (duration / (1000 * 60)) % 60
        sec = (duration / 1000) % 60
    }
    return if (hours != 0)
        String.format("%02d:%02d:%02d", hours, min, sec)
    else
        String.format("%02d:%02d", min, sec)
}