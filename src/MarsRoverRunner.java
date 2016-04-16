import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.covata.marsrover.mars.Grid;
import com.covata.marsrover.rover.Rover;
import com.covata.marsrover.rover.RoverSquad;


public class MarsRoverRunner {

	public static void main(String[] args) {
	
		String position, commands, firstLine;
		System.out.println("Enter the input file path");
		Scanner sc = new Scanner(System.in);
		String inputFilePath = sc.next();
		List<String> command_list = new ArrayList<String>();
		try {
			// Read the file
			BufferedReader inputFile = new BufferedReader(new FileReader(inputFilePath));
			
			//Get the grid size from the first line
			firstLine = inputFile.readLine();
			
			Grid marsGrid = initGrid(firstLine);
			RoverSquad roverSquad = new RoverSquad(marsGrid);
			
			// Read two lines at a time to deploy the rovers and store their commands 
			while((position = inputFile.readLine())!=null 
					&& (commands = inputFile.readLine())!=null ){
				roverSquad.deployRover(position);
				command_list.add(commands);
			}
			
			// Run the commands on the rovers
			List<Rover> rovers = roverSquad.getSquad();
			for(int roverCount = 0; roverCount < rovers.size(); ++roverCount){
				Rover rover = rovers.get(roverCount);
				rover.processCommands(command_list.get(roverCount));
				System.out.println(rover.getCurrentPosition());
			}
			
			inputFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Grid initGrid(String firstLine) {
		String[] gridSizeString = firstLine.split(" ");
		return new Grid(Integer.valueOf(gridSizeString[0]), 
						Integer.valueOf(gridSizeString[1]));
	}

}
