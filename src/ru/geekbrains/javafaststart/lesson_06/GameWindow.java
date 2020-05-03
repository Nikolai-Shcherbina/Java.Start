package ru.geekbrains.javafaststart.lesson_06;

import javax.swing.*;
import java.awt.*;

/**
 * @author Nikolai Shcherbina
 */

public class GameWindow extends JFrame {
    private static GameWindow game_window;

    public static void main(String[] args) {
        game_window = new GameWindow();
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_window.setLocation(200, 100);
        game_window.setSize(906, 478);
        game_window.setResizable(false); // запрет на изменение окна
        GameField game_field = new GameField();
        game_window.add(game_field);
        game_window.setVisible(true); // делаем окно видимым
    }
    private static void onRepaint(Graphics g) {
        g.drawLine(100, 250, 850, 250);
    }
    private static class GameField extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
        super.paintComponent(g);
        onRepaint(g);
        }
    }
}
