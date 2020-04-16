/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author miken
 */
public class GuessHiLo extends Guessing
{
  public static final String INSTRUCTIONS = "Guess my random number "
                 + "between 1 and 100.  I will give you hints after " 
                 + "each guess telling you if you were too high or too low. "
                 + "Enter zero to stop guessing.";
  public static final String GAMENAME = "Guessing by high/low";  

  public GuessHiLo()
  {
      
     super(); 
  }
  @Override
  public String getGameName()
  {
      
      return GuessHiLo.GAMENAME;
  }
  @Override
  public String getInstructions()
  {
      
      return GuessHiLo.INSTRUCTIONS;
  }
  
  @Override
  public String getGuessResult()
  {
      String result;
      
      if(super.isOver())
      {
          result = "Game is already over.";
          
      }
      else if (super.getLastGuess() < this.getRnum()) {
                result = "Your guess of " + super.getLastGuess() + 
                        " is too low.\n";
        } else if (super.getLastGuess() > super.getRnum() ) {
                result = "Your guess of " + super.getLastGuess() + 
                        " is too high.\n";
        } else {
            result = "You guessed it. (" + super.getRnum() + ")";
        }
        return result;
      
  }
  
}
