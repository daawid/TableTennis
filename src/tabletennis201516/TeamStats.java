/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tabletennis201516;

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

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

  //  public void setMatchesPlayed(int matchesPlayed) {
    //    this.matchesPlayed = matchesPlayed;
  //  }

    public int getMatchesWon() {
        return matchesWon;
    }

 //   public void setMatchesWon(int matchesWon) {
  //      this.matchesWon = matchesWon;
  //  }

    public int getSetsWon() {
        return setsWon;
    }

   // public void setSetsWon(int setsWon) {
   //    this.setsWon = setsWon;
    //}
    
    
    public String getName() {
        return tname;
    }

    public void setName(String tname) {
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

