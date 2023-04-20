import java.util.Scanner;

public class delta {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double delta = Math.pow(b, 2) - (4 * a * c);
		System.out.println("A taxa de variação é " + delta);
	}
}
