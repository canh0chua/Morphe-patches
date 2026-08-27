package app.canh0chua.patches.viber

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.InstructionLocation.MatchAfterImmediately
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.literal
import app.morphe.patcher.methodCall
import app.morphe.patcher.opcode
import app.morphe.patcher.string
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.Opcode
import app.canh0chua.patches.shared.Constants.COMPATIBILITY_VIBER

/**
 * Disables all ad SDK initialization in Viber.
 * - Google AdMob (ca-app-pub-1265516644271351~7169993215)
 * - Facebook Audience Network
 * - Vungle
 * - AppHarbr
 * - Google Ad Services
 */
object MobileAdsInitFingerprint : Fingerprint(
    definingClass = "Lcom/google/android/gms/ads/MobileAds;",
    name = "initialize",
    accessFlags = listOf(),
    returnType = "Lcom/google/android/gms/ads/MobileAdsInitializeStatus;",
    parameters = listOf(
        "Landroid/content/Context;",
        "Lcom/google/android/gms/ads/MobileAdsInitializeCallback;",
    ),
    filters = listOf(
        methodCall(
            definingClass = "Landroid/content/Context;",
            name = "getApplicationContext",
        ),
        opcode(Opcode.INVOKE_STATIC),
        methodCall(
            definingClass = "Lcom/google/android/gms/ads/MobileAds;",
            name = "initialize",
        )
    )
)

val removeAdsPatch = bytecodePatch(
    name = "Remove Ads",
    description = "Disables all ad SDKs (AdMob, Facebook, Vungle, AppHarbr) in Viber.",
    default = true
) {
    compatibleWith(COMPATIBILITY_VIBER)
    execute {
        MobileAdsInitFingerprint.method.addInstructions(
            0,
            """
            return-void
            """
        )
    }
}