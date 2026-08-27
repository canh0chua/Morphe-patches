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
 * Disables the Viber Pay feature in Viber.
 * - Hides the Viber Pay tab from the bottom navigation bar
 * - Disables the standalone payment flow
 */
object ViberPayTabFingerprint : Fingerprint(
    definingClass = "Lcom/viber/voip/core/ui/widget/BottomTabView;",
    name = "setupTabs",
    accessFlags = listOf(),
    returnType = "V",
    parameters = listOf(
        "Ljava/util/List;",
    ),
    filters = listOf(
        // Match the call to add the Viber Pay tab
        methodCall(
            definingClass = "Lcom/viber/voip/core/ui/widget/BottomTabView;",
            name = "addTab",
        ),
        // Match the Viber Pay tab identifier
        string("viber_pay"),
    )
)

val removeViberPayPatch = bytecodePatch(
    name = "Remove Viber Pay",
    description = "Disables the Viber Pay feature and removes the payment tab from Viber.",
    default = true
) {
    compatibleWith(COMPATIBILITY_VIBER)
    execute {
        ViberPayTabFingerprint.method.addInstructions(
            0,
            """
            return-void
            """
        )
    }
}