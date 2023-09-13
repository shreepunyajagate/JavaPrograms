import java.util.Scanner;
class ArithmeticOperations{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, Enter two numbers which need to be done arithmetic operation");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("The sum of two integer is "+ (a+b));
		System.out.println("The difference of two integer is "+ (a-b));
		System.out.println("The product of two integer is "+ (a*b));
		System.out.println("The division of two integer is "+ (a/b));
		System.out.println("The modulus of two integer is "+ (a%b));
}
}