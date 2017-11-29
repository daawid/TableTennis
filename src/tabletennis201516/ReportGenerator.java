/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennis201516;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jin
 */
public class ReportGenerator {

     ArrayList<Match> matches = new ArrayList();
     ArrayList<Team> teams = new ArrayList();
    private ArrayList<TeamStats> tstats = new ArrayList();

    public ReportGenerator(Fixtures fix) {
        this.matches = fix.getMatches();
        this.teams = fix.getTempTeam();
        this.tstats.clear();
        for (Team t : teams) {
            TeamStats te = new TeamStats(t.getName());
            tstats.add(te);
            System.out.println("Added teamstats for: " + t.getName());
        }
    }

    /**
     * matches played matches won sets won*
     */
    public void generateTeamStats() {
        for (Match m : matches) {
            String hteam = m.getHTeam();
            String ateam = m.getATeam();
            if (m.isPlayed()) {
                System.out.println(m.getHTeam() + " v " + m.getATeam());
                for (TeamStats t : tstats) {
                    if (t.getName().equals(hteam)) {
                        t.addMatchesPlayed(1);
                        t.addSetsWon(m.getHTeamWin());
                        if (m.isHomeWin()) {
                            t.addMatchesWon(1);
                        }
                    } else if (t.getName().equals(ateam)) {
                        t.addMatchesPlayed(1);
                        t.addSetsWon(m.getATeamWin());
                        if (!m.isHomeWin()) {
                            t.addMatchesWon(1);
                        }
                    }
                    System.out.println(t.toString());
                }
            }

        }
    }

    public String returnTeamStats() {
        String stats = "";
        ArrayList<TeamStats> orderedlist = new ArrayList(tstats);  
        Collections.sort(orderedlist, new StatsComparator());
 
        for (TeamStats t : orderedlist) {
            stats += t.toString();
            stats += System.lineSeparator();
        }
        return stats;
    }
    
       public String returnTeamStats1() { //to delete if upper works
        String stats = "";
        for (TeamStats t : tstats) {
            stats += t.toString();
            stats += System.lineSeparator();
        }
        return stats;
    }
    

    public void showFixturesResults() {

        JDialog dialog = null;
        JOptionPane optionPane = new JOptionPane();
        optionPane.setMessage("Fixtures and results");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JPanel matrixPanel = new JPanel();
        String cell = "";

        ArrayList<String> names = new ArrayList<>();

        for (Team t : teams) {
            names.add(t.getName());
            System.out.println(t.getName());
        }

        matrixPanel.setLayout(new GridLayout(names.size() + 1, names.size() + 1));

        // add the first Blank slot in row 1, i.e. top left corner
        matrixPanel.add(new JLabel("....."));
        //add all the team names to row 1
        for (String n : names) {
            matrixPanel.add(new JLabel(" " + n + " "));
        }

        //fill in each of the cells
        for (String hname : names) {
            // add the home team name in the first column
            matrixPanel.add(new JLabel(hname));
            //add the match scores between hname team and the aname team match
            for (String aname : names) {
                if (aname.equalsIgnoreCase(hname)) {
                    cell = "---";
                } else {
                    for (Match m : matches) {
                        if (m.getHTeam().equals(hname) && m.getATeam().equals(aname)) {
                            if (m.getHTeamWin() + m.getATeamWin() != 5) {
                                cell = "np";
                            } else {
                                cell = Integer.toString(m.getHTeamWin()) + ":" + Integer.toString(m.getATeamWin());
                            }
                        }
                    }

                }
                matrixPanel.add(new JLabel(cell));

            }
        }
        optionPane.setOptionType(JOptionPane.DEFAULT_OPTION);
        optionPane.add(matrixPanel, 1);
        dialog = optionPane.createDialog(null, "Icon/Text Button");
        dialog.setVisible(true);
    }

}
