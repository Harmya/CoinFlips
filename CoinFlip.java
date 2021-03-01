import java.util.Scanner;
public class CoinFlip 
{ 
   
public static int Flipper(int n)
  {     int heads = 0 ; int tails = 0;
	for(int i = 0 ; i < n ; i++)
	{
		double ran = Math.random();
		if(ran < 0.5)
		{
			heads++;
		}
		else
		{
			tails++;
		}
	}
	return heads;
  }
  public static void main()
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number of coins you want to flip");

	  int in = sc.nextInt();
	  int head = Flipper(in);
	  int  tail = in - head;
	  float perhead = (head*100)/in;
	  float pertail = (tail*100)/in;
	  System.out.println("Percentage of heads in "+in+" flips: " +perhead);
	  System.out.println("Percentage of tails in "+in+" flips: " +pertail);
}
}
