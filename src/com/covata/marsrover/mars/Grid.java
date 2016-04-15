package com.covata.marsrover.mars;

/**
 * Represents the plateau which is in the form of a Grid.
 * Maintains the bounds of the Grid.
 * 
 * @author shreyas
 *
 */
public class Grid {
	
	private Cell topRightCell;
	private Cell bottomLeftCell = new Cell(0,0);
	
	public Grid(final int width,final int height) {
		this.topRightCell = new Cell(width, height);
	}

	/*
	 * Checks if the passed cell is a valid cell i.e. if it is
	 * within the bounds of this Grid. 
	 */
	public boolean isCellWithinGrid(Cell cell){
		return (cell.getX_pos()>=bottomLeftCell.getX_pos() && 
				cell.getY_pos()>=bottomLeftCell.getY_pos() && 
				cell.getX_pos()<=topRightCell.getX_pos() &&
				cell.getY_pos()<=topRightCell.getY_pos());
	}

}
