package unix_types.linux_types

import base_types.LinuxBased
import java.io.File

class Linux: LinuxBased() {
    val distro = Distro()
    class Distro {
        var name: String? = null
        var id: String? = null
        var version: String? = null
        var base: String? = null
        var site: String? = null
        init {
            try {
                File("/etc").listFiles()?.forEach { file ->
                    if (file.name.endsWith("-release")) {
                        val lines = file.readLines()
                        val pairs = lines.map { line ->
                            // 'NAME="ExampleName"' -> 'NAME' & '"ExampleName"'
                            line.split("=").map {
                                // '"ExampleName"' -> 'ExampleName'
                                it.removeSurrounding("\"")
                            }
                        }
                        for (pair in pairs) {
                            when (pair[0]) {
                                // Some entries do the same thing, I added both in case 1 is missing
                                "NAME" -> name = pair[1]
                                "VERSION" -> version = pair[1]
                                "ID" -> id = pair[1].toUpperCase()
                                "ID_LIKE" -> base = pair[1]
                                "VERSION_ID" -> version = pair[1]
                                "HOME_URL" -> site = pair[1]
                                "DISTRIB_ID" -> id = pair[1].toUpperCase()
                                "DISTRIB_RELEASE" -> version = pair[1]
                            }
                        }
                    }
                }
            }
            catch (_: Exception) {
                // TODO add backup method
            }
        }

        override fun toString() = "(Name: $name, Version: $version)"
    }
}