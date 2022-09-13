import java.util.Scanner;
import java.util.ArrayList;

public class useCalculator
{
    public static void main(String[] args)
    {
        ArrayList<Double> nums = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers would you like to perform a mathematical operation on?");
        int n = input.nextInt();
        for (int i=0; i<n; i++)
        {
            System.out.println("Enter number " + (i+1));
            double num = input.nextDouble();
            nums.add(num);
        }
        input.nextLine();

        System.out.println("What operation? (+,-,*,/)");
        String op = input.nextLine();

        Calculator calc = new Calculator(nums);
        if (op.equals("+"))
        {
            System.out.println(calc.add());
        }
        else if (op.equals("-"))
        {
            System.out.println(calc.subtract());
        }
        else if (op.equals("*"))
        {
            System.out.println(calc.multiply());
        }
        else if (op.equals("/"))
        {
            System.out.println(calc.divide());
        }
    }
}
