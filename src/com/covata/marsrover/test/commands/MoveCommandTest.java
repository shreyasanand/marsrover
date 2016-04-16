package com.covata.marsrover.test.commands;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.covata.marsrover.commands.MoveCommand;
import com.covata.marsrover.mars.Cell;
import com.covata.marsrover.mars.Grid;
import com.covata.marsrover.rover.Direction;
import com.covata.marsrover.rover.Rover;

public class MoveCommandTest {

	@Test
	public void testMoveCommandMovesTheRover() {
		//Given
        MoveCommand command = new MoveCommand();
        Grid grid = new Grid(5,5);
        Cell initialPosition = new Cell(1,2);
        Direction initialDirection = Direction.N;
        Rover rover = new Rover(grid, initialPosition, initialDirection);

        //When
        command.execute(rover);

        //Then
        Assert.assertEquals("1 3 N", rover.getCurrentPosition());
	}

}
