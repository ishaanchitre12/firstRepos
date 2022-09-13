import java.util.ArrayList;

public class Calculator
{
    private ArrayList<Double> nums = new ArrayList<>();

    public Calculator(ArrayList<Double> inputNums)
    {
        nums = inputNums;
    }

    public double add()
    {
        double total = nums.get(0);
        for (int i=1; i<nums.size(); i++)
        {
            total += nums.get(i);
        }
        return total;
    }

    public double subtract()
    {
        double total = nums.get(0);
        for (int i=1; i<nums.size(); i++)
        {
            total -= nums.get(i);
        }
        return total;
    }

    public double multiply()
    {
        double total = nums.get(0);
        for (int i=1; i<nums.size(); i++)
        {
            total *= nums.get(i);
        }
        return total;
    }

    public double divide()
    {
        double total = nums.get(0);
        for (int i=1; i<nums.size(); i++)
        {
            total /= nums.get(i);
        }
        return total;
    }
}
