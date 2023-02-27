import android.media.Image
import com.example.snapchat.R

data class
Snap(val username: String,
       val timeSent: String, val SnapImageResource: Int, var opened : Boolean) {
    val stringOpened : String
    get() =
        if (opened)
            "opened"
    else
        "received"
    val ImageResourceOpened : Int
        get() =
            if (opened)
                R.drawable.snapchat_opened
            else
                R.drawable.snapchat_sent
}
