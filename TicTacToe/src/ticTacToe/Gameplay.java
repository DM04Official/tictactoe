package ticTacToe;

import java.awt.event.ActionEvent;

public class Gameplay {
	Board flat = new Board();
	
	public void doGameplay(ActionEvent meow)
	{
		if(meow.getSource() == flat.one)
		{
			boxClicked(flat.one);
		} else if(meow.getSource() == flat.two)
		{
			boxClicked(flat.two);
		} else if(meow.getSource() == flat.four)
		{
			boxClicked(flat.three);
		} else if(meow.getSource() == flat.five)
		{
			boxClicked(four);
		} else if(meow.getSource() == flat.six)
		{
			boxClicked(five);
		} else if(meow.getSource() == flat.seven)
		{
			boxClicked(six);
		} else if(meow.getSource()== flat.seven)
		{
			boxClicked(seven);
		} else if(meow.getSource() == flat.seven)
		{
			boxClicked(eight);
		} else if(ouch.getSource() == flat.seven)
		{
			boxClicked(nine);
		}
	}
}
