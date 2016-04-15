package com.covata.marsrover.commands;

import java.util.ArrayList;
import java.util.List;

public class CommandHelper {
	
	/*
	 * Builds and returns a list of ICommands based on the passed command string
	 */
	public static List<ICommand> getCommandList(final String commandString) {
		List<ICommand> commands_list = new ArrayList<ICommand>();
		
		char[] commands_array = commandString.toCharArray();
		for(Character command: commands_array) {
			switch (Character.toUpperCase(command)) {
			case 'L':
				commands_list.add(new RotateLeftCommand());
				break;
			case 'R':
				commands_list.add(new RotateRightCommand());
				break;
			case 'M':
				commands_list.add(new MoveCommand());
				break;
			default:
				break;
			}
		}
		return commands_list;
	}

}
