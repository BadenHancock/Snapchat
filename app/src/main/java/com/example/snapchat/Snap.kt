package com.example.snapchat

data class
Snap(
    val username: String,
    val timeSent: String,
    val SnapImageResource: Int,
    var isOpened : Boolean = false) {
    val stringOpened : String
    get() =
        if (isOpened)
            "opened"
    else
        "New Snap"

    var ImageResourceOpened : Int = 0
        get() =
            if (isOpened)
                R.drawable.snapchat_opened
            else
                R.drawable.snapchat_sent
}
