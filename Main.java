import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";
    ArrayList<String> yay = new ArrayList<String>();

    while (!input.equals("STOP"))
    {
      input = sc.nextLine();
      yay.add(input);
    }
    yay.remove(yay.size()-1);
    int lastIndex = yay.size()-1;
    System.out.println(yay);
    for (int i = lastIndex ; i >= 0; i--)
    {
      String print = yay.get(lastIndex-i) + yay.get(i);
      System.out.println(print);

    }
  }

  // Problem 2 - HighestNum
  public static Integer highestNum(ArrayList<Integer> arr)
  {
    ArrayList<Integer> orig = new ArrayList<Integer>();
    Integer max = 0;
    for (Integer N : orig)
    {
      if (N > max)
      {
        max = N;
      }
    }
    return max;
  }

  // Problem 3 - getEvens
  public static ArrayList<Integer> getEvens(final ArrayList<Integer> arr)
  {
    ArrayList<Integer> orig = new ArrayList<Integer>();
    ArrayList<Integer> evens = new ArrayList<Integer>();
    for (Integer N : orig)
    {
      if (N.intValue()%2 == 0)
      {
        evens.add(N);
      }
    }

    return evens;
  }
}
