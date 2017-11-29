/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennis201516;

/**
 *
 * @author j-sa
 */
public class Game {

    private int homePts, awayPts;

    public Game() {
        homePts = 0;
        awayPts = 0;
    }


    public void enterGameScore(int hpoint, int apoint) {
        this.homePts = hpoint;
        this.awayPts = apoint;
    }

    public boolean isHomeWin() {
        return homePts > awayPts;
    }

    public int getHPoints() {
        return homePts;
    }

    public void setHPoints(int hpoint) {
        this.homePts = hpoint;
    }

    public int getAPoints() {
        return awayPts;
    }

    public void setAPoints(int apoint) {
        this.awayPts = apoint;
    }
    
    

    @Override
    public String toString() {
        return homePts + ":" + awayPts;
    }

}
