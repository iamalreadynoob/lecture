package screen;

import questions.QuestionOne;
import questions.QuestionThree;
import questions.QuestionTwo;

import javax.swing.*;
import java.awt.event.*;

public class Buttons
{

    protected Buttons()
    {
        Screen.getInfo.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                int qID = Screen.questionList.getSelectedIndex();

                switch (qID)
                {
                    case 0: JOptionPane.showMessageDialog(null, "find the mean of sum of odd numbers between 1 and N"); break;
                    case 1: JOptionPane.showMessageDialog(null, "convert the given binary number to 10-base"); break;
                    case 2: JOptionPane.showMessageDialog(null, "write number as digits"); break;
                }
            }
        });

        Screen.solve.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                solve();
            }
        });
    }


    private void solve()
    {
        int qID = Screen.questionList.getSelectedIndex();

        switch (qID)
        {
            case 0: Screen.output.setText(new QuestionOne(Screen.input.getText()).getAnswer()); break;
            case 1: Screen.output.setText(new QuestionTwo(Screen.input.getText()).getAnswer()); break;
            case 2: Screen.output.setText(new QuestionThree(Screen.input.getText()).getAnswer()); break;
        }
    }

}
