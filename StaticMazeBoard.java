import javax.swing.*;
import java.awt.*;

public class StaticMazeBoard {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Static Maze");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new JPanel() {
            int rows = 7;
            int cols = 5;
            int cellSize = 40;

            int[][] maze = {
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 1, 1, 1},
        {1, 0, 0, 9, 1},
        {1, 1, 1, 1, 1}
            };

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.translate(100, 100); 

                for (int y = 0; y < rows; y++) {
                    for (int x = 0; x < cols; x++) {
                        if (maze[y][x] == 1) {
                            g.setColor(Color.BLACK);
                        } else if (maze[y][x] == 9) {
                            g.setColor(Color.RED);
                        } else {
                            g.setColor(Color.WHITE);
                        }
                        g.fillRect(x * cellSize, y * cellSize, cellSize, cellSize);
                        g.setColor(Color.GRAY);
                        g.drawRect(x * cellSize, y * cellSize, cellSize, cellSize);
                    }
                }

              
                g.setColor(Color.BLUE);
                g.fillRect(1 * cellSize, 1 * cellSize, cellSize, cellSize);
            }
        });

        frame.setVisible(true);
    }
}