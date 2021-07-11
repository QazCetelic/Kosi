package windows_types

import base_types.WindowsBased

abstract class Windows(
    val latestBuild: Int?,
    val releaseVersion: WindowsReleaseVersion,
    /**
     * Note, this includes **extended** support
     */
    val unsupported: Boolean,
) : WindowsBased()