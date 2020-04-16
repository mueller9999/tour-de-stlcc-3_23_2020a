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
public interface Game
{
   
    public String getGameName();
    public String getInstructions();
    public void setGuess(String guess);
    public String getGuessResult();
    public String getErrorMsg();
    public String getEndMsg();
    public boolean isOver();
}
