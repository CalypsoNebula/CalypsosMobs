package settingdust.calypsos_mobs.adapter

import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.ItemStack
import settingdust.calypsos_mobs.util.ServiceLoaderUtil

interface MinecraftAdapter {
    companion object : MinecraftAdapter by ServiceLoaderUtil.findService()

    fun id(namespace: String, path: String): ResourceLocation

    fun ItemStack.isSameItemSameComponents(other: ItemStack): Boolean
}