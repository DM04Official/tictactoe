
package ticTacToe;
//bye
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Board implements ActionListener {
	//Create main frame
	JFrame mainFrame = new JFrame();
	
	JPanel boardPanel = new JPanel();
	GridLayout box = new GridLayout(3,3);
	
	JButton one = new JButton();
	JButton two = new JButton();
	JButton three = new JButton();
	JButton four = new JButton();
	JButton five = new JButton();
	JButton six = new JButton();
	JButton seven = new JButton();
	JButton eight = new JButton();
	JButton nine = new JButton();
	
	int turn = 1;
	String letterTurn = "X";
	
	public static void main(String args[])
	{
		Board b = new Board();
	}
	public Board()
	{
		createGui();
	}
	private void createGui() {
		
		mainFrame.setTitle("TicTacToe");
		
		boardPanel.setLayout(box);
		
		boardPanel.add(one);
		one.addActionListener(this);
		boardPanel.add(two);
		two.addActionListener(this);
		boardPanel.add(three);
		three.addActionListener(this);
		boardPanel.add(four);
		four.addActionListener(this);
		boardPanel.add(five);
		five.addActionListener(this);
		boardPanel.add(six);
		six.addActionListener(this);
		boardPanel.add(seven);
		seven.addActionListener(this);
		boardPanel.add(eight);
		eight.addActionListener(this);
		boardPanel.add(nine);
		nine.addActionListener(this);
		
		mainFrame.setSize(600,600);
		mainFrame.add(boardPanel);
		mainFrame.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent ouch) {
		letterTurn = getLetterTurn();
		System.out.println(letterTurn);
		if(ouch.getSource() == one)
		{
			
			boxClicked(one);
			
		} else if(ouch.getSource() == two)
		{
			boxClicked(two);
		} else if(ouch.getSource() == three)
		{
			boxClicked(three);
		} else if(ouch.getSource() == four)
		{
			boxClicked(four);
		} else if(ouch.getSource() == five)
		{
			boxClicked(five);
		} else if(ouch.getSource() == six)
		{
			boxClicked(six);
		} else if(ouch.getSource()== seven)
		{
			boxClicked(seven);
		} else if(ouch.getSource() == eight)
		{
			boxClicked(eight);
		} else if(ouch.getSource() == nine)
		{
			boxClicked(nine);
		}
	}
	private void boxClicked(JButton a) {
		a.setText(letterTurn);
		changeTurn();
		a.setEnabled(false);
		
	}
	private void changeTurn() {
		if(turn == 1) {turn = 2;} else {turn = 1;}
		
	}
	private String getLetterTurn() {
		if(turn == 1) {return("X");} else { return("O");}
		
	}
}
