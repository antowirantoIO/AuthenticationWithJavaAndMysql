/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import authentication.Register;

/**
 *
 * @author siswa03
 */
public class Main {
    public static void main(String args[]) {
        SplashScreen sp = new SplashScreen();
        sp.setVisible(true);
        sp.pack();
        sp.setLocationRelativeTo(null);
        sp.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
    }
}
