import kosi.unix_types.bsd_types.BSD
import kosi.unix_types.bsd_types.NetBSD
import kosi.unix_types.linux_types.Linux
import kosi.windows_types.personal.Windows10

fun main() {
    when (val os = currentOS()) {
        is Linux -> {
            println("Tux")
            with(os.distro) {
                println(name)
                println(version)
            }
        }
        is NetBSD -> {
            println("Is this even used anymore?")
        }
        is BSD -> {
            println("This might be FreeBSD")
        }
        is Windows10 -> {
            val pro = when (os.edition) {
                Windows10.Edition.PRO -> true
                Windows10.Edition.PRO_EDUCATION -> true
                Windows10.Edition.PRO_FOR_WORKSTATIONS -> true
                else -> false
            }
        }
    }
}