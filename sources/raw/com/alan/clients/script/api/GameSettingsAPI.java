/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package com.alan.clients.script.api;

import com.alan.clients.script.api.API;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class GameSettingsAPI
extends API {
    public boolean isKeyBindForwardDown() {
        return GameSettingsAPI.MC.aIY.chm.Re();
    }

    public boolean isKeyBindBackDown() {
        return GameSettingsAPI.MC.aIY.cho.Re();
    }

    public boolean isKeyBindLeftDown() {
        return GameSettingsAPI.MC.aIY.chn.Re();
    }

    public boolean isKeyBindRightDown() {
        return GameSettingsAPI.MC.aIY.chp.Re();
    }

    public boolean isKeyBindJumpDown() {
        return GameSettingsAPI.MC.aIY.chq.Re();
    }

    public boolean isKeyBindSneakDown() {
        return GameSettingsAPI.MC.aIY.chr.Re();
    }

    public boolean isKeyBindAttackDown() {
        return GameSettingsAPI.MC.aIY.chw.Re();
    }

    public boolean isKeyBindUseItemDown() {
        return GameSettingsAPI.MC.aIY.chu.Re();
    }

    public boolean isKeyBindDropDown() {
        return GameSettingsAPI.MC.aIY.chv.Re();
    }

    public boolean isKeyBindInventoryDown() {
        return GameSettingsAPI.MC.aIY.cht.Re();
    }

    public boolean isKeyBindChatDown() {
        return GameSettingsAPI.MC.aIY.chy.Re();
    }

    public boolean isKeyBindPlayerListDown() {
        return GameSettingsAPI.MC.aIY.chz.Re();
    }

    public boolean isKeyBindCommandDown() {
        return GameSettingsAPI.MC.aIY.chA.Re();
    }

    public boolean isKeyBindScreenshotDown() {
        return GameSettingsAPI.MC.aIY.chB.Re();
    }

    public boolean isKeyBindTogglePerspectiveDown() {
        return GameSettingsAPI.MC.aIY.chC.Re();
    }

    public boolean isKeyBindSmoothCameraDown() {
        return GameSettingsAPI.MC.aIY.chD.Re();
    }

    public boolean isKeyBindFullscreenDown() {
        return GameSettingsAPI.MC.aIY.chE.Re();
    }

    public boolean isKeyBindSpectatorOutlinesDown() {
        return GameSettingsAPI.MC.aIY.chF.Re();
    }

    public void setKeyBindForward(boolean bl2) {
        GameSettingsAPI.MC.aIY.chm.ay(bl2);
    }

    public void setKeyBindBack(boolean bl2) {
        GameSettingsAPI.MC.aIY.cho.ay(bl2);
    }

    public void setKeyBindLeft(boolean bl2) {
        GameSettingsAPI.MC.aIY.chn.ay(bl2);
    }

    public void setKeyBindRight(boolean bl2) {
        GameSettingsAPI.MC.aIY.chp.ay(bl2);
    }

    public void setKeyBindJump(boolean bl2) {
        GameSettingsAPI.MC.aIY.chq.ay(bl2);
    }

    public void setKeyBindSneak(boolean bl2) {
        GameSettingsAPI.MC.aIY.chr.ay(bl2);
    }

    public void setKeyBindAttack(boolean bl2) {
        GameSettingsAPI.MC.aIY.chw.ay(bl2);
    }

    public void setKeyBindUseItem(boolean bl2) {
        GameSettingsAPI.MC.aIY.chu.ay(bl2);
    }

    public void setKeyBindDrop(boolean bl2) {
        GameSettingsAPI.MC.aIY.chv.ay(bl2);
    }

    public void setKeyBindInventory(boolean bl2) {
        GameSettingsAPI.MC.aIY.cht.ay(bl2);
    }

    public void setKeyBindChat(boolean bl2) {
        GameSettingsAPI.MC.aIY.chy.ay(bl2);
    }

    public void setKeyBindPlayerList(boolean bl2) {
        GameSettingsAPI.MC.aIY.chz.ay(bl2);
    }

    public void setKeyBindCommand(boolean bl2) {
        GameSettingsAPI.MC.aIY.chA.ay(bl2);
    }

    public void setKeyBindScreenshot(boolean bl2) {
        GameSettingsAPI.MC.aIY.chB.ay(bl2);
    }

    public void setKeyBindTogglePerspective(boolean bl2) {
        GameSettingsAPI.MC.aIY.chC.ay(bl2);
    }

    public void setKeyBindSmoothCamera(boolean bl2) {
        GameSettingsAPI.MC.aIY.chD.ay(bl2);
    }

    public void setKeyBindFullscreen(boolean bl2) {
        GameSettingsAPI.MC.aIY.chE.ay(bl2);
    }

    public void setKeyBindSpectatorOutlines(boolean bl2) {
        GameSettingsAPI.MC.aIY.chF.ay(bl2);
    }

    public boolean isKeyDown(int n2) {
        return Keyboard.isKeyDown((int)n2);
    }

    public boolean isMouseDown(int n2) {
        return Mouse.isButtonDown((int)n2);
    }
}

