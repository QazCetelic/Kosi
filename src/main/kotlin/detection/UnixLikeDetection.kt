package detection

import OSType
import base_types.Unknown
import neatlin.SystemInfo
import neatlin.processes.LinuxShell
import unix_types.Haiku
import unix_types.linux_types.Linux
import unix_types.bsd_types.*
import unix_types.bsd_types.mac_types.MacOS

internal fun unixLikeDetection(): OSType {
    val name = SystemInfo["os.name"] ?: ""
    if (name.contains("mac", ignoreCase = true)) return MacOS()

    val uname = LinuxShell.execute("uname").response.trim()
    // trim is required, otherwise the string ends with a '\n', messing up the when statement

    return when (uname) {
        "Linux"     -> Linux()              // TODO this is for debugging, replace with actual output
        "FreeBSD"   -> FreeBSD()            //
        "DragonFly" -> DragonFlyBSD()       //
        "NetBSD"    -> NetBSD()             // in case someone uses this dinosaur of an OS
        "OpenBSD"   -> OpenBSD()            //
        "Haiku"     -> Haiku()              // Just in case some weirdo uses OpenJDK on Haiku for some reason
        else        -> Unknown()            // TODO replace with actual output or exception
    }
}