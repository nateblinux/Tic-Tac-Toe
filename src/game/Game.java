package game;

import gui.*;

public class Game {
	//this is where our main is
	
	public static int turn = 0;//this is a integer to detirmine if it is X's or O's turn
	//for integer turn 0 is X, 1 is O
	public static void main(String[] args) {
			new Gui();//creates a new instance Gui
	}
	//This is used to check to see if a button is already taken when a player
	//wants to put their sign there
	public static boolean checkIfUsed(String button){
		if(button != " "){
			return false;
		}
		return true;
	}
	//this reset meathod just sets all of the buttons values back to default
	//and the turn to X
	public static void reset(){
		Gui.b1.setText(" ");
		Gui.b2.setText(" ");
		Gui.b3.setText(" ");
		Gui.b4.setText(" ");
		Gui.b5.setText(" ");
		Gui.b6.setText(" ");
		Gui.b7.setText(" ");
		Gui.b8.setText(" ");
		Gui.b9.setText(" ");
		turn = 0;
	}
	
	public static void quit(){
		System.exit(0);
	}

}
