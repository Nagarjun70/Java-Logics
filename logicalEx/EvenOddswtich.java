package logicalEx;
import java.util.Scanner;
public class EvenOddswtich 
{
	public static void evenoddswitch(int num)
	{
	switch(num%2)
	{
	case 0:System.out.println("even number");
	break;
	case 1:System.out.println("odd number");
	break;
	}
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		EvenOddswtich.evenoddswitch(n);

	}

}
