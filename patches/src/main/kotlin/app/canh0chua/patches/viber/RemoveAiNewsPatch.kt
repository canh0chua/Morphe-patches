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
 * Disables the AI News Brief feature in Viber.
 * - Hides the AI News tab from the bottom navigation bar
 * - Disables the AI News reminder broadcast receiver
 * - Removes the topics selection flow
 */
object AiNewsTabFingerprint : Fingerprint(
    definingClass = "Lcom/viber/voip/core/ui/widget/BottomTabView;",
    name = "setupTabs",
    accessFlags = listOf(),
    returnType = "V",
    parameters = listOf(
        "Ljava/util/List;",
    ),
    filters = listOf(
        // Match the call to add the AI News tab
        methodCall(
            definingClass = "Lcom/viber/voip/core/ui/widget/BottomTabView;",
            name = "addTab",
        ),
        // Match the AI News tab identifier
        string("ai_news_brief"),
    )
)

val removeAiNewsPatch = bytecodePatch(
    name = "Remove AI News",
    description = "Disables the AI News Brief feature and removes the AI News tab from Viber.",
    default = true
) {
    compatibleWith(COMPATIBILITY_VIBER)
    execute {
        AiNewsTabFingerprint.method.addInstructions(
            0,
            """
            return-void
            """
        )
    }
}