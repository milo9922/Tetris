import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Board extends JPanel {

    private BufferedImage blocks;
    private final int blockSize = 30;
    private final int boardWidth = 10, boardHeight = 20;
    private int[][] board = new int[boardWidth][boardHeight];

    public Board() {
        try {
            blocks = ImageIO.read(Board.class.getResource("/blocks.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(int i = 0; i < boardHeight; i++) {
            g.drawLine(0, i*blockSize, boardWidth*blockSize, i*blockSize);
        }

        for(int j = 0; j < boardWidth; j++) {
            g.drawLine(j*blockSize, 0, j*blockSize, boardHeight*blockSize);
        }
    }
}
