```kotlin
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
```

## TODO

- ~~Add Linux~~ ✓
- ~~Add Windows~~ ✓
- ~~Add BSD~~ ✓
- ~~Add macOS (requires detection and testing)~~
- Add Android (requires detection and testing)
- ~~Add Linux distro detection~~ ✓
- Add Windows edition detection
- Add backup Linux distro detection in case systemd isn't installed
- Add Windows server OS'
- Add headless detection?
- ~~Add Haiku?~~ 𐄂
- Write tests