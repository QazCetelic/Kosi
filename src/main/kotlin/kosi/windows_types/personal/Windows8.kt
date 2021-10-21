package kosi.windows_types.personal

import kosi.windows_types.Windows
import kosi.windows_types.WindowsReleaseVersion

class Windows8(val edition: Edition): Windows(
    latestBuild = 19042,
    releaseVersion = WindowsReleaseVersion(isNT = true, 10.0f),
    // Extended support ends on 2023
    unsupported = false,
) {
    enum class Edition {
        STANDARD,
        PRO,
        ENTERPRISE,
        OEM,
    }
}