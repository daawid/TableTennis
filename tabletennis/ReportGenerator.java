/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennis;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jin
 */
public class ReportGenerator {

    private ArrayList<Match> matches = new ArrayList();
    private ArrayList<Team> teams = new ArrayList();
    private ArrayList<TeamStats> tstats = new ArrayList();

    public ReportGenerator(Fixtures fix) {
        this.matches = fix.getMatches();
        this.teams = fix.getTempteam();

        for (Team t : teams) {
            TeamStats te = new TeamStats(t.getTname());
            tstats.add(te);
            System.out.println("Added teamstats for: " + t.getTname());
        }
    }

    /**
     * matches played matches won sets won*
     */
    public void generateTeamStats() {
        for (Match m : matches) {
            String hteam = m.gethTeam();
            String ateam = m.getaTeam();
            if (m.isPlayed()) {
                System.out.println(m.gethTeam() + " v " + m.getaTeam());
                for (TeamStats t : tstats) {
                    if (t.getTname().equals(hteam)) {
                        t.addMatchesPlayed(1);
                        t.addSetsWon(m.gethTeamWin());
                        if (m.isHomeWin()) {
                            t.addMatchesWon(1);
                        }
                    } else if (t.getTname().equals(ateam)) {
                        t.addMatchesPlayed(1);
                        t.addSetsWon(m.getaTeamWin());
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
        for (TeamStats t : tstats) {
            stats += t.toString();
            stats += System.lineSeparator();
        }
        return stats;
    }

    public static void main(String[] args) {

        JDialog dialog = null;
        JOptionPane optionPane = new JOptionPane();
        optionPane.setMessage("Matrix display");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JPanel matrixPanel = new JPanel();
        String cell;

        ArrayList<String> names = new ArrayList<>();
        names.add("t1");
        names.add("t2");
        names.add("t3");
        names.add("t4");
        names.add("t5");

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
                    cell = "np";// you need to get the actual scores from the match 
                    //and display the actual final scores if it has been played.                    
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
