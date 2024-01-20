package org.example;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame implements Runnable {

    public Window()  {

        this.setSize(Constants.SCREEEN_WIDTH,Constants.SCREEN_HEIGHT);
        this.setTitle(Constants.SCREEN_TITLE);
        this.setResizable(true);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void update (double dt){
        System.out.println(dt);
    }

    @Override
    public void run() {

        while(true){

        }
    }
}
