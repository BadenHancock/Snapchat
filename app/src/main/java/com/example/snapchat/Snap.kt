import android.media.Image
import com.example.snapchat.R

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
        "received"

    val ImageResourceOpened : Int
        get() =
            if (isOpened)
                R.drawable.snapchat_opened
            else
                R.drawable.snapchat_sent
}
