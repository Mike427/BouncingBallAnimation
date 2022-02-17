package com.company;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class BouncingBallPanel extends JPanel implements Runnable, MouseListener {
    private int ballCount;
    private final ArrayList<Ball> ballArray;
    Thread thread = new Thread();

    public BouncingBallPanel() {
        ballArray = new ArrayList<>(20);
    }

    @Override
    public void run() {

        while (true) {
            for (Ball ball : ballArray) {
                ball.move();
            }
            repaint();
            try {
                thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ballArray.add(new Ball());
        for (Ball ball : ballArray) {
            g.setColor(Color.BLUE);
            g.fillOval((int) ball.getX(), (int) ball.getY(), (int) ball.getDiameter(), (int) ball.getDiameter());
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

        Ball newBall = new Ball();//create new Ball and
        ballArray.add(newBall);//add to the array
        ballCount++;//increment ballCount

        if (ballCount == 1) {
            thread.start();//Start the thread
        }

        int x = mouseEvent.getX();
        int y = mouseEvent.getY();
        System.out.println(x + " , " + y);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

}
