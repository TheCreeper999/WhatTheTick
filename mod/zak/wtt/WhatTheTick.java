package mod.zak.wtt;

import mod.zak.wtt.commands.CommandTick;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "wtt", name = "What the tick", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class WhatTheTick {
	
	@Instance("wtt")
	public static WhatTheTick wttInstance;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
	}

 	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
 	
 	@EventHandler
	public void serverStart(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandTick());
	}
}
