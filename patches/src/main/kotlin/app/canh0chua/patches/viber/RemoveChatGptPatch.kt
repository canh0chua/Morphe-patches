package app.canh0chua.patches.viber

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.InstructionLocation.MatchAfterImmediately
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.literal
import app.morphe.patcher.methodCall
import app.morphe.patcher.opcode
import app.morphe.patcher.string
import app.morphe.patcher.patch.bytecodePatch
import app.canh0chua.patches.shared.Constants.COMPATIBILITY_VIBER

/**
 * Disables the ChatGPT integration in Viber.
 * - Hides the ChatGPT tab from the bottom navigation bar
 * - Disables the ChatGPT login flow
 * - Removes AI-branded search suggestions
 */
object ChatGptTabFingerprint : Fingerprint(
    definingClass = "Lcom/viber/voip/core/ui/widget/BottomTabView;",
    name = "setupTabs",
    accessFlags = listOf(),
    returnType = "V",
    parameters = listOf(
        "Ljava/util/List;",
    ),
    filters = listOf(
        // Match the call to add the ChatGPT tab
        methodCall(
            definingClass = "Lcom/viber/voip/core/ui/widget/BottomTabView;",
            name = "addTab",
        ),
        // Match the ChatGPT tab identifier
        string("chat_gpt"),
    )
)

val removeChatGptPatch = bytecodePatch(
    name = "Remove ChatGPT",
    description = "Disables the ChatGPT integration and removes the ChatGPT tab from Viber.",
    default = true
) {
    compatibleWith(COMPATIBILITY_VIBER)
    execute {
        ChatGptTabFingerprint.method.addInstructions(
            // Replace the entire method with a no-op
            0,
            """
            return-void
            """
        )
    }
}