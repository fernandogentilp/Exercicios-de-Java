import java.util.Scanner;

public class triangulo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int altura = sc.nextInt();
		int area = (base * altura) / 2;
		System.out.println("A base é " + base + "\nA altura é " + altura + "\nA area é " + area);
	}
}
