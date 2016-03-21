/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennis;

import java.util.*;

/**
 *
 * @author j-sa
 */
public class Fixtures {

    private ArrayList<Match> matches = new ArrayList();
    private ArrayList<Team> tempteam = new ArrayList();

    public Fixtures() {

    }

    public ArrayList<Team> getTempteam() {
        return tempteam;
    }

    public void setTempteam(ArrayList<Team> tempteam) {
        this.tempteam = tempteam;
    }
    
    

    public void generateFixtures(RegistrationManager reg) {
        tempteam = reg.getTeams();
        for (int i=0; i<tempteam.size(); i++){
            for (int j = 0; j<tempteam.size(); j++){
                Match match = new Match(tempteam.get(i).getTname(), tempteam.get(j).getTname());
                matches.add(match);
            }
        }

    }

    public void showFixtures() {
        for (Match m : matches) {
            System.out.println(m.gethTeam() + " v " + m.getaTeam());
        }
    }

    public Match getAMatch(String hteam, String ateam) {

        Match match = null;
        for (Match m : matches) {
            if (m.gethTeam().equalsIgnoreCase(hteam) && m.
                    getaTeam().equalsIgnoreCase(ateam)) {
                match = m;
            }
        }
        return match;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }

}
