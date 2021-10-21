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