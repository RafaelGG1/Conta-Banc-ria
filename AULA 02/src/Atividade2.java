import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a;
		
		System.out.println("Digite um número: ");
		
		a = leia.nextInt();
		
		if ((a / 2) == 0 && a > 0) {
		System.out.println("O número" + a + "é par e positivo!");
	} else if ((a / 2) == 0 && a < 0) {
		System.out.println("O número" + a + "é par e negativo!");
		} else if ((a / 2) != 0 && a > 0) {
			System.out.println("O número" + a + "é ímpar e positivo!");
	}  else if ((a / 2 ) != 0 && a < 0) {
		System.out.println("O número" + a + "é ímpar e negativo!");
	}
		
	leia.close(); }
}
		
			
		
		
	




