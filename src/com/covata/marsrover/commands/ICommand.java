package com.covata.marsrover.commands;

import com.covata.marsrover.rover.Rover;

public interface ICommand {
	
	public void execute(final Rover rover);

}
