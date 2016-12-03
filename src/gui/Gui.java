package gui;
import javax.swing.*;

import game.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame main;
	public static JButton b1;
	public static JButton b2;
	public static JButton b3;
	public static JButton b4;
	public static JButton b5;
	public static JButton b6;
	public static JButton b7;
	public static JButton b8;
	public static JButton b9;
	public static JButton reset;
	public static JButton quit;
	public Gui(){
		GridLayout mainLayout = new GridLayout(2, 1);//creates a new grid layout
		main = new JFrame();//creates a new instance of JFrame main
		main.setSize(200, 250);//sets the size of main
		main.setTitle("Tic Tac Toe");//sets the title of main
		main.setLayout(mainLayout);//adds mainLayout to main
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sets default close opperatoin for main
		JPanel mainFrame = new JPanel();//creates a new JPanel
		mainFrame.setSize(200, 200);//sets the size of the new JPanel
		GridLayout layout = new GridLayout(3, 3);//new Grid Layout 3 X 3
		mainFrame.setLayout(layout);//sets the layout of manFrame 
		//the following declares the buttons adds action listener and adds them to mainFrame JPanel
		b1 = new JButton(" ");b1.addActionListener(this);mainFrame.add(b1);
		b2 = new JButton(" ");b2.addActionListener(this);mainFrame.add(b2);
		b3 = new JButton(" ");b3.addActionListener(this);mainFrame.add(b3);
		b4 = new JButton(" ");b4.addActionListener(this);mainFrame.add(b4);
		b5 = new JButton(" ");b5.addActionListener(this);mainFrame.add(b5);
		b6 = new JButton(" ");b6.addActionListener(this);mainFrame.add(b6);
		b7 = new JButton(" ");b7.addActionListener(this);mainFrame.add(b7);
		b8 = new JButton(" ");b8.addActionListener(this);mainFrame.add(b8);
		b9 = new JButton(" ");b9.addActionListener(this);mainFrame.add(b9);
		main.add(mainFrame);//adds JPanel mainFrame to main JFrame
		JPanel resetPanel = new JPanel();//creates new JPanel to hold Reset button
		reset = new JButton("Reset");//Creates Reset Button
		reset.addActionListener(this);//adds Action Listener to reset
		resetPanel.setSize(200, 50);//sets the size of the reset panel
		resetPanel.add(reset);//adds button to Reset JPanel
		quit =  new JButton("Quit");
		quit.addActionListener(this);
		resetPanel.add(quit);
		main.add(resetPanel);//adds resetPanel JPanel to main JFrame
		main.setVisible(true);//makes main JFrame visible
	}
	
//This is the meathod for Action Listener
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == reset){
			Game.reset();//reset button
		}
		if(ae.getSource() == quit){
			Game.quit();
		}
		//all of this creates the X's on the buttons
		if(Game.turn == 0){
			if(ae.getSource() == b1){
				if(Game.checkIfUsed(b1.getText()) != false){
					b1.setText("X");
					Game.turn = 1;
				}
			}
			if(ae.getSource() == b2){
				if(Game.checkIfUsed(b2.getText()) != false){
					b2.setText("X");
					Game.turn = 1;
				}
			}
			if(ae.getSource() == b3){
				if(Game.checkIfUsed(b3.getText()) != false){
					b3.setText("X");
					Game.turn = 1;
				}
			}
			if(ae.getSource() == b4){
				if(Game.checkIfUsed(b4.getText()) != false){
					b4.setText("X");
					Game.turn = 1;
				}
			}
			if(ae.getSource() == b5){
				if(Game.checkIfUsed(b5.getText()) != false){
					b5.setText("X");
					Game.turn = 1;
				}
			}
			if(ae.getSource() == b6){
				if(Game.checkIfUsed(b6.getText()) != false){
					b6.setText("X");
					Game.turn = 1;
				}
			}
			if(ae.getSource() == b7){
				if(Game.checkIfUsed(b7.getText()) != false){
					b7.setText("X");
					Game.turn = 1;
				}
			}
			if(ae.getSource() == b8){
				if(Game.checkIfUsed(b8.getText()) != false){
					b8.setText("X");
					Game.turn = 1;
				}
			}
			if(ae.getSource() == b9){
				if(Game.checkIfUsed(b9.getText()) != false){
					b9.setText("X");
					Game.turn = 1;
				}
			}
			//this trys to check for a win for X
			try {
				boolean win = CheckForWin.win(b1.getText(), b2.getText(), b3.getText(), b4.getText(),
						b5.getText(), b6.getText(), b7.getText(), b8.getText(), b9.getText());
				if(win == true){
					JOptionPane.showMessageDialog(null, "X Wins");
					Game.reset();
				}
			} catch (HeadlessException e) {
				e.printStackTrace();
			}
		}
		//same as above for O's
		if(Game.turn == 1){
			if(ae.getSource() == b1){
				if(Game.checkIfUsed(b1.getText()) != false){
					b1.setText("O");
					Game.turn = 0;
				}
			}
			if(ae.getSource() == b2){
				if(Game.checkIfUsed(b2.getText()) != false){
					b2.setText("O");
					Game.turn = 0;
				}
			}
			if(ae.getSource() == b3){
				if(Game.checkIfUsed(b3.getText()) != false){
					b3.setText("O");
					Game.turn = 0;
				}
			}
			if(ae.getSource() == b4){
				if(Game.checkIfUsed(b4.getText()) != false){
					b4.setText("O");
					Game.turn = 0;
				}
			}
			if(ae.getSource() == b5){
				if(Game.checkIfUsed(b5.getText()) != false){
					b5.setText("O");
					Game.turn = 0;
				}
			}
			if(ae.getSource() == b6){
				if(Game.checkIfUsed(b6.getText()) != false){
					b6.setText("O");
					Game.turn = 0;
				}
			}
			if(ae.getSource() == b7){
				if(Game.checkIfUsed(b7.getText()) != false){
					b7.setText("O");
					Game.turn = 0;
				}
			}
			if(ae.getSource() == b8){
				if(Game.checkIfUsed(b8.getText()) != false){
					b8.setText("O");
					Game.turn = 0;
				}
			}
			if(ae.getSource() == b9){
				if(Game.checkIfUsed(b9.getText()) != false){
					b9.setText("O");
					Game.turn = 0;
				}
			}
			//trys to check for win for O
			try {
				boolean win = CheckForWin.win(b1.getText(), b2.getText(), b3.getText(), b4.getText(),
						b5.getText(), b6.getText(), b7.getText(), b8.getText(), b9.getText());
				if(win == true){
					JOptionPane.showMessageDialog(null, "O wins");
					Game.reset();
				}
			} catch (HeadlessException e) {
				e.printStackTrace();
			}
		}		
	}
}