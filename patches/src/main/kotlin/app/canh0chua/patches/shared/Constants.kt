package app.canh0chua.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

object Constants {
    val COMPATIBILITY_VIBER = Compatibility(
        name = "Viber",
        packageName = "com.viber.voip",
        apkFileType = ApkFileType.APK,
        appIconColor = 0xFF7360F2.toInt(),
        targets = listOf(
            AppTarget(version = null, isExperimental = true)
        )
    )
}