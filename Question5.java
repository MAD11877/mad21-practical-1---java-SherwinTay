import java.util.Scanner;
import java.util.ArrayList;
import static java.util.Arrays.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    
    // For input
    int occurance = in.nextInt();
    ArrayList<Integer> data = new ArrayList<>();

    for (int i = 0; i < occurance; i ++)
    {
      int adder = in.nextInt();
      data.add(adder);
    }


    // For checking and counting
    int maxnumber = 0;
    int count = 0;
    int maxcount;

    for (int num : data)
    {
        
        for (int check : data)
        {
          if (check == num)
          {
           count++;
          }
        }

        if (count > maxnumber)
        {
          maxnumber = num;
          maxcount = count;
        }
        
    }
    System.out.println(maxnumber);
  }
}
