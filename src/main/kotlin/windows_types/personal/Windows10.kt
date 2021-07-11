package windows_types.personal

import windows_types.*

class Windows10(val edition: Edition) : Windows(
    latestBuild = 19042,
    releaseVersion = WindowsReleaseVersion(isNT = true, 10.0f),
    // Extended support ends on 2029 of latest LTSC
    unsupported = false,
) {
    enum class Edition {
        HOME,
        SURFACE_X,
        PRO,
        PRO_FOR_WORKSTATIONS,
        PRO_EDUCATION,
        ENTERPRISE,
        ENTERPRISE_LTSC,
        EDUCATION,
        IOT_CORE,
        IOT_ENTERPRISE,
        S,
    }
}