import javax.swing.*;

public class Window {

    public static final int WIDTH = 440, HEIGHT = 640;
    private JFrame window;
    private Board board;

    public Window() {
        window = new JFrame("Tetris");
        window.setSize(WIDTH, HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        board = new Board();

        window.add(board);
        window.addKeyListener(board);
        window.setVisible(true);
        window.setResizable(false);

    }

    public static void main(String[] args) {
        new Window();
    }
}
