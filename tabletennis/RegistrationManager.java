package tabletennis;

import java.util.ArrayList;

public class RegistrationManager {

    private ArrayList<Team> teams = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();

    public RegistrationManager() {

    }

    public void createAndAddTeam(String tname) {
        Team t = new Team(tname);
        teams.add(t);
        System.out.println("Team " + tname + " created");
    }

    public void createAndAttachPlayer(String tname, String pname) {
        Player p = new Player(pname);
        for (Team t : teams) {
            if(t.getTname().equals(tname)){
                t.addTeamMember(p);
                System.out.println("Player " + pname + " added to " + tname);
                break;
            }
        }
        players.add(p);

    }

    public ArrayList<String> returnPlayers(String tname) {
        Team t = new Team(tname);
        return t.listMembers();
    }

    public Team getATeam(String tname) {
        for (Team t : teams) {
            if (t.getTname().equals(tname)) {
                return t;
            }
        }
        return null;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }


    
    

}
