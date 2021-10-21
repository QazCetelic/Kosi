package kosi.windows_types.personal

import kosi.windows_types.Windows
import kosi.windows_types.WindowsReleaseVersion

class Windows7(val edition: Edition) : Windows(
    latestBuild = 7601,
    releaseVersion = WindowsReleaseVersion(isNT = true, 6.1f),
    unsupported = true,
) {
    enum class Edition {
        STARTER,
        HOME_BASIC,
        HOME_PREMIUM,
        PROFESSIONAL,
        ENTERPRISE,
        ULTIMATE,
    }
}