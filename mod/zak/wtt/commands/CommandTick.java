package mod.zak.wtt.commands;

import cpw.mods.fml.common.ObfuscationReflectionHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.Timer;

public class CommandTick extends CommandBase {

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return "tick";
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void processCommand(ICommandSender icommandsender, String[] astring) {
		// TODO Auto-generated method stub
		if(astring.length > 0){
			ObfuscationReflectionHelper.setPrivateValue(Timer.class, ((Timer)ObfuscationReflectionHelper.getPrivateValue(Minecraft.class, Minecraft.getMinecraft(), "timer")), Float.parseFloat(func_96332_d(icommandsender, astring[0])), "ticksPerSecond");
		}
		
	}



}
