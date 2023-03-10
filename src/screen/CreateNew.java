package screen;

import javax.swing.*;

public class CreateNew
{

    protected CreateNew()
    {
        Screen.prompt = new JTextField();
        Screen.input = new JTextField();
        Screen.output = new JTextField();
        Screen.questionList = new JComboBox<>();
        Screen.getInfo = new JButton();
        Screen.solve = new JButton();
        Screen.qInfo = new JOptionPane();
    }

}
