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
public class Match {

    private String hTeam, aTeam;
    private int hTeamWin = 0, aTeamWin = 0;
    private Set[] sets = new Set[5];
    private int[] scoreSet = new int[30];
    private String hPlayer1, hPlayer2, aPlayer1, aPlayer2;

    public Match(String hTeam, String aTeam) {
        this.hTeam = hTeam;
        this.aTeam = aTeam;

        sets[0] = new Set();
        sets[1] = new Set();
        sets[2] = new Set();
        sets[3] = new Set();
        sets[4] = new DoubleSet();
        scoreSet[0] = 0; scoreSet[1] = 0;

    }

    public int[] getScoreSet() {
        return scoreSet;
    }

    public void setScoreSet(int[] scoreSet) {
        this.scoreSet = scoreSet;
    }

    private void updateNames() {
        sets[0].sethPlayer(hPlayer1);
        sets[0].setaPlayer(aPlayer1);

        sets[1].sethPlayer(hPlayer1);
        sets[1].setaPlayer(aPlayer2);

        sets[2].sethPlayer(hPlayer2);
        sets[2].setaPlayer(aPlayer1);

        sets[3].sethPlayer(hPlayer2);
        sets[3].setaPlayer(aPlayer2);

        sets[4].sethPlayer(null);
        sets[4].setaPlayer(null);
    }

    public DoubleSet getDoubleSet() {
        return (DoubleSet) sets[4];
    }

    public boolean isPlayed() {
        
        return !(scoreSet[0] == 0 && scoreSet[1] == 0);

    }

    public void calculateScores() {

        updateNames();

        for (int i = 0; i < sets.length; i++) {
            Set set = sets[i];

            System.out.println(set.gethPlayer());
            System.out.println(set.getaPlayer());

            System.out.println(Integer.toString(set.calculateHomeWin()));

            if (set.gethWins() > set.getaWins()) {
                hTeamWin++;
            } else if (set.getaWins() > set.gethWins()) {
                aTeamWin++;
            }

            /**
             * if (set.calculateHomeWin() == 1) { hTeamWin++;
             * System.out.println("hteamwin " + hTeamWin); } else { aTeamWin++;
             * System.out.println("ateamwin " + aTeamWin); } *
             */
        }

    }

    public boolean isHomeWin() {
        return hTeamWin > aTeamWin;
    }

    public String gethTeam() {
        return hTeam;
    }

    public void sethTeam(String hTeam) {
        this.hTeam = hTeam;
    }

    public String getaTeam() {
        return aTeam;
    }

    public void setaTeam(String aTeam) {
        this.aTeam = aTeam;
    }

    public int gethTeamWin() {
        return hTeamWin;
    }

    public void sethTeamWin(int hTeamWin) {
        this.hTeamWin = hTeamWin;
    }

    public int getaTeamWin() {
        return aTeamWin;
    }

    public void setaTeamWin(int aTeamWin) {
        this.aTeamWin = aTeamWin;
    }

    public Set[] getSets() {
        return sets;
    }

    public void setSets(Set[] sets) {
        this.sets = sets;
    }

    public String gethPlayer1() {
        return hPlayer1;
    }

    public void sethPlayer1(String hPlayer1) {
        this.hPlayer1 = hPlayer1;
    }

    public String gethPlayer2() {
        return hPlayer2;
    }

    public void sethPlayer2(String hPlayer2) {
        this.hPlayer2 = hPlayer2;
    }

    public String getaPlayer1() {
        return aPlayer1;
    }

    public void setaPlayer1(String aPlayer1) {
        this.aPlayer1 = aPlayer1;
    }

    public String getaPlayer2() {
        return aPlayer2;
    }

    public void setaPlayer2(String aPlayer2) {
        this.aPlayer2 = aPlayer2;
    }

}
