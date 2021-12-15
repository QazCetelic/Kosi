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
            println("This is a modern version of Windows")
        }
        is Windows -> {
            println("This could be Windows 8 or 7 but also something ancient like ME")
            if (os is WindowsME) println("It actually is")
        }
    }
}
```

## TODO

- [x] Linux Support
- [x] Windows Support
- [x] BSD Support
- [x] MacOS Support (requires detection and testing)
- [x] Android Support (requires detection and testing)
- [x] Linux distro detection
- [ ] Windows edition detection
- [ ] Backup Linux distro detection in case systemd isn't installed
- [ ] Windows server OS' support
- [ ] Headless detection
- [x] Haiku Support
- [ ] Testing - this is difficult because it needs to be executed on certain operating systems.
