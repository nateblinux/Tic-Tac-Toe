package game;

import javax.swing.JOptionPane;

public class CheckForWin {
	//this meathod takes inputs as a string, puts them into an array
	//and then checks to see if there are three buttons that have the same
	//value.
	//It also checks to make sure that they dont have the default value
	//if there is a win it returns true
	//if not it returns false;
	public static boolean win(String b1, String b2, String b3, String b4,
			String b5, String b6, String b7,  String b8, String b9){
		String[] buttons = {
				b1, b2, b3, b4, b5, b6, b7, b8, b9
		};
		if(buttons[0] == buttons[4] && buttons[4] == buttons[8] 
				&& buttons[0] != " " && buttons[4] != " " && buttons[8] != " ")
			return true;
		if(buttons[2] == buttons[4] && buttons[4] == buttons[6]
				&& buttons[2] != " " && buttons[4] != " " && buttons[6] != " ")
			return true;
		if(buttons[0] == buttons[1] && buttons[1] == buttons[2]
				&& buttons[0] != " " && buttons[1] != " " && buttons[2] != " ")
			return true;
		if(buttons[3] == buttons[4] && buttons[4] == buttons[5]
				&& buttons[3] != " " && buttons[4] != " " && buttons[5] != " ")
			return true;
		if(buttons[6] == buttons[7] && buttons[7] == buttons[8]
				&& buttons[6] != " " && buttons[7] != " " && buttons[8] != " ")
			return true;
		if(buttons[0] == buttons[3] && buttons[3] == buttons[6]
				&& buttons[0] != " " && buttons[3] != " " && buttons[6] != " ")
			return true;
		if(buttons[1] == buttons[4] && buttons[4] == buttons[7]
				&& buttons[1] != " " && buttons[4] != " " && buttons[6] != " ")
			return true;
		if(buttons[2] == buttons[5] && buttons[5] == buttons[8]
				&& buttons[2] != " " && buttons[5] != " " && buttons[8] != " ")
			return true;
		
		int checkForDraw = 0;
		for(int i = 0; i <= 8; i++){
			if(buttons[i] != " "){
				checkForDraw += 1;
			}
		}
		if(checkForDraw == 9){
			JOptionPane.showMessageDialog(null, "it is a draw");
			Game.reset();
			return false;
		}
		return false;
	
	}
}

