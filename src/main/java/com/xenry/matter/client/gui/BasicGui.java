package com.xenry.matter.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

/**
 * mod1 created by Henry Jake on December 19, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public class BasicGui extends GuiScreen {

    public static int GUI_ID = 20;

    private GuiButton buttonA, closeButton;

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void initGui() {
        this.buttonList.add(this.buttonA = new GuiButton(0, this.width / 2 - 100, this.height / 2 - 24, "Button A"));
        this.buttonList.add(this.closeButton = new GuiButton(1, this.width / 2 - 100, this.height / 2 + 4, "Close"));
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button == this.buttonA){
            // todo do this
        }
        if(button == this.closeButton){
            this.mc.displayGuiScreen(null);
            if(this.mc.currentScreen == null)
                this.mc.setIngameFocus();
        }
    }

}
