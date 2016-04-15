package com.covata.marsrover.commands;

import com.covata.marsrover.rover.Rover;

public class MoveCommand implements ICommand{

	public void execute(Rover rover) {
		rover.move();
	}

}
