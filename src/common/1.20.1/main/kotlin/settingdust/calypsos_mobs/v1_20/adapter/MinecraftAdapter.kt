package settingdust.calypsos_mobs.v1_20.adapter

import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.ItemStack
import settingdust.calypsos_mobs.adapter.MinecraftAdapter

class MinecraftAdapter : MinecraftAdapter {
    override fun id(namespace: String, path: String) = ResourceLocation(namespace, path)

    override fun ItemStack.isSameItemSameComponents(other: ItemStack) = ItemStack.isSameItemSameTags(this, other)
}