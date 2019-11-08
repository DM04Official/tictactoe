package ticTacToe;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class Gameplay {
	//Board flat = new Board();
	
	public JButton doGameplay(ActionEvent meow)
	{
		if(meow.getSource() == Board.one)
		{
			return(Board.one);
			//boxClicked(flat.one);
		} else if(meow.getSource() == Board.two)
		{
			return(Board.two);
		} else if(meow.getSource() == Board.three)
		{
			return(Board.three)
		}
		
		
		/*else if(meow.getSource() == flat.two)
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
		} else if(meow.getSource()== flat.eight)
		{
			boxClicked(seven);
		} else if(meow.getSource() == flat.six)
		{
			boxClicked(eight);
		} else if(meow.getSource() == flat.seven)
		{
			boxClicked(nine);
		}*/
		return(null);
	}
}
