/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Random;

/**
 *
 * @author miken
 */
public abstract class Guessing implements Game
{

    private String endmsg, errmsg;
    private int rnum, lastguess;
    private int gametype;
    private boolean over;
    private int gcount;
  
   
public Guessing(){
      
           
            setRandom();
             
       this.over = false;
       
       
       this.gcount = 0;
       this.endmsg = "";
       this.errmsg = "";
       this.lastguess = -1;
       this.gametype = -1;
    }
    
    private void setRandom() {
        
        
        Random r = new Random();
        rnum = r.nextInt(100)+1;
      
        
        //System.out.println(rnum);
    }
    
    @Override
    public void setGuess(String move) {
        int guess = 0;
        try {
            guess = Integer.parseInt(move);
            if (guess < 0 || guess > 100) {
                errmsg = "Last guess is out of range: 0-100 only.";
            } else if (guess == 0) {
                over = true;
                endmsg = "Sorry, you did not guess my number of " + this.rnum+
                       " in " + (gcount) 
                                    + " tries.";
            } else {
                gcount++;
                this.lastguess = guess;
                if (guess == rnum) {
                    endmsg = "You guessed my number  "  +
                            this.rnum +" in " + (gcount) + " tries!";
                    over = true;
                }
            }            
        } catch (NumberFormatException e) {
            errmsg = "Last guess was not a number.  Please try again.";
            this.lastguess = -1;
        }
    }
    
    @Override
    public String getEndMsg()
    {
        
        return this.endmsg;
    }
    @Override
    public String getErrorMsg()
    {
        return this.errmsg;
        
    }
   
    @Override
    public boolean isOver()
    {
        return this.over;
    }
    protected int getRnum()
    {
        return this.rnum;
        
        
    }        
    protected int getLastGuess()
    {
        
        return this.lastguess;
        
    }
    
    public void setGameType(int gameType1)
    {
        this.gametype = gameType1;
        
    }
    
    public int getGameType()
    {
        int game;
        game = this.gametype;
        return game;
    }
    @Override
    public abstract String getGuessResult();
    @Override
    public abstract String getGameName();
    
    @Override
    public abstract String getInstructions();
    
  
   


}
//finish the do what can on guessing hot cold before turning form 
//into polymorphism.