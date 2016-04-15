package com.covata.marsrover.rover;

import java.util.ArrayList;
import java.util.List;

import com.covata.marsrover.mars.Cell;
import com.covata.marsrover.mars.Grid;


public class RoverSquad {

	private List<Rover> squad = new ArrayList<Rover>();
	private Grid grid;
	
	public RoverSquad(final Grid grid){
		this.grid = grid;
	}
	
	public void deployRover(String position) {
		String[] roverPosition = position.split(" ");
		Cell initialCell = initCell(Integer.valueOf(roverPosition[0]), Integer.valueOf(roverPosition[1]));
		Direction initialDirection = Direction.valueOf(roverPosition[2]);
		this.squad.add(new Rover(this.grid, initialCell, initialDirection));
	}
	
	public static Cell initCell(int x, int y){
		return new Cell(x,y);
	}
	
	public List<Rover> getSquad() {
		return squad;
	}

	public void setSquad(List<Rover> squad) {
		this.squad = squad;
	}
}
