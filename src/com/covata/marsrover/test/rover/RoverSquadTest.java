package com.covata.marsrover.test.rover;

import org.junit.Assert;
import org.junit.Test;

import com.covata.marsrover.mars.Grid;
import com.covata.marsrover.rover.RoverSquad;

public class RoverSquadTest {

	@Test
	public void testDeployRover() {
		//Given
        Grid grid = new Grid(5,5);
        String position = "1 2 N";
        RoverSquad squad = new RoverSquad(grid);
        
        //When
        squad.deployRover(position);
        
        //Then
        Assert.assertTrue(squad.getSquad().size() == 1);
        Assert.assertEquals(position, squad.getSquad().get(0).getCurrentPosition());
	}

}
