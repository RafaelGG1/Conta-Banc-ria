import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a,b,c , soma;
		System.out.println("Insira o valor de A: ");
		a = leia.nextInt();
		System.out.println("Insira o valor de B: ");
		b = leia.nextInt();
		System.out.println("Insira o valor de C: ");
		c = leia.nextInt();
		soma = a + b;
		
		if (soma > c) {
			System.out.println(a + "+" + b + "-" + soma + ">" + c );
			System.out.println("A soma de A + B é maior do C. "); } 
			else if (soma < c) {
				System.out.println(a + "+" + b + "-" + soma + "<" + c );
				System.out.println("A soma de A + B é menor do C. "); }
			else if (soma == c) { 
			 System.out.println(a + "+" + b + "-" + soma + "=" + c );
			 System.out.println("A soma de A + B é igual a C. "); 
			} else System.out.println("Valor inválido! ");
	}
}
			 
			
		
		
		
		
		
		 
				
	
		

	

 
