package com.covata.marsrover.commands;

import com.covata.marsrover.rover.Rover;

public class RotateLeftCommand implements ICommand{

	public void execute(Rover rover) {
		rover.rotateLeft();
	}

}
