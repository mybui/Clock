/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MimiHMB
 */
public class Timer {
    private ClockHand hSec;
    private ClockHand sec;

    public Timer() {
        this.hSec = new ClockHand(100);
        this.sec = new ClockHand(60);
    }

    public void advance() {
        this.hSec.advance();

        if (this.hSec.value() == 0) {
            this.sec.advance();
            
            if (this.sec.value() == 60) {
                this.sec = new ClockHand(60);
            }
        }
    }
    
    public String toString() {
        return sec + ":" + hSec;
    }
}
