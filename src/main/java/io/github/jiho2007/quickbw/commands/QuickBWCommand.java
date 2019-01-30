package io.github.jiho2007.quickbw.commands;

import io.github.jiho2007.quickbw.QuickBW;
import io.github.jiho2007.quickbw.data.Mode;
import io.github.jiho2007.quickbw.utils.ColorCode;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ChatComponentText;

import java.util.Arrays;
import java.util.List;

public class QuickBWCommand implements ICommand {
	
	String usage = EnumChatFormatting.RED + "Usage: /" + this.getCommandName() + " <mode>";
	
    @Override
    public String getCommandName() {
        return "bw";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return this.usage;
    }

    @Override
    public List<String> getCommandAliases() {
        return Arrays.asList("quickbw", "bedwars");
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		if(args.length == 1) {
			Mode d = new Mode();
			String m = args[0];
			if(d.dict.containsKey(m)) {
				Minecraft.getMinecraft().thePlayer.sendChatMessage(d.getMode(m));
				return;
			}
		}
		Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(this.colormsg));
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    @Override
    public int compareTo(ICommand o) {
        return 0;
    }
}
