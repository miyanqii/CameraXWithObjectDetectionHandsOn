package jp.miyanqii.cameraxwithobjectdetectionhandson

import android.media.Image
import androidx.annotation.NonNull
import com.google.firebase.ml.vision.objects.FirebaseVisionObject

class DetectedObjects(
    rotationDegrees: Int,
    @NonNull image: Image,
    val objects: List<FirebaseVisionObject>
) {
    val imageWidth: Int
    val imageHeight: Int

    init {
        when (rotationDegrees) {
            90, 270 -> {
                imageWidth = image.height
                imageHeight = image.width
            }
            else -> {
                imageWidth = image.width
                imageHeight = image.height
            }
        }
    }
}
