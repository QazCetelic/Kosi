```kotlin
fun main() {
    when (val os = currentOS()) {
        is Linux -> {
            println("Tux")
            // It's a separate class and therefore has special properties,
            // these are accessible using smart-casts as you can see here with 'distro'
            os.distro.run {
                println(name)       // e.g. 'Pop!_OS'
                println(version)    // e.g. '20.10'
            }
        }
        // You can check for a certain os…
        is NetBSD -> {
            println("Is this even used anymore?")
        }
        // …and then it's type to only get others of the same type
        is BSD -> {
            println("This might be FreeBSD")
        }
        // It uses type checking so you can be less specific like here…
        is UnixBased -> {
            println("This could be Mac OS")
            // …and more specific like here
            if (os is MacOS) println("Yes it is")
        }
        // You can also check for 'Windows' if you just want to know if it's windows
        is Windows10 -> {
            // Checks if the user uses a pro edition of windows
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
- Add macOS (requires detection and testing)
- Add Android (requires detection and testing)
- ~~Add Linux distro detection~~ ✓
- Add Windows edition detection
- Add backup Linux distro detection in case systemd isn't installed
- Add Windows server OS'
- Add headless detection?
- ~~Add Haiku?~~ 𐄂