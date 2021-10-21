package kosi.windows_types.personal

import kosi.windows_types.Windows
import kosi.windows_types.WindowsReleaseVersion

class WindowsME: Windows(
    latestBuild = 3000,
    releaseVersion = WindowsReleaseVersion(isNT = false, 4.9f),
    unsupported = true,
)