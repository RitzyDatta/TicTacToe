package com.tictactoe;

import javax.swing.*;
import java.io.Serializable;
import java.awt.*;
import java.awt.event.*;


public class TicTacToe implements ActionListener, Serializable
{
  
	private static final long serialVersionUID = -4128027674107695990L;
	JFrame window;
    JButton cell[], reset, save;
    int moveNum = -1;
    ImageIcon iconX, iconO;
    JLabel label, scoreLabel;
    int cell_val[]=new int[9];
	int playerOneScore = 0, playerTwoScore = 0, drawCount = 0;
	ActionEvent action;
	
	String Player1,Player2;
	JButton Restore;
    
    
    public TicTacToe()
    {
    	name();
        window = new JFrame("Tic Tac Toe");        
        label = new JLabel(Player1 + ":  X          " + Player2 + ":  O");
        cell = new JButton[10];
        reset = new JButton("Reset");
        save = new JButton("Save");
        Restore = new JButton("Restore");
		scoreLabel = new JLabel(Player1 + " wins: " + playerOneScore + "    "+ Player2 +" wins: " + playerTwoScore + "   Draws: " + drawCount);
        
        label.setBounds(25, 5, 200, 150);
        reset.setBounds(400, 200, 75, 50);
        save.setBounds(400,120,75,50); 
        Restore.setBounds(400,300,75,50);
		scoreLabel.setBounds(325, 5, 400, 150);
		
        for(int i = 0; i < 10; i++)
        {
            cell[i] = new JButton();
            cell[i].addActionListener(this);
        }
        /* 
            set bounds for the buttons individually        
        */
        cell[0].setBounds(25, 100, 75, 75);
        cell[1].setBounds(125, 100, 75, 75);
        cell[2].setBounds(225, 100, 75, 75);
        cell[3].setBounds(25, 200, 75, 75);
        cell[4].setBounds(125, 200, 75, 75);
        cell[5].setBounds(225, 200, 75, 75);
        cell[6].setBounds(25, 300, 75, 75);
        cell[7].setBounds(125, 300, 75, 75);
        cell[8].setBounds(225, 300, 75, 75);
        
        iconX = new ImageIcon("./TicTacToe/cross.jpg");
        iconO = new ImageIcon("./TicTacToe/naught.jpg");
		
		reset.addActionListener(this);
		save.addActionListener(this); 
		Restore.addActionListener(this);
        
        
        for(int i = 0; i < 10; i++)
            window.add(cell[i]);
        window.add(label);        
        window.add(reset);
        window.add(save);
        window.add(Restore);
		window.add(scoreLabel);
        window.setLayout(null);
        window.setSize(640, 640);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);  
        for(int i = 0; i < 9; i++)
        {
          cell_val[i]=-1;
        }
        
        
     
    }
    
    public TicTacToe(TicTacToe tempGame)
    {
    	Player1=tempGame.Player1;
    	Player2=tempGame.Player2;
    	
        window = new JFrame("Tic Tac Toe");        
        label = new JLabel(tempGame.Player1 + ":  X          " + tempGame.Player2 + ":  O");
        cell = new JButton[10];
        reset = new JButton("Reset");
        save = new JButton("Save"); 
        Restore = new JButton("Restore"); 
		scoreLabel = new JLabel(Player1 + " wins: " + playerOneScore + "    "+ Player2 +" wins: " + playerTwoScore + "   Draws: " + drawCount);
        
        label.setBounds(25, 5, 200, 150);
        reset.setBounds(400, 200, 75, 50);
        save.setBounds(400,120,75,50); 
        Restore.setBounds(400,300,75,50); 
		scoreLabel.setBounds(325, 5, 400, 150);
		
        for(int i = 0; i < 10; i++)
        {
            cell[i] = new JButton();
            cell[i].addActionListener(this);
            cell[i]=tempGame.cell[i];
        }
        /* 
            set bounds for the buttons individually        
        */
        cell[0].setBounds(25, 100, 75, 75);
        cell[1].setBounds(125, 100, 75, 75);
        cell[2].setBounds(225, 100, 75, 75);
        cell[3].setBounds(25, 200, 75, 75);
        cell[4].setBounds(125, 200, 75, 75);
        cell[5].setBounds(225, 200, 75, 75);
        cell[6].setBounds(25, 300, 75, 75);
        cell[7].setBounds(125, 300, 75, 75);
        cell[8].setBounds(225, 300, 75, 75);
        
        iconX = new ImageIcon("./TicTacToe/cross.jpg");
        iconO = new ImageIcon("./TicTacToe/naught.jpg");
		
		reset.addActionListener(this);
		save.addActionListener(this); 
		Restore.addActionListener(this); 
        
        
        for(int i = 0; i < 10; i++)
            window.add(cell[i]);
        window.add(label);        
        window.add(reset);
        window.add(save);
        window.add(Restore);
		window.add(scoreLabel);
        window.setLayout(null);
        window.setSize(640, 640);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);  
        for(int i = 0; i < 9; i++)
        {
          cell_val[i]=-tempGame.cell_val[i];
        }
        
        moveNum=tempGame.moveNum;
        playerOneScore= tempGame.playerOneScore;
        playerTwoScore= tempGame.playerTwoScore;
        drawCount=tempGame.drawCount;
        		
        
        for(int i = 0; i < 10; i++)
        {
 		   
	            
	            if(!(tempGame.cell[i].isEnabled())) {
	            	System.out.println("in the loop");
	            	this.cell[i].doClick();
	            //	this.cell[i] =tempGame.cell[i];
	            	this.cell[i].setEnabled(false);
	            	this.cell[i].setDisabledIcon(tempGame.cell[i].getIcon());
         }
		}
        
    }
    
    void name() {
    	
    	JFrame playerName=new JFrame();
    	Player1=JOptionPane.showInputDialog(playerName,"Enter player1 name: ");
    	Player2=JOptionPane.showInputDialog(playerName,"Enter player2 name: ");
    	
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
    	this.action=e;
    	new Operations(this);
    } 
}