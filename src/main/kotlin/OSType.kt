import java.awt.GraphicsEnvironment

abstract class OSType(
    val name: String = System.getProperty("os.name"),
    val headless: Boolean = GraphicsEnvironment.isHeadless()
) {
    override fun toString() = name
}