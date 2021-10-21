package kosi.windows_types.personal

import kosi.windows_types.Windows
import kosi.windows_types.WindowsReleaseVersion

class WindowsOld : Windows(
    latestBuild = 300,
    releaseVersion = WindowsReleaseVersion(isNT = false, 3.1f),
    unsupported = true,
)

/*
class WindowsForWorkgroups3_11: Windows(
    releaseDate = LocalDate.of(1993, 11, 8),
    codeNames = listOf("Snowball"),
    latestBuild = 300,
    releaseVersion = WindowsReleaseVersion(isNT = false, 3.11f),
    unsupported = true,
)

class Windows3_0: Windows(
    releaseDate = LocalDate.of(1990, 5, 22),
    codeNames = listOf(),
    latestBuild = null,
    releaseVersion = WindowsReleaseVersion(isNT = false, 3.0f),
    unsupported = true,
)

class Windows2_11: Windows(
    releaseDate = LocalDate.of(1989, 3, 13),
    codeNames = listOf(),
    latestBuild = null,
    releaseVersion = WindowsReleaseVersion(isNT = false, 2.11f),
    unsupported = true,
)

class Windows2_10: Windows(
    releaseDate = LocalDate.of(1988, 5, 27),
    codeNames = listOf(),
    latestBuild = null,
    releaseVersion = WindowsReleaseVersion(isNT = false, 2.10f),
    unsupported = true,
)

class Windows2_03: Windows(
    releaseDate = LocalDate.of(1987, 12, 9),
    codeNames = listOf(),
    latestBuild = null,
    releaseVersion = WindowsReleaseVersion(isNT = false, 2.03f),
    unsupported = true,
)

class Windows1_04: Windows(
    releaseDate = LocalDate.of(1987, 12, 9),
    codeNames = listOf(),
    latestBuild = null,
    releaseVersion = WindowsReleaseVersion(isNT = false, 2.03f),
    unsupported = true,
)

class Windows3_1: Windows(
    releaseDate = LocalDate.of(1992, 4, 6),
    codeNames = listOf(),
    latestBuild = 103,
    releaseVersion = WindowsReleaseVersion(isNT = false, 3.1f),
    unsupported = true,
)
 */