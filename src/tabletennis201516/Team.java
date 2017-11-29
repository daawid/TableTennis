/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennis201516;

import java.util.ArrayList;

/**
 *
 * @author jin
 */
public class Team {
    private String tname;
    private ArrayList<Player> players = new ArrayList<>();
    
    public Team(String tname){
        this.tname = tname;
    }
    
    public void addTeamMember(Player p){
        players.add(p);
        System.out.println("Size is now: " + players.size());
        System.out.println("added" + p.toString() + " to team " + tname);
    }
    
    public ArrayList<String> listMembers(){
        ArrayList<String> p = new ArrayList<>();
        int i = 0;
        while(i < players.size()){
            System.out.println(players.get(i).getPlayerName());
            p.add(players.get(i).getPlayerName());
            i++;
        }
        return p;
    }

    public String getName() {
        return tname;
    }

    public void setName(String tname) {
        this.tname = tname;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    
    @Override
    public String toString() {
        return "Team{" + "players=" + players + '}';
    }
    
}
