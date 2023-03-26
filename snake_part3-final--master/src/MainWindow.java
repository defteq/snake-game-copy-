import javax.swing.*;

/**
 * Created by defteq on 30/10/22.
 */
public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,320);
        setLocation(200,200);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
