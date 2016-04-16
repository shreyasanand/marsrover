package com.covata.marsrover.test.commands;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.covata.marsrover.commands.CommandHelper;
import com.covata.marsrover.commands.ICommand;
import com.covata.marsrover.commands.MoveCommand;
import com.covata.marsrover.commands.RotateLeftCommand;
import com.covata.marsrover.commands.RotateRightCommand;

public class CommandHelperTest {

	@Test
	public void testGetCommandList() {
		//Given
		String commands = "LMR";
		
		//When
		List<ICommand> command_list = CommandHelper.getCommandList(commands);
		
		//Then
        Assert.assertTrue(command_list.get(0) instanceof RotateLeftCommand);
        Assert.assertTrue(command_list.get(1) instanceof MoveCommand);
        Assert.assertTrue(command_list.get(2) instanceof RotateRightCommand);
        
	}

}
