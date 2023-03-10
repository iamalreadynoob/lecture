package questions;

public class QuestionOne implements IQuestion

{
    private String answer = null;
    private String limit;
    public QuestionOne(String limit)
    {
        this.limit = limit;
        process();
    }

    @Override
    public void process()
    {
        if (isOkay())
        {
            Integer lastNum = Integer.parseInt(limit);
            int sum = 0;
            int amount = 0;

            if (lastNum >= 0)
            {
                for (int i = 1; i <= lastNum; i++)
                {
                    if (i % 2 == 1)
                    {
                        sum += i;
                        amount++;
                    }
                }
                double result = sum / amount;
                if (result == (int)result) answer = Integer.toString((int) result);
                else answer = Double.toString(result);
            }
            else answer = "error";
        }
    }

    @Override
    public String getAnswer() {return answer;}

    @Override
    public boolean isOkay()
    {
        boolean okay = false;
        try
        {
            Integer temp = Integer.parseInt(limit);
            okay = true;
        }catch (Exception e)
        {
            answer = "error";
        }

        return okay;
    }


}
