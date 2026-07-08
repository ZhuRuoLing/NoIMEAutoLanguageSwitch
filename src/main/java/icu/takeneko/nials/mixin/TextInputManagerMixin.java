package icu.takeneko.nials.mixin;

import com.mojang.blaze3d.platform.TextInputManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TextInputManager.class)
public class TextInputManagerMixin {

    @Inject(
        method = "tick",
        at = @At("HEAD"),
        cancellable = true
    )
    void handleTick(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(
        method = "setIMEInputMode",
        at = @At("HEAD"),
        cancellable = true
    )
    void handleSet(boolean value, CallbackInfo ci) {
        ci.cancel();
    }
}
