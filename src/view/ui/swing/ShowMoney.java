package view.ui.swing;

import java.awt.Dimension;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import model.Money;

public class ShowMoney extends JFrame {

    public ShowMoney(Money money) {
        super("Result");
        add(new JLabel(money + " " + money.getCurrency()));
        setSize(new Dimension(200,100));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
