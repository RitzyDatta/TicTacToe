package com.tictactoe;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.*;

public class Operations {
	 ImageIcon iconX, iconO;
	
	public Operations(TicTacToe UI) {
		 iconX = new ImageIcon("./TicTacToe/cross.jpg");
	     iconO = new ImageIcon("./TicTacToe/naught.jpg");
		
		JFrame f = new JFrame();
	       UI.moveNum++;
	       
	       JButton temp = (JButton)UI.action.getSource();
	       temp.setEnabled(false);
	       
	       if(UI.action.getSource() == UI.cell[0])
	       {
	    	   if(UI.moveNum % 2 == 0)                                  //first players move
	    	   {
	    		   UI.cell[0].setIcon(iconX);
	    		   UI.cell[0].setDisabledIcon(iconX);
	    		   UI.cell_val[0]=1;
	    	   }
	    	   else                                                  //second players move
	    	   {
	    		   UI.cell[0].setIcon(iconO);
	    		   UI.cell[0].setDisabledIcon(iconO);
	    		   
	    		   UI.cell_val[0]=0;
	    		   
	    	   }
	       }
	            
	       if(UI.action.getSource() == UI.cell[1])
	       {
	    	   if(UI.moveNum % 2 == 0)                                  //first players move
	    	   {
	    		   UI.cell[1].setIcon(iconX);
	    		   UI.cell[1].setDisabledIcon(iconX);
	    		   UI.cell_val[1]=1;
	    	   }
	    	   else                                                  //second players move
	    	   {
	    		   UI.cell[1].setIcon(iconO);
	    		   UI.cell[1].setDisabledIcon(iconO);
	    		   
	    		   UI.cell_val[1]=0;
	    	   }
	       }
	       
	       if(UI.action.getSource() == UI.cell[2])
	       {
	    	   if(UI.moveNum % 2 == 0)                                  //first players move
	    	   {
	    		   UI.cell[2].setIcon(iconX);
	    		   UI.cell[2].setDisabledIcon(iconX);
	    		   UI.cell_val[2]=1;
	    	   }
	    	   else                                                  //second players move
	    	   {
	    		   UI.cell[2].setIcon(iconO);
	    		   UI.cell[2].setDisabledIcon(iconO);
	    		   UI.cell_val[2]=0;
	    	   }
	       }
	       
	       if(UI.action.getSource() == UI.cell[3])
	       {
	    	   if(UI.moveNum % 2 == 0)                                  //first players move
	    	   {
	    		   UI.cell[3].setIcon(iconX);
	    		   UI.cell[3].setDisabledIcon(iconX);
	    		   UI.cell_val[3]=1;
	    	   }
	    	   else                                                  //second players move
	    	   {
	    		   UI.cell[3].setIcon(iconO);
	    		   UI.cell[3].setDisabledIcon(iconO);
	    		   UI.cell_val[3]=0;
	    	   }
	       }
	       
	       if(UI.action.getSource() == UI.cell[4])
	       {
	    	   if(UI.moveNum % 2 == 0)                                  //first players move
	    	   {
	    		   UI.cell[4].setIcon(iconX);
	    		   UI.cell[4].setDisabledIcon(iconX);
	    		   UI.cell_val[4]=1;
	    	   }
	    	   else                                                  //second players move
	    	   {
	    		   UI.cell[4].setIcon(iconO);
	    		   UI.cell[4].setDisabledIcon(iconO);
	    		   
	    		   UI.cell_val[4]=0;
	    	   }
	       }
	       
	       if(UI.action.getSource() == UI.cell[5])
	       {
	    	   if(UI.moveNum % 2 == 0)                                  //first players move
	    	   {
	    		   UI.cell[5].setIcon(iconX);
	    		   UI.cell[5].setDisabledIcon(iconX);
	    		   UI.cell_val[5]=1;
	    	   }
	    	   else                                                  //second players move
	    	   {
	    		   UI.cell[5].setIcon(iconO);
	    		   UI.cell[5].setDisabledIcon(iconO);
	    		   UI.cell_val[5]=0;
	    	   }
	       }
	       
	       if(UI.action.getSource() == UI.cell[6])
	       {
	    	   if(UI.moveNum % 2 == 0)                                  //first players move
	    	   {
	    		   UI.cell[6].setIcon(iconX);
	    		   UI.cell[6].setDisabledIcon(iconX);
	    		   UI.cell_val[6]=1;
	    	   }
	    	   else                                                  //second players move
	    	   {
	    		   UI.cell[6].setIcon(iconO);
	    		   UI.cell[6].setDisabledIcon(iconO);
	    		   UI.cell_val[6]=0;
	    	   }
	       }
	       
	       if(UI.action.getSource() == UI.cell[7])
	       {
	    	   if(UI.moveNum % 2 == 0)                                  //first players move
	    	   {
	    		   UI.cell[7].setIcon(iconX);
	    		   UI.cell[7].setDisabledIcon(iconX);
	    		   UI.cell_val[7]=1;
	    	   }
	    	   else                                                  //second players move
	    	   {
	    		   UI.cell[7].setIcon(iconO);
	    		   UI.cell[7].setDisabledIcon(iconO);
	    		   UI.cell_val[7]=0;
	    	   }
	       }
	       
	       if(UI.action.getSource() == UI.cell[8])
	       {
	    	   if(UI.moveNum % 2 == 0)                                  //first players move
	    	   {
	    		   UI.cell[8].setIcon(iconX);
	    		   UI.cell[8].setDisabledIcon(iconX);
	    		  UI.cell_val[8]=1;
	    	   }
	           
	    	   else                                                  //second players move
	    	   {
	    		   UI.cell[8].setIcon(iconO);
	    		   UI.cell[8].setDisabledIcon(iconO);
	    		   UI.cell_val[8]=0;
	    	   }
	       }
	       
	       
	       //game logic
	       if(UI.cell_val[0]==UI.cell_val[1] && UI.cell_val[1]==UI.cell_val[2])            //row
	       {
	    	   if(UI.cell_val[0]==1)
	    	   {
	    		   JOptionPane.showMessageDialog(f, UI.Player1 + " Wins");
				   UI.playerOneScore++;
				   reset(UI);
	    	   }
	    	   if(UI.cell_val[0]==0)
	    	   {
	    		   JOptionPane.showMessageDialog(f, UI.Player2 + " Wins");
				   UI.playerTwoScore++;
	    		   reset(UI);
	    		   
	    	   }
	       }
	       if(UI.cell_val[3]==UI.cell_val[4] && UI.cell_val[4]==UI.cell_val[5])          //row
	       {
	    	   if(UI.cell_val[3]==1)
	    	   {
	    		   JOptionPane.showMessageDialog(f, UI.Player1 + " Wins");
				   UI.playerOneScore++;
	    		   reset(UI);
	    	   }
	    	   if(UI.cell_val[3]==0)
	    	   {
	    		   JOptionPane.showMessageDialog(f, UI.Player2 + " Wins");
				   UI.playerTwoScore++;
	    		   reset(UI);
	    		   
	    	   }
	       }
	       if(UI.cell_val[6]==UI.cell_val[7] && UI.cell_val[7]==UI.cell_val[8])        //row
	       {
	    	   if(UI.cell_val[6]==1)
	    	   {
	    		   JOptionPane.showMessageDialog(f, UI.Player1 + " Wins");
				   UI.playerOneScore++;
	    		   reset(UI);
	    	   }
	    	   if(UI.cell_val[6]==0)
	    	   {
	    		   JOptionPane.showMessageDialog(f, UI.Player2 + " Wins");
				   UI.playerTwoScore++;
	    		   reset(UI);
	    		   
	    	   }
	       }
	       if(UI.cell_val[0]==UI.cell_val[3] && UI.cell_val[3]==UI.cell_val[6])        //col
	       {
	    	   if(UI.cell_val[0]==1)
	    	   {
	    		   JOptionPane.showMessageDialog(f, UI.Player1 + " Wins");
				   UI.playerOneScore++;
	    		   reset(UI);
	    	   }
	    	   if(UI.cell_val[0]==0)
	    	   {
	    		   JOptionPane.showMessageDialog(f, UI.Player2 + " Wins");
				   UI.playerTwoScore++;
	    		   reset(UI);
	    		   
	    	   }
	       }
	       
	       if(UI.cell_val[1]==UI.cell_val[4] && UI.cell_val[4]==UI.cell_val[7])        //col 2
	       {
	    	   if(UI.cell_val[1]==1)
	    	   {
	    		   JOptionPane.showMessageDialog(f, UI.Player1 + " Wins");
				   UI.playerOneScore++;
	    		   reset(UI);
	    	   }
	    	   if(UI.cell_val[1]==0)
	    	   {
	    		   JOptionPane.showMessageDialog(f, UI.Player2 + " Wins");
				   UI.playerTwoScore++;
	    		   reset(UI);
	    		   
	    	   }
	       }
	       
	       if( (UI.cell_val[2]==UI.cell_val[5]) && (UI.cell_val[5]==UI.cell_val[8]) )      //col 3
	       {
	    	   if(UI.cell_val[2]==1)
	    	   {
	    		   JOptionPane.showMessageDialog(f, UI.Player1 + " Wins");
				   UI.playerOneScore++;
	    		   reset(UI);
	    	   }
	    	   if(UI.cell_val[2]==0)
	    	   {
	    		   JOptionPane.showMessageDialog(f, UI.Player2 + " Wins");
				   UI.playerTwoScore++;
	    		   reset(UI);
	    		   
	    	   }
	       }
	       
	       
	       if(UI.cell_val[0]==UI.cell_val[4] && UI.cell_val[4]==UI.cell_val[8])       //diagonal
	       {
	    	   if(UI.cell_val[0]==1)
	    	   {
	    		   JOptionPane.showMessageDialog(f, UI.Player1 + " Wins");
				   UI.playerOneScore++;
	    		   reset(UI);
	    	   }
	    	   if(UI.cell_val[0]==0)
	    	   {
	    		   JOptionPane.showMessageDialog(f, UI.Player2 + " Wins");
				   UI.playerTwoScore++;
	    		   reset(UI);
	    		   
	    	   }
	       }
	       
	       
	       if(UI.cell_val[2]==UI.cell_val[4] && UI.cell_val[4]==UI.cell_val[6])      //diagonal
	       {
	    	   if(UI.cell_val[2]==1)
	    	   {
	    		   JOptionPane.showMessageDialog(f, UI.Player1 + " Wins");
				   UI.playerOneScore++;
	    		   reset(UI);
	    	   }
	    	   if(UI.cell_val[2]==0)
	    	   {
	    		   JOptionPane.showMessageDialog(f, UI.Player2 + " Wins");
				   UI.playerTwoScore++;
	    		   reset(UI);
	    		   
	    	   }
	       }
	       
	       if(UI.moveNum == 8)                                            //draw
	       {
	    	   JOptionPane.showMessageDialog(f, "Draw !");
			  UI.drawCount++;
	    	  reset(UI);
	       }
	            	
	       if(UI.action.getSource() == UI.reset)
	       {
	    	   reset(UI);
		    
	       }
	       if(UI.action.getSource() == UI.save)
	       {
	    	   save(UI);
	    	   UI.save.setEnabled(true);
	       }
	       
	       if(UI.action.getSource() == UI.Restore)
	       {
	    	   
	    	   TicTacToe tempUI = restore();
	    	   UI.Restore.setEnabled(true);
	    	   UI.window.dispose();
	    	   new TicTacToe(tempUI);
	    	   
	    	   
	       }
	      
		
	}
	
	public void reset(TicTacToe UI) {
		UI.moveNum = -1;
		UI.scoreLabel.setText(UI.Player1 + " wins: " + UI.playerOneScore + "    "+ UI.Player2 +" wins: " + UI.playerTwoScore + "   Draws: " + UI.drawCount);
		UI.scoreLabel.repaint();		
        for(int i = 0; i < 10; i++)
        {
        	UI.cell[i].setEnabled(true);
            UI.cell[i].setIcon(null);		            
		}
        
        for(int i =0; i<9; i++)
        	UI.cell_val[i]=-1;
        UI.reset.setEnabled(true);
		
	}
	
	public void save(TicTacToe game) {
			
		try {
			  FileOutputStream fout=new FileOutputStream("D:\\Practice\\java\\GameState.DAT");  
			  ObjectOutputStream out=new ObjectOutputStream(fout); 
			  out.writeObject(game);  
			  out.flush();  
			  System.out.println("success");  
			  
			  out.close();
			}
			catch (IOException e) {  
	            e.printStackTrace();  
	        }
	}
	
	public TicTacToe restore() {
		TicTacToe tempUI = null;
		try {
			ObjectInputStream deserial=new ObjectInputStream(new FileInputStream("D:\\Practice\\java\\GameState.DAT"));  
			
			try {
				tempUI = (TicTacToe)deserial.readObject();
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} 
			deserial.close();
		}
		catch (IOException e) {  
            e.printStackTrace();  
        }
		return tempUI;
	}	

}
