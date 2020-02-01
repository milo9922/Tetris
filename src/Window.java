import javax.swing.*;

public class Window {

    public static final int WIDTH = 300, HEIGHT = 600;
    private JFrame window;
    private Board board;

    public Window() {
        window = new JFrame("Tetris");
        window.setSize(WIDTH, HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        board = new Board();

        window.add(board);

        window.setVisible(true);


    }

    public static void main(String[] args) {
        new Window();
    }
}