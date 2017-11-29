/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennis201516;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author jin
 */
public class ReportTimerThread implements Runnable {

    private String r;

    public ReportTimerThread(final ReportGenerator report) {
        
        int delay = 100000; //100,000-milliseconds = 100 seconds

        ActionListener taskPerformer = new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                report.generateTeamStats();

            }
        };
        new Timer(delay, taskPerformer).start();
    }

    @Override
    public void run() {

    }

}
