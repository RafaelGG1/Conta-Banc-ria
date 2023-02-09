import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		String nome;
		boolean primeira;
		
		System.out.println("Digite o nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação? ");
		primeira = leia.nextBoolean();
		
		if (idade >= 60 && idade <= 69) {
			if(primeira) 
				System.out.println("Não está apto para doar.");
		   else 
				System.out.println("Está apto para doar."); 
			
			} else if ( idade >= 18 && idade <= 59) {
				if(primeira)
					System.out.println("Está apto para doar. ");
				else
					System.out.println("Não está apto para doar.");
			}
			
		} 
			
		
		
	}


