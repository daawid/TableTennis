/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennis;

/**
 *
 * @author j-sa
 */
public class Game {

    private int hpoint, apoint;

    public Game() {
        hpoint = 0;
        apoint = 0;
    }


    public void enterGameScore(int hpoint, int apoint) {
        this.hpoint = hpoint;
        this.apoint = apoint;
    }

    public boolean isHomeWin() {
        return hpoint > apoint;
    }

    public int getHpoint() {
        return hpoint;
    }

    public void setHpoint(int hpoint) {
        this.hpoint = hpoint;
    }

    public int getApoint() {
        return apoint;
    }

    public void setApoint(int apoint) {
        this.apoint = apoint;
    }
    
    

    @Override
    public String toString() {
        return hpoint + ":" + apoint;
    }

}
