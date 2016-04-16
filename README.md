#MARS ROVER Problem

- A squad of robotic rovers are to be landed by NASA on a plateau on Mars. This plateau, which is curiously rectangular, must be navigated by the rovers so that their on-board cameras can get a complete view of the surrounding terrain to send back to Earth.
- A rover's position and location is represented by a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points. 
- The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.
- In order to control a rover, NASA sends a simple string of letters. The possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from its current spot. 'M' means move forward one grid point, and maintain the same heading.
- Assume that the square directly North from (x, y) is (x, y+1).

##INPUT:
- The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 0,0.
- The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input. The first line gives the rover's position, and the second line is a series of instructions telling the rover how to explore the plateau.
- The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover's orientation.
- Each rover will be finished sequentially, which means that the second rover won't start to move until the first one has finished moving.

##OUTPUT
The output for each rover should be its final co-ordinates and heading.


###Test Input:
5 5 <br />
1 2 N <br />
LMLMLMLMM <br />
3 3 E <br />
MMRMMRMRRM <br />
###Expected Output:
1 3 N <br />
5 1 E <br />

##Design

> The Plateau/Grid on Mars <br />
    - The plateau is divided into a grid format represented by the Grid class. <br />
    - This Grid contains cells which is represented by the Cell class. <br />
    - The grid has bounds which is represented by bottom left and top right cells.
    
> The Rovers <br />
    - The rovers are represented by the Rover class. <br />
    - Each rover has a position which is represented by a Cell object. <br />
    - Each rover has a direction which is represented by a Direction enum. <br />
    - The RoverSquad object maintains a list of rovers and deploys them on the grid. <br />
    - The rovers can move around the grid using functions like: rotateLeft, rotateRight, move. <br />
    - The rovers can be moved by passing a set of commands to the processCommands function. <br />
    
> Direction
    - The 4 possible directions North, South, East, West are represented by the enum Direction. <br />
    - Each direction has left and right methods to return the direction the rover points to when it is called. <br />
    - Also each direction has two variables to keep track of the increment values for the axes if 
      the rover moves forward in that direction. 
    
![alt tag](https://raw.github.com/shreyasanand/marsrover/master/images/Marsrover.jpg)
    
> The Commands <br />
    - The commands to move the rover on the grid is implemented using the Command pattern. <br />
    - The ICommand interface represents a generic contract for any kind of command given to the rover. <br />
    - Currently there are 3 kinds of concrete commands - <br />
        * MoveCommand: Moves the rover forward to the next cell <br />
        * RotateRightCommand: Turns the rover right <br />
        * RotateLeftCommand: Turns the rover left

![alt tag](https://raw.github.com/shreyasanand/marsrover/master/images/CommandPattern.jpg)
