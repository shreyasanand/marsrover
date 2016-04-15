package com.covata.marsrover.commands;

import com.covata.marsrover.rover.Rover;

public class RotateRightCommand implements ICommand{

	public void execute(Rover rover) {
		rover.rotateRight();
	}

}
