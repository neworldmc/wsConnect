package cn.newinfinideas.nwmc.wsconnect
import net.fabricmc.api.ModInitializer

@Suppress("UNUSED")
object Main: ModInitializer {
    private const val MOD_ID = "ws_connect"
    override fun onInitialize() {
        println("Example mod has been initialized.")
    }
}