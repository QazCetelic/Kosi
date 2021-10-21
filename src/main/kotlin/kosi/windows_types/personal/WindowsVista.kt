package kosi.windows_types.personal

import kosi.windows_types.Windows
import kosi.windows_types.WindowsReleaseVersion

class WindowsVista(val edition: Edition): Windows(
    latestBuild = 6002,
    releaseVersion = WindowsReleaseVersion(isNT = true, 6.0f),
    unsupported = true,
) {
    enum class Edition {
        STARTER,
        HOME_BASIC,
        HOME_PREMIUM,
        BUSINESS,
        ENTERPRISE,
        ULTIMATE,
    }
}