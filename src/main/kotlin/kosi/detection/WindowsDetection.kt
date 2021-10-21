package kosi.detection

import kosi.OSType
import kosi.base_types.Unknown
import kosi.windows_types.personal.*

internal fun windowsDetection(): OSType {
    // Returns null if it isn't actually windows
    if (System.getProperty("os.name").startsWith("Windows").not()) return Unknown()

    return when (System.getProperty("os.name")) {
        "Windows 95" -> Windows95(Windows95.Edition.STANDARD)
        "Windows 98" -> Windows98(Windows98.Edition.FIRST_EDITION)
        "Windows XP" -> WindowsXP(WindowsXP.Edition.HOME)
        "Windows Vista" -> WindowsVista(WindowsVista.Edition.HOME_BASIC)
        "Windows 7" -> Windows7(Windows7.Edition.HOME_BASIC)
        "Windows 8" -> Windows8(Windows8.Edition.STANDARD)
        // TODO consider adding Windows 8 as a separate class
        "Windows 8.1" -> Windows8(Windows8.Edition.STANDARD)
        "Windows 10" -> Windows10(Windows10.Edition.HOME)
        else -> Unknown()
    }
}