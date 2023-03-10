package screen;

import javax.swing.*;

public class Screen extends JFrame
{

    protected static JTextField prompt, input, output;
    protected static JComboBox<String> questionList;
    protected static JButton getInfo, solve;
    protected static JOptionPane qInfo;
    public Screen()
    {
        this.setSize(500, 250);
        this.setResizable(false);
        this.setLayout(null);


        new CreateNew();
        new Add(this);
        new Positions();
        new Buttons();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
