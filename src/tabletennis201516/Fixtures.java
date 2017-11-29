/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennis201516;

import java.util.*;

/**
 *
 * @author j-sa
 */
public class Fixtures {

    public ArrayList<Match> matches = new ArrayList();
    private ArrayList<Team> temp = new ArrayList();

    public Fixtures() {

    }


    public void generateFixtures(RegistrationManager reg) {
        temp = reg.getAllTeams();
        matches.clear();
        for (int i = 0; i < temp.size(); i++) {
            for (int j = 0; j < temp.size(); j++) {
                Match match = new Match(temp.get(i).getName(),temp.get(j).getName());
                matches.add(match);
            }
            
        }
                for (Match m : matches) {
          System.out.println(m.getHTeam() + " v " + m.getATeam());
        }
}




    public Match getAMatch(String hteam, String ateam) {

        for (Match m : matches) {
            if (m.getHTeam().equals(hteam) && m.getATeam().equals(ateam)) {
                return m;
            }
        }
        return null;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }
    
        public ArrayList<Team> getTempTeam() {
        return temp;
    }

    public void setTempTeam(ArrayList<Team> tempteam) {
        this.temp = tempteam;
    }

}
