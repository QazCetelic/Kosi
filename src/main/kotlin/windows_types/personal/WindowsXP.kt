package windows_types.personal

import windows_types.Windows
import windows_types.WindowsReleaseVersion

class WindowsXP(val edition: Edition) : Windows(
    latestBuild = 2600,
    releaseVersion = WindowsReleaseVersion(isNT = true, 5.1f),
    unsupported = true,
) {
    enum class Edition {
        STARTER,
        HOME,
        PROFESSIONAL,
        X64BIT,
        EMBEDDED,
        FUNDAMENTALS,
    }
}