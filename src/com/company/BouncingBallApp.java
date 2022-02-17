package com.company;

import javax.swing.JFrame;


public class BouncingBallApp extends JFrame {

    public static void main(String[] args) {
        BouncingBallApp bouncingBallApp = new BouncingBallApp();

        BouncingBallPanel bouncingBallPanel = new BouncingBallPanel();

        bouncingBallApp.setTitle("BouncingBallApp");
        bouncingBallApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Set the appropriate Window Closing Features
        bouncingBallApp.add(bouncingBallPanel);
        bouncingBallPanel.addMouseListener(new BouncingBallPanel());//Make the BBP the "MouseListener" object
        bouncingBallApp.setSize(400, 400);//set window size
        bouncingBallApp.setVisible(true);//make window visible
    }

}
