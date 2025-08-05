package settingdust.calypsos_mobs.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.model.GeoModel;

@Mixin(GeoModel.class)
public interface GeoModelAccessor {
    @Accessor
    void setCurrentModel(BakedGeoModel model);
}
