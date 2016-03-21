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
public class Player {

    private String pname;// assume players have unique names

    public Player(String pname) {
        this.pname = pname;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "Player{" + "pname=" + pname + '}';
    }

}
