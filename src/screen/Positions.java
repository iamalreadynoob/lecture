package screen;

import java.awt.*;

public class Positions
{


    protected Positions()
    {
        Font textFont = new Font("arial", Font.BOLD, 25);


        Screen.prompt.setText("select question:");
        Screen.prompt.setBounds(10, 10, 250, 30);
        Screen.prompt.setBorder(null);
        Screen.prompt.setEditable(false);
        Screen.prompt.setBackground(null);
        Screen.prompt.setForeground(Color.BLACK);
        Screen.prompt.setFont(textFont);

        Screen.questionList.setBounds(270, 10, 100, 30);
        Screen.questionList.setBorder(null);
        Screen.questionList.setBackground(Color.BLACK);
        Screen.questionList.setForeground(Color.RED);
        Screen.questionList.addItem("Q1");
        Screen.questionList.addItem("Q2");
        Screen.questionList.addItem("Q3");
        Screen.questionList.setSelectedItem(null);

        Screen.getInfo.setBounds(400, 10, 70, 30);
        Screen.getInfo.setBorder(null);
        Screen.getInfo.setBackground(Color.BLACK);
        Screen.getInfo.setForeground(Color.RED);
        Screen.getInfo.setText("info");

        Screen.input.setBounds(10, 100, 300, 30);
        Screen.input.setBorder(null);
        Screen.input.setBackground(Color.BLACK);
        Screen.input.setForeground(Color.RED);
        Screen.input.setFont(textFont);

        Screen.output.setBounds(10, 150, 300, 30);
        Screen.output.setBorder(null);
        Screen.output.setBackground(Color.BLACK);
        Screen.output.setForeground(Color.RED);
        Screen.output.setFont(textFont);
        Screen.output.setEditable(false);

        Screen.solve.setBounds(340, 100, 100, 30);
        Screen.solve.setBorder(null);
        Screen.solve.setBackground(Color.BLACK);
        Screen.solve.setForeground(Color.RED);
        Screen.solve.setText("solve");
    }

}
