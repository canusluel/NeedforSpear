package tr.edu.ku.devnull.needforspear.Model.Player;

import tr.edu.ku.devnull.needforspear.Model.GameData.Constants;
import tr.edu.ku.devnull.needforspear.Model.Spell.Spell;

import java.util.ArrayList;
import java.util.List;

/**
 * Account is a class which contains information regarding the account
 * of a player and decreases their lives depending on game state.
 */
public class Player {
    private Account account;
    private int score;
    private int lives;
    private List<Spell> listofSpells;

    /**
     * Constructor for Player.
     *
     * @param account Account attribute of the Player.
     */
    public Player(Account account) {
        this.account = account;
        this.score = Constants.UIConstants.INIT_SCORE;
        this.lives = Constants.UIConstants.INIT_LIVES;
        this.listofSpells = new ArrayList<>();
    }

    /**
     * Empty constructor for the Player.
     */
    public Player() {
    }

    /**
     * Gets the account of player.
     *
     * @return account value of Player.
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Gets the score of player.
     *
     * @return score value of Player.
     */
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * Gets the lives of player.
     *
     * @return lives value of Player.
     */
    public Integer getLives() {
        return lives;
    }

    public void setLives(Integer lives) {
        this.lives = lives;
    }

    /**
     * Gets the list of spell the player possesses.
     *
     * @return List of the Player's Spells.
     */
    public List<Spell> getListofSpells() {
        return listofSpells;
    }

    /**
     * Decreases the lives of the Player by 1.
     */
    public void decreaseLives() {
        System.out.println("current lives: " + this.lives);
        if (lives > 0) this.lives -= Constants.UIConstants.ONE_LIVES_GAIN_LOSE;
        System.out.println("player lives decreased! current lives: " + this.lives);
    }

    /**
     * Increases the lives of the Player by 1.
     */
    public void increaseLives() {
        System.out.println("current lives: " + this.lives);
        this.lives += Constants.UIConstants.ONE_LIVES_GAIN_LOSE;
        System.out.println("player lives increased! current lives: " + this.lives);
    }

    /**
     * Sets the list of spells
     *
     * @param listofSpells List to be set.
     */
    public void setListofSpells(List<Spell> listofSpells) {
        this.listofSpells = listofSpells;
    }
}
