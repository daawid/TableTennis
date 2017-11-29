/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennis201516;

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


    /** Getters and Setters **/
    
    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    
    

    public String getHPlayer() {
        return hPlayer;
    }

    public void setHPlayer(String hPlayer) {
        this.hPlayer = hPlayer;
    }

    public String getAPlayer() {
        return aPlayer;
    }

    public void setAPlayer(String aPlayer) {
        this.aPlayer = aPlayer;
    }


    public int getHWins() {
        return hWins;
    }

    public void setHWins(int hWins) {
        this.hWins = hWins;
    }

    public int getAWins() {
        return aWins;
    }

    public void setAWins(int aWins) {
        this.aWins = aWins;
    }

    @Override
    public String toString() {
        return "Set{" + hPlayer + " vs " + aPlayer + " = ";
    }
    
    
    
}
