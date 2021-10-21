package kosi.windows_types

import kosi.base_types.WindowsBased

abstract class Windows(
    val latestBuild: Int?,
    val releaseVersion: WindowsReleaseVersion,
    /**
     * Note, this includes **extended** support
     */
    val unsupported: Boolean,
) : WindowsBased()