package windows_types.personal

import windows_types.Windows
import windows_types.WindowsReleaseVersion

class WindowsNTOld : Windows(
    latestBuild = 1381,
    releaseVersion = WindowsReleaseVersion(isNT = true, 3.1f),
    unsupported = true,
)

/*
class WindowsNT4: Windows(
    latestBuild = 1381,
    releaseVersion = WindowsReleaseVersion(isNT = true, 4.0f),
    unsupported = true,
)


class WindowsNT3_51: Windows(
    releaseDate = LocalDate.of(1995, 5, 30),
    codeNames = listOf(),
    latestBuild = 1057,
    releaseVersion = WindowsReleaseVersion(isNT = true, 3.51f),
    unsupported = true,
)

class WindowsNT3_5: Windows(
    releaseDate = LocalDate.of(1994, 9, 21),
    codeNames = listOf("Daytona"),
    latestBuild = 807,
    releaseVersion = WindowsReleaseVersion(isNT = true, 3.5f),
    unsupported = true,
)

class WindowsNT3_2: Windows(
    releaseDate = LocalDate.of(1993, 11, 22),
    codeNames = listOf(),
    latestBuild = 153,
    releaseVersion = WindowsReleaseVersion(isNT = false, 3.2f),
    unsupported = true,
)

class WindowsNT3_1: Windows(
    releaseDate = LocalDate.of(1993, 7, 27),
    codeNames = listOf("Razzle"),
    latestBuild = 528,
    releaseVersion = WindowsReleaseVersion(isNT = true, 3.1f),
    unsupported = true,
)

*/