import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a1 = input.nextInt() ;
		int a2 = input.nextInt();
		cal c = new cal();
		
		
		System.out.println(c.add(a1,a2));
		System.out.println(c.subtract(a1, a2));
		System.out.println(c.mul(a1, a2));
		System.out.println(c.div(a1, a2));
	}

}
