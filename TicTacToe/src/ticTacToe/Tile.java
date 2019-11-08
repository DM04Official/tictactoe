/**
 * 
 */
package ticTacToe;
//jahkfjasdnfmasjhfjk
/**
 * @author grego
 *
 */
public class Tile {

	private int id;
	private String row;
	private String column;
	private String answer; //x, o, blank
	private int value;
	//set blank = 0; x = 1; o = 100;
	
	public Tile(int id, String row, String column)
	{
		this.id = id;
		this.row = row;
		this.column = column;
		this.answer = "";
		this.value = 0;	
	}

asdfasdf 	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	
	
	
	
	
}
