
package ticTacToe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;



public class Board implements ActionListener {
	//Create main frame
	JFrame mainFrame = new JFrame();
	
	JPanel boardPanel = new JPanel();
	GridLayout box = new GridLayout(3,3);
	
	 static JButton one = new JButton();
	static JButton two = new JButton();
	JButton three = new JButton();
	JButton four = new JButton();
	JButton five = new JButton();
	JButton six = new JButton();
	JButton seven = new JButton();
	JButton eight = new JButton();
	JButton nine = new JButton();
	
	int turn = 1;
	String letterTurn = "X";
	
	
	ArrayList<Tile> allTiles = new ArrayList<Tile>();
	ArrayList<Tile> winningCombinations = new ArrayList<Tile>();
	//Tile a1 = new Tile();
	
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
		Gameplay game = new Gameplay();
		
		boxClicked(game.doGameplay(ouch));
		System.out.println(letterTurn);

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
		if(turn == 1) {return("x");} else { return("o");}
		
	}
}
