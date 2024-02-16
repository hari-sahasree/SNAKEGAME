import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardwidth = 700;
        int boardHeight = boardwidth;

        JFrame frame = new JFrame("SNAKE");
        frame.setVisible(true);
        frame.setSize(boardwidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Snakegame snakegame = new Snakegame(boardwidth, boardHeight);
        frame.add(snakegame);
        frame.pack();
        snakegame.requestFocus();

    }
}
