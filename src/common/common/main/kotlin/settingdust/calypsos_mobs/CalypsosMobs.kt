package settingdust.calypsos_mobs

import org.apache.logging.log4j.LogManager
import settingdust.calypsos_mobs.adapter.MinecraftAdapter
import settingdust.calypsos_mobs.util.ServiceLoaderUtil

object CalypsosMobs {
    const val ID = "calypsos_mobs"

    val LOGGER = LogManager.getLogger()

    init {
        ServiceLoaderUtil.defaultLogger = LOGGER
    }

    fun id(path: String) = MinecraftAdapter.id(ID, path)
}