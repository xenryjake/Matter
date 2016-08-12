package com.xenry.matter.client.bind;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

/**
 * mod1 created by Henry Jake on December 19, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class BasicKeybinds {

    public static KeyBinding PING;

    public BasicKeybinds init(){
        ClientRegistry.registerKeyBinding(PING = new KeyBinding("key.matter.ping", Keyboard.KEY_P, "key.categories.matter"));
        return this;
    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if(PING.isPressed())
            Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Pong!"));
    }

}
