package windows_types.personal

import windows_types.Windows
import windows_types.WindowsReleaseVersion

class Windows95(val edition: Edition): Windows(
    latestBuild = 950,
    releaseVersion = WindowsReleaseVersion(isNT = false, 4.0f),
    unsupported = true,
) {
    enum class Edition {
        STANDARD,
        SP1,
        OSR1,
        OSR2,
        USB,
        OSR2_1,
        OSR2_5,
    }
}