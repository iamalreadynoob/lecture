package questions;

public class QuestionTwo implements IQuestion
{

    private String answer;
    private String value;

    public QuestionTwo(String value)
    {
        this.value = value;
        process();
    }

    @Override
    public void process()
    {
        if (isOkay())
        {
            int baseTen = 0;

            for (int i = 0; i < value.length(); i++)
            {
                baseTen += Integer.parseInt(Character.toString(value.charAt(i))) * Math.pow(2, value.length()-1-i);
            }

            answer = Integer.toString(baseTen);
        }
        else answer = "error";
    }

    @Override
    public String getAnswer() {return answer;}

    @Override
    public boolean isOkay()
    {
        boolean okay = true;

        for (int i = 0; i < value.length(); i++)
        {
            if (!(value.charAt(i) == '0' || value.charAt(i) == '1'))
            {
                okay = false;
                break;
            }
        }

        return okay;
    }
}
