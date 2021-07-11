package detection

import OSType
import base_types.Unknown
import windows_types.personal.*

internal fun windowsDetection(): OSType {
    // Returns null if it isn't actually windows
    if (System.getProperty("os.name").startsWith("Windows").not()) return Unknown()

    return when (System.getProperty("os.name")) {
        "Windows 95" -> windows_types.personal.Windows95(Windows95.Edition.STANDARD)
        "Windows 98" -> windows_types.personal.Windows98(Windows98.Edition.FIRST_EDITION)
        "Windows XP" -> windows_types.personal.WindowsXP(WindowsXP.Edition.HOME)
        "Windows Vista" -> windows_types.personal.WindowsVista(WindowsVista.Edition.HOME_BASIC)
        "Windows 7" -> windows_types.personal.Windows7(Windows7.Edition.HOME_BASIC)
        "Windows 8" -> windows_types.personal.Windows8(Windows8.Edition.STANDARD)
        // TODO consider adding Windows 8 as a separate class
        "Windows 8.1" -> windows_types.personal.Windows8(Windows8.Edition.STANDARD)
        "Windows 10" -> Windows10(Windows10.Edition.HOME)
        else -> Unknown()
    }
}