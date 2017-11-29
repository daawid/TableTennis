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
public class Match {

    private String hTeam, aTeam;
    private int hTeamWin = 0, aTeamWin = 0;
    private Set[] sets = new Set[5];
    private int[] scoreSet = new int[30];
    private String hPlayer1, hPlayer2, aPlayer1, aPlayer2;
    private boolean played;

    public Match(String hTeam, String aTeam) {
        this.hTeam = hTeam;
        this.aTeam = aTeam;

        sets[0] = new Set();
        sets[1] = new Set();
        sets[2] = new Set();
        sets[3] = new Set();
        sets[4] = new DoubleSet();
        scoreSet[0] = 0;
        scoreSet[1] = 0;

    }

    public boolean isPlayed() {

        return !(scoreSet[0] == 0 && scoreSet[1] == 0);

    }

    public void calculateScores() {
        /** Updates player names before calculating scores for given sets **/
        
        sets[0].setHPlayer(hPlayer1);
        sets[0].setAPlayer(aPlayer1);

        sets[1].setHPlayer(hPlayer1);
        sets[1].setAPlayer(aPlayer2);

        sets[2].setHPlayer(hPlayer2);
        sets[2].setAPlayer(aPlayer1);

        sets[3].setHPlayer(hPlayer2);
        sets[3].setAPlayer(aPlayer2);

        sets[4].setHPlayer(null);
        sets[4].setAPlayer(null);

        for (int i = 0; i < sets.length; i++) {
            Set set = sets[i];

            System.out.println(set.getHPlayer());
            System.out.println(set.getAPlayer());

            System.out.println(Integer.toString(set.calculateHomeWin()));

            if (set.getHWins() > set.getAWins()) {
                hTeamWin++;
            } else if (set.getAWins() > set.getHWins()) {
                aTeamWin++;
            }
        }

    }

    public boolean isHomeWin() {
        return hTeamWin > aTeamWin;
    }

    /** Getters and Setters **/
    public int[] getScoreSet() {
        return scoreSet;
    }

    public void setScoreSet(int[] scoreSet) {
        this.scoreSet = scoreSet;
    }


    public DoubleSet getDoubleSet() {
        return (DoubleSet) sets[4];
    }

    public String getHTeam() {
        return hTeam;
    }

    public void setHTeam(String hTeam) {
        this.hTeam = hTeam;
    }

    public String getATeam() {
        return aTeam;
    }

    public void setATeam(String aTeam) {
        this.aTeam = aTeam;
    }

    public int getHTeamWin() {
        return hTeamWin;
    }

    public void setHTeamWin(int hTeamWin) {
        this.hTeamWin = hTeamWin;
    }

    public int getATeamWin() {
        return aTeamWin;
    }

    public void setATeamWin(int aTeamWin) {
        this.aTeamWin = aTeamWin;
    }

    public Set[] getSets() {
        return sets;
    }

    public void setSets(Set[] sets) {
        this.sets = sets;
    }

    public String getHPlayer1() {
        return hPlayer1;
    }

    public void setHPlayer1(String hPlayer1) {
        this.hPlayer1 = hPlayer1;
    }

    public String getHPlayer2() {
        return hPlayer2;
    }

    public void setHPlayer2(String hPlayer2) {
        this.hPlayer2 = hPlayer2;
    }

    public String getAPlayer1() {
        return aPlayer1;
    }

    public void setAPlayer1(String aPlayer1) {
        this.aPlayer1 = aPlayer1;
    }

    public String getAPlayer2() {
        return aPlayer2;
    }

    public void setAPlayer2(String aPlayer2) {
        this.aPlayer2 = aPlayer2;
    }

    @Override
    public String toString() {
        return "Match:" + hTeam + " vs " + aTeam;
    }

}
