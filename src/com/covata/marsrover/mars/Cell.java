package com.covata.marsrover.mars;

/**
 * Represents a cell/position in the Grid.
 * 
 * @author shreyas
 *
 */
public class Cell {
	
	private int x_pos;
	private int y_pos;

	public Cell(int x_pos, int y_pos){
		this.x_pos = x_pos;
		this.y_pos = y_pos;
	}
	
	public int getX_pos() {
		return x_pos;
	}

	public void setX_pos(int x_pos) {
		this.x_pos = x_pos;
	}

	public int getY_pos() {
		return y_pos;
	}

	public void setY_pos(int y_pos) {
		this.y_pos = y_pos;
	}

	public String toString(){
		return this.x_pos+" "+this.y_pos;
	}
}
