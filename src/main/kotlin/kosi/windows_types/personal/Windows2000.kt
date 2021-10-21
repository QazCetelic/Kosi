package kosi.windows_types.personal

import kosi.windows_types.Windows
import kosi.windows_types.WindowsReleaseVersion

class Windows2000(val edition: Windows2000Edition): Windows(
    latestBuild = 2195,
    releaseVersion = WindowsReleaseVersion(isNT = true, 5.0f),
    unsupported = true,
) {
    enum class Windows2000Edition {
        STANDARD,
        PROFESSIONAL,
    }
}