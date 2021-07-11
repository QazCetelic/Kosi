package windows_types.personal

import windows_types.Windows
import windows_types.WindowsReleaseVersion

class Windows98(val edition: Edition): Windows(
    latestBuild = 2222,
    releaseVersion = WindowsReleaseVersion(isNT = false, 5.0f),
    unsupported = true,
) {
    enum class Edition {
        FIRST_EDITION,
        SECOND_EDITION,
    }
}