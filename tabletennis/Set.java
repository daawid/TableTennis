/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennis;

import java.util.ArrayList;

/**
 *
 * @author j-sa
 */
public class Set {

    private String hPlayer, aPlayer;
    private int hWins =0, aWins = 0;
    private ArrayList<Game> games = new ArrayList<>();
    
    public Set(){
        
    }
    

    public String gethPlayer() {
        return hPlayer;
    }

    public void sethPlayer(String hPlayer) {
        this.hPlayer = hPlayer;
    }

    public String getaPlayer() {
        return aPlayer;
    }

    public void setaPlayer(String aPlayer) {
        this.aPlayer = aPlayer;
    }

    public void enterSetScore(int h1, int a1, int h2, int a2, int h3, int a3) {
        System.out.println(h1 + " " + a1 + " " + h2 + " " + a2 + " " + h3 + " " + a3);
        Game g = new Game();
        g.enterGameScore(h1, a1);
        games.add(g);
        
        g = new Game();
        g.enterGameScore(h2, a2);
        games.add(g);
        
        g = new Game();
        g.enterGameScore(h3, a3);
        games.add(g);
    }

    public int calculateHomeWin() {
        for (Game g : games) {
            if(g.isHomeWin()){
                hWins++;
            } else {
                aWins++;
            }
        }
        
        if (hWins > aWins){
            return 1;
        } else {
            return 0;
        }

    }

    public int gethWins() {
        return hWins;
    }

    public void sethWins(int hWins) {
        this.hWins = hWins;
    }

    public int getaWins() {
        return aWins;
    }

    public void setaWins(int aWins) {
        this.aWins = aWins;
    }

    @Override
    public String toString() {
        return "Set{" + "hPlayer=" + hPlayer + ", aPlayer=" + aPlayer + ", hWins=" + hWins + ", aWins=" + aWins + '}';
    }
    
    
    
}
