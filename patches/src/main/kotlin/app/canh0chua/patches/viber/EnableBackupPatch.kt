package app.canh0chua.patches.viber

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.canh0chua.patches.shared.Constants.COMPATIBILITY_VIBER

/**
 * Disables Viber's custom backup agent so that Android's system backup
 * (adb backup / Google Drive backup / local backup) can be used instead.
 *
 * Viber's backup rules (android_backup_rules.xml) exclude all data domains,
 * so this patch alone won't enable system backup. However, it prevents
 * Viber from intercepting backup/restore operations, which is the first
 * step toward enabling local backup.
 *
 * To fully enable local backup, users should also:
 * 1. Use `adb backup -apk com.viber.voip` to create a local backup
 * 2. Or modify the backup rules XML (not possible with Morphe patches)
 */
object ViberBackupAgentFingerprint : Fingerprint(
    definingClass = "Lcom/viber/backup/ViberBackupAgent;",
    name = "onBackup",
    accessFlags = listOf(),
    returnType = "V",
    parameters = listOf(
        "Landroid/os/ParcelFileDescriptor;",
        "Landroid/app/backup/BackupDataOutput;",
        "Landroid/os/ParcelFileDescriptor;",
    ),
    filters = emptyList()
)

val enableBackupPatch = bytecodePatch(
    name = "Enable Local Backup",
    description = "Disables Viber's custom backup agent so Android's system backup can be used for local backup/restore.",
    default = true
) {
    compatibleWith(COMPATIBILITY_VIBER)
    execute {
        ViberBackupAgentFingerprint.method.addInstructions(
            0,
            """
            return-void
            """
        )
    }
}