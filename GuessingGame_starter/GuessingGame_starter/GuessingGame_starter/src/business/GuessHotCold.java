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
public class GuessHotCold extends Guessing
{
    public static final String INSTRUCTIONS = "Guess my random number "
                 + "between 1 and 100.  I will give you hints after " 
                 + "each guess telling you if you are getting hotter or " 
                 + "colder.  Enter zero to stop guessing.";
    public static final String GAMENAME = "Guessing by Hot/Cold"; 
    private int prevcat, prevdiff; 
    
    //private String guessResult;


  public GuessHotCold()
  {
      super();
      this.prevcat=-1;
      this.prevdiff =-1;
      //this.guessResult ="";
  }
  
  @Override
  public String getGameName()
  {
      
      return GuessHotCold.GAMENAME;
  }
  @Override
  public String getInstructions()
  {
      
      return GuessHotCold.INSTRUCTIONS;
  }
  
  @Override
  public String getGuessResult()
  {
        int category=0, guess;
        String result="";

        int diff = Math.abs(super.getRnum() - super.getLastGuess());
        if (diff >= 75) {
            category = 1;
            result = "Your guess of " + super.getLastGuess() + " is very cold";
        } else if (diff >= 50) {
            category = 2;
            result = "Your guess of " + super.getLastGuess() + " is cold";
        } else if (diff >= 25) {
            category = 3;
            result = "Your guess of " + super.getLastGuess() + " is warm";
        } else if (diff >= 13) {
            category = 4;
            result = "Your guess of " + super.getLastGuess() + " is very warm";
        } else if (diff >= 1) {
            category = 5;
            result = "Your guess of " + super.getLastGuess() + " is HOT";
        } else {
            //unexpected result
            result = "You guessed my number. ";
        }
        if (category == this.prevcat) {
            //need additional msg for direction
            if (this.prevdiff == diff ) {
                result += " (same degree).";
            } else {
                switch (category){
                    case 1:  //very cold
                    case 2: //cold and same as case 1 so moved under it
                        if (diff > this.prevdiff) {
                            result += " and getting colder.";
                        } else {
                            result += " but getting warmer.";
                        }
                        break; // end the switch  
                    case 3: // warm
                    case 4:
                        if (diff > this.prevdiff) {
                            result += " but getting colder.";
                        } else {
                            result += " and getting warmer.";
                        }
                        break;
                    case 5: //hot
                        if (diff > this.prevdiff){
                            result += " but getting colder.";
                        }else {
                            result += " and getting hotter";
                        }
                        break;
                }//end of switch
            }//end of else
        }//end of if
        this.prevcat = category;
        this.prevdiff = diff;
        result += "\n";
        return result;
  }
}