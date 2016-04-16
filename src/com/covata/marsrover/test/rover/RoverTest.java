package com.covata.marsrover.test.rover;

import org.junit.Assert;
import org.junit.Test;

import com.covata.marsrover.mars.Cell;
import com.covata.marsrover.mars.Grid;
import com.covata.marsrover.rover.Direction;
import com.covata.marsrover.rover.Rover;

public class RoverTest {

	@Test
	public void testRotateLeft() {
		//Given
        Grid grid = new Grid(5,5);
        Cell initialPosition = new Cell(1,2);
        Rover rover = new Rover(grid, initialPosition, Direction.N);

        //When
        rover.rotateLeft();

        //Then
        Assert.assertEquals("1 2 W", rover.getCurrentPosition());
	}
	
	@Test
	public void testRotateRight() {
		//Given
        Grid grid = new Grid(5,5);
        Cell initialPosition = new Cell(1,2);
        Rover rover = new Rover(grid, initialPosition, Direction.N);

        //When
        rover.rotateRight();

        //Then
        Assert.assertEquals("1 2 E", rover.getCurrentPosition());
	}

	@Test
	public void testMove() {
		//Given
        Grid grid = new Grid(5,5);
        Cell initialPosition = new Cell(1,2);
        Rover rover = new Rover(grid, initialPosition, Direction.N);

        //When
        rover.move();

        //Then
        Assert.assertEquals("1 3 N", rover.getCurrentPosition());
	}
	
	@Test
	public void testProcessCommands() {
		//Given
		String commands = "RMLM";
		Grid grid = new Grid(5,5);
        Cell initialPosition = new Cell(0,0);
        Rover rover = new Rover(grid, initialPosition, Direction.N);
        
        //When
        rover.processCommands(commands);

        //Then
        Assert.assertEquals("1 1 N", rover.getCurrentPosition());
	}
}
