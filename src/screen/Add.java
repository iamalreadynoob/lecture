package screen;

import javax.swing.*;

public class Add
{

    protected Add(JFrame frame)
    {
        frame.add(Screen.prompt);
        frame.add(Screen.input);
        frame.add(Screen.output);
        frame.add(Screen.questionList);
        frame.add(Screen.getInfo);
        frame.add(Screen.solve);
        frame.add(Screen.qInfo);
    }

}
