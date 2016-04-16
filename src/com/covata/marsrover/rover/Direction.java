package com.covata.marsrover.rover;

/**
 * Enum that represents the direction of the rover.
 * Each direction has left and right methods to return the direction the rover points to
 * when it is called. Also each direction has two variables to keep track of the 
 * increment values for the axes if the rover moves forward in that direction.
 * 
 * @author shreyas
 *
 */
public enum Direction {
	
	N(0,1) {

		@Override
		public Direction right() {
			return E;
		}

		@Override
		public Direction left() {
			return W;
		}
		
	},
	S(0,-1) {

		@Override
		public Direction right() {
			return W;
		}

		@Override
		public Direction left() {
			return E;
		}
		
	},
	E(1,0) {

		@Override
		public Direction right() {
			return S;
		}

		@Override
		public Direction left() {
			return N;
		}
		
	},
	W(-1,0) {

		@Override
		public Direction right() {
			return N;
		}

		@Override
		public Direction left() {
			return S;
		}
		
	};
	
	private final int xAxisIncrementValue;
	private final int yAxisIncrementValue;
	
	Direction(final int xAxisIncrementValue, final int yAxisIncrementValue) {
        this.xAxisIncrementValue = xAxisIncrementValue;
        this.yAxisIncrementValue = yAxisIncrementValue;
    }
	
	public int getxAxisIncrementValue() {
		return xAxisIncrementValue;
	}

	public int getyAxisIncrementValue() {
		return yAxisIncrementValue;
	}

	public abstract Direction right();
	public abstract Direction left();
	
}
