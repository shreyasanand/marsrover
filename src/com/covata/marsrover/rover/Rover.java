package com.covata.marsrover.rover;

import java.util.List;

import com.covata.marsrover.commands.CommandHelper;
import com.covata.marsrover.commands.ICommand;
import com.covata.marsrover.mars.Cell;
import com.covata.marsrover.mars.Grid;

/**
 * Represents the rover which can move around the Grid. 
 * 
 * @author shreyas
 * 
 */
public class Rover {
	
	private Grid grid;
	private Cell currentCell;
	private Direction currentDirection;
	
	public Rover(final Grid grid, final Cell cell, final Direction direction){
		this.grid = grid;
		this.currentCell = cell;
		this.currentDirection = direction;
	}
	
	public void processCommands(final String commandString) {
		
		List<ICommand> commands = CommandHelper.getCommandList(commandString);
		
		for(ICommand command: commands){
			command.execute(this);
		}
	}
	
	public void printPosition() {
		System.out.println(currentCell.toString()+" "+currentDirection.toString());
	}
	
	public void rotateRight() {
        this.currentDirection = this.currentDirection.right();
    }

    public void rotateLeft() {
        this.currentDirection = this.currentDirection.left();
    }

    public void move() {
        Cell newCell = new Cell(currentCell.getX_pos()+currentDirection.getxAxisIncrementValue(), 
        						currentCell.getY_pos()+currentDirection.getyAxisIncrementValue());

        if(grid.isCellWithinGrid(newCell)){
            currentCell = newCell;
        }
    }
}
