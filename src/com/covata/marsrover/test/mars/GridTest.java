package com.covata.marsrover.test.mars;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.covata.marsrover.mars.Cell;
import com.covata.marsrover.mars.Grid;

public class GridTest {

	@Test
	public void testIsCellWithinGrid() {
		//Given
		Grid grid = new Grid(5,5);
        
        //When
		Cell cell = new Cell(1,2);
		
		//Then
		Assert.assertTrue(grid.isCellWithinGrid(cell));
	}

	@Test
	public void testIsCellOutsideGrid() {
		//Given
		Grid grid = new Grid(5,5);
        
        //When
		Cell cell = new Cell(1,6);
		
		//Then
		Assert.assertFalse(grid.isCellWithinGrid(cell));
	}
}
