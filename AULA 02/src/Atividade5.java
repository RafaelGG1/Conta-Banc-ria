import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int produto, valor;
		

		System.out.println("Código dos produtos ");
		System.out.println("1-\tCachorro quente = R$ 10,00 ");
		System.out.println("2-\tX - salada = R$ 15,00 ");
		System.out.println("3-\tX - bacon = R$ 18,00 ");
		System.out.println("4-\tBauru = R$ 12,00 ");
		System.out.println("5-\tRefrigerante = R$ 8,00 ");
		System.out.println("6-\tSuco = R$ 13,00 ");
	
		System.out.println(" Digite o número do produto: ");
		produto = leia.nextInt();
		System.out.println("Insira a quantidade: ");
		valor = leia.nextInt();
		
		switch (produto) { 
		case 1: 
			System.out.println("O valor do Cachorro quente é R$: " + (valor * 10) );
			
			break;
		case 2: 
			System.out.println("O valor do X-Salada é R$: " + (valor * 15));
			
			
			break;
			
		case 3: 
			System.out.println("O valor do X - bacon é R$: " + (valor * 18 ));
			
			break;
			
		case 4:
			System.out.println("O valor do Bauru é R$: " + (valor * 12 ));
			
			break;
			
		case 5:
			System.out.println("O valor do Refrigerante é R$: " + (valor * 8 ));
			
			break;
			
		case 6: 
			System.out.println("O valor do Suco de Laranja é R$: " + (valor * 13 ));
			
			break;
			default:
				System.out.println("Produto inválido! ");				
				
		

		
		
		}
		
		
		
	leia.close();}
		
	
	
	
	

}
