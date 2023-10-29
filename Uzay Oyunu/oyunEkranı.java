import javax.swing.JFrame;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class oyunEkranı extends JFrame{
    /**
     * @param title
     * @throws HeadlessException
     */
    public oyunEkranı (String title) throws HeadlessException {
        super (title);
    }
          
    public static void main(String[] args) throws FileNotFoundException, IOException {
        oyunEkranı ekran = new oyunEkranı("Uzay Oyunu");
        ekran.setResizable(false);
        ekran.setFocusable(false);
        ekran.setSize(800,600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game oyun = new Game();
        oyun.requestFocus();
        oyun.addKeyListener(oyun);
        oyun.setFocusable(true);
        oyun.setFocusTraversalKeysEnabled(false);


        ekran.add(oyun);
        ekran.setVisible(true);
        

    }
}