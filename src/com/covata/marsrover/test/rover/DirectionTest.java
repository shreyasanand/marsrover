package com.covata.marsrover.test.rover;

import org.junit.Assert;
import org.junit.Test;

import com.covata.marsrover.rover.Direction;

public class DirectionTest {

	@Test
	public void testRightOfNorth() {
		//Given
        Direction north = Direction.N;

        //When
        Direction east = north.right();

        //Then
        Assert.assertEquals(Direction.E, east);
	}
	
	@Test
	public void testLeftOfNorth() {
		//Given
        Direction north = Direction.N;

        //When
        Direction west = north.left();

        //Then
        Assert.assertEquals(Direction.W, west);
	}
	
	@Test
	public void testRightOfSouth() {
		//Given
        Direction south = Direction.S;

        //When
        Direction west = south.right();

        //Then
        Assert.assertEquals(Direction.W, west);
	}
	
	@Test
	public void testLeftOfSouth() {
		//Given
        Direction south = Direction.S;

        //When
        Direction east = south.left();

        //Then
        Assert.assertEquals(Direction.E, east);
	}
	
	@Test
	public void testRightOfEast() {
		//Given
        Direction east = Direction.E;

        //When
        Direction south = east.right();

        //Then
        Assert.assertEquals(Direction.S, south);
	}
	
	@Test
	public void testLeftOfEast() {
		//Given
        Direction east = Direction.E;

        //When
        Direction north = east.left();

        //Then
        Assert.assertEquals(Direction.N, north);
	}
	
	@Test
	public void testRightOfWest() {
		//Given
        Direction west = Direction.W;

        //When
        Direction north = west.right();

        //Then
        Assert.assertEquals(Direction.N, north);
	}
	
	@Test
	public void testLeftOfWest() {
		//Given
        Direction west = Direction.W;

        //When
        Direction south = west.left();

        //Then
        Assert.assertEquals(Direction.S, south);
	}
	
	@Test
	public void testxAxisIncrementValueWhenNorth() {
		//Given
        Direction north = Direction.N;

        //When
        int xaxisIncrementValue = north.getxAxisIncrementValue();

        //Then
        Assert.assertEquals(0, xaxisIncrementValue);
	}
	
	@Test
	public void testyAxisIncrementValueWhenNorth() {
		//Given
        Direction north = Direction.N;

        //When
        int yaxisIncrementValue = north.getyAxisIncrementValue();

        //Then
        Assert.assertEquals(1, yaxisIncrementValue);
	}

	@Test
	public void testxAxisIncrementValueWhenSouth() {
		//Given
        Direction south = Direction.S;

        //When
        int xaxisIncrementValue = south.getxAxisIncrementValue();

        //Then
        Assert.assertEquals(0, xaxisIncrementValue);
	}
	
	@Test
	public void testyAxisIncrementValueWhenSouth() {
		//Given
        Direction south = Direction.S;

        //When
        int yaxisIncrementValue = south.getyAxisIncrementValue();

        //Then
        Assert.assertEquals(-1, yaxisIncrementValue);
	}
	
	@Test
	public void testxAxisIncrementValueWhenEast() {
		//Given
        Direction east = Direction.E;

        //When
        int xaxisIncrementValue = east.getxAxisIncrementValue();

        //Then
        Assert.assertEquals(1, xaxisIncrementValue);
	}
	
	@Test
	public void testyAxisIncrementValueWhenEast() {
		//Given
        Direction east = Direction.E;

        //When
        int yaxisIncrementValue = east.getyAxisIncrementValue();

        //Then
        Assert.assertEquals(0, yaxisIncrementValue);
	}
	
	@Test
	public void testxAxisIncrementValueWhenWest() {
		//Given
        Direction west = Direction.W;

        //When
        int xaxisIncrementValue = west.getxAxisIncrementValue();

        //Then
        Assert.assertEquals(-1, xaxisIncrementValue);
	}
	
	@Test
	public void testyAxisIncrementValueWhenWest() {
		//Given
		Direction west = Direction.W;

        //When
        int yaxisIncrementValue = west.getyAxisIncrementValue();

        //Then
        Assert.assertEquals(0, yaxisIncrementValue);
	}
}
