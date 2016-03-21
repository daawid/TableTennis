/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tabletennis;

/**
 *
 * @author jin
 */


public class TeamStats {
   
    private String tname; 
    private int matchesPlayed, matchesWon, setsWon;
    
    public TeamStats(String tname){
        this.tname = tname;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
    
    
    public void addMatchesPlayed(int mPlayed){
        this.matchesPlayed += mPlayed;
    }
    
    public void addMatchesWon(int mWon){
        this.matchesWon += mWon;
    }
    
    public void addSetsWon(int sWon){
        this.setsWon += sWon;
    }

    @Override
    public String toString() {
        return tname + ": matchesPlayed=" + matchesPlayed + ", matchesWon=" + matchesWon + ", setsWon=" + setsWon + '}';
    }
    
    
    
}

