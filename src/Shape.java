import java.awt.*;
import java.awt.image.BufferedImage;

public class Shape {

    private BufferedImage block;
    private int[][] coords;
    private Board board;
    private int deltaX = 0;
    private int x, y;
    private int normalSpeed = 600, speedDown = 60, currentSpeed;
    private long time, lastTime;

    public Shape(BufferedImage block, int[][] coords, Board board) {
        this.block = block;
        this.coords = coords;
        this.board = board;

        currentSpeed = normalSpeed;
        time = 0;
        lastTime = 0;

        x = 4;
        y = 0;
    }

    public void update() {
        time += System.currentTimeMillis() - lastTime;
        lastTime = System.currentTimeMillis();


        if (!(x + deltaX + coords[0].length > 10) && !(x + deltaX < 0))
            x += deltaX;

        if (!(y + 1 + coords.length > 20)) {

            if (time > currentSpeed) {
                y++;
                time = 0;
            }

            deltaX = 0;
        }
    }

    public void render(Graphics g) {

        for (int row = 0; row < coords.length; row++) {
            for (int col = 0; col < coords[row].length; col++) {
                if (coords[row][col] != 0) {
                    g.drawImage(block, col * board.getBlockSize() + x * board.getBlockSize(),
                            row * board.getBlockSize() + y * board.getBlockSize(), null);
                }
            }
        }
    }
/*
    public void rotate() {

    }

    private int[][] getTranspose(int[][] matrix) {

    }

    private int[][] getReverseMatrix(int[][] matrix) {
        int middle = matrix.length / 2;

        for(int i = 0; i < middle; i++) {
            int[] m = matrix[i];

        }
    }
*/
    public void setDeltaX(int deltaX) {
        this.deltaX = deltaX;
    }

    public void normalSpeed() {
        currentSpeed = normalSpeed;
    }

    public void speedDown() {
        currentSpeed = speedDown;
    }

}
