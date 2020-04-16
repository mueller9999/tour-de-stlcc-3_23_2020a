
package business;

import java.util.Random;

/**
 *
 * @author 
 */
public class GuessingBothGames {
    private String endmsg, errmsg;
    private int gametype, rnum, lastguess;
    private int prevcat, prevdiff;
    private boolean over;
    private int gcount;
    
    public GuessingBothGames(int gametype){
       setRandom();
       this.gametype = gametype;
       this.over = false;
       this.gcount = 0;
       this.endmsg = "";
       this.errmsg = "";
       this.lastguess = -1;
    }
    
    private void setRandom() {
        Random r = new Random();
        rnum = r.nextInt(100)+1;
    }

    protected int getRandom() {
        return this.rnum;
    }
    protected int getLastGuess() {
        return this.lastguess;
    }

    public void setMove(String move) {
        int guess = 0;
        try {
            guess = Integer.parseInt(move);
            if (guess < 0 || guess > 100) {
                errmsg = "Last guess is out of range: 0-100 only.";
            } else if (guess == 0) {
                over = true;
                endmsg = "Sorry, you did not guess my number in " + gcount 
                                    + " tries.";
            } else {
                gcount++;
                this.lastguess = guess;
                if (guess == rnum) {
                    endmsg = "You guessed my number in " + gcount + " tries!";
                    over = true;
                }
            }            
        } catch (NumberFormatException e) {
            errmsg = "Last guess was not a number.  Please try again.";
            this.lastguess = -1;
        }
    }
    
    public String getEndMsg(){
        return endmsg;
    }
  
    public boolean isGameOver() {
        return over;
    }
  
    public String getErrorMsg() {
        return this.errmsg;
    }
    
    public String getInstructions() {
        if (this.gametype == 1) {
            return "Guess my random number "
                 + "between 1 and 100.  I will give you hints after " 
                 + "each guess telling you if you were too high or too low. "
                 + "Enter zero to stop guessing.";
        } else {
            return "Guess my random number "
                 + "between 1 and 100.  I will give you hints after " 
                 + "each guess telling you if you are getting hotter or " 
                 + "colder.  Enter zero to stop guessing.";
        }
    }
        
    public String getGameName() {
        if (this.gametype == 1) {
           return "Guess My Number - High/Low";
        } else {
            return "Guess My Number = Hot/Cold";
        }
    }
    
    public String getMoveResults() {
        if (this.over) { 
            return this.endmsg;
        }
        if (this.gametype == 1) {
            return getMoveByHiLo();
        }        else {
            return getMoveByHotCold();
        }
    }
    private String getMoveByHiLo() {
        String result;
        if (this.lastguess < this.rnum) {
                result = "Your guess of " + this.lastguess + 
                        " is too low.\n";
        } else if (this.lastguess > this.rnum ) {
                result = "Your guess of " + this.lastguess + 
                        " is too high.\n";
        } else {
            result = "You guessed it. (" + this.rnum + ")";
        }
        return result;
    }
    private String getMoveByHotCold() {
        int category=0, guess;
        String result="";

        int diff = Math.abs(this.rnum - this.lastguess);
        if (diff >= 75) {
            category = 1;
            result = "Your guess of " + this.lastguess + " is very cold";
        } else if (diff >= 50) {
            category = 2;
            result = "Your guess of " + this.lastguess + " is cold";
        } else if (diff >= 25) {
            category = 3;
            result = "Your guess of " + this.lastguess + " is warm";
        } else if (diff >= 13) {
            category = 4;
            result = "Your guess of " + this.lastguess + " is very warm";
        } else if (diff >= 1) {
            category = 5;
            result = "Your guess of " + this.lastguess + " is HOT";
        } else {
            //unexpected result
            result = "You guessed my number. ";
        }
        if (category == prevcat) {
            //need additional msg for direction
            if (prevdiff == diff ) {
                result += " (same degree).";
            } else {
                switch (category){
                    case 1:  //very cold
                    case 2: //cold and same as case 1 so moved under it
                        if (diff > prevdiff) {
                            result += " and getting colder.";
                        } else {
                            result += " but getting warmer.";
                        }
                        break; // end the switch  
                    case 3: // warm
                    case 4:
                        if (diff > prevdiff) {
                            result += " but getting colder.";
                        } else {
                            result += " and getting warmer.";
                        }
                        break;
                    case 5: //hot
                        if (diff > prevdiff){
                            result += " but getting colder.";
                        }else {
                            result += " and getting hotter";
                        }
                        break;
                }//end of switch
            }//end of else
        }//end of if
        prevcat = category;
        prevdiff = diff;
        result += "\n";
        return result;
    }
}
