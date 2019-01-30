package io.github.jiho2007.quickbw;

import io.github.jiho2007.quickbw.commands.QuickBWCommand;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = QuickBW.MODID, version = QuickBW.VERSION, acceptedMinecraftVersions="[1.8.9]")
public class QuickBW {

    public static final String MODID = "QuickBW";
    public static final String VERSION = "0.1";

    @Mod.Instance
    private static QuickBW instance;

    private boolean isOn = true;
    private int tickDelay = 20;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {}

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ClientCommandHandler.instance.registerCommand(new QuickBWCommand());
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setOn(boolean on) {
        this.isOn = on;
    }

    public int getTickDelay() {
        return this.tickDelay;
    }

    public void setTickDelay(int delay) {
        this.tickDelay = delay;
    }

    public static QuickBW getInstance() {
        return instance;
    }
}
