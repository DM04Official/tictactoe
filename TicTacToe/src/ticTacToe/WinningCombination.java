/**
 * 
 */
package com.dm04.logic;

/**
 * @author grego
 *
 */
public class WinningCombination {

	private int id;
	private Tile positionOne;
	private Tile PositionTwo;
	private Tile PositionThree;
	
	public WinningCombination (int id, Tile one, Tile two, Tile three)
	{
		this.positionOne = one;
		this.PositionTwo = two;
		this.PositionThree = three;
	}
	
	public boolean isWinning()
	{
		if(this.positionOne.getAnswer() == this.getPositionTwo().getAnswer() && this.positionOne.getAnswer() == this.getPositionThree().getAnswer())
			return true;
		return false; 
	}
	
	
	public Tile rowNextToWin(String value) // set to x or o.  Use this first to test for my win and then to test for their next win.
	{
		int sum = 0;
		if (value == "x")
				sum = 2;
		if (value == "o")
			sum = 200;
		
		if(this.positionOne.getValue() + this.PositionTwo.getValue() + this.PositionThree.getValue() == sum) 
		{
			if(this.positionOne.getValue() == 0)
				return this.positionOne;
			if(this.PositionTwo.getValue() == 0 )
				return this.getPositionTwo();
			if (this.PositionThree.getValue() == 0)
				return this.getPositionThree();
		}
			
		return null; 
	}

	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Tile getPositionOne() {
		return positionOne;
	}
	public void setPositionOne(Tile positionOne) {
		this.positionOne = positionOne;
	}
	public Tile getPositionTwo() {
		return PositionTwo;
	}
	public void setPositionTwo(Tile positionTwo) {
		PositionTwo = positionTwo;
	}
	public Tile getPositionThree() {
		return PositionThree;
	}
	public void setPositionThree(Tile positionThree) {
		PositionThree = positionThree;
	}
	
	
	
	
	
	
}


