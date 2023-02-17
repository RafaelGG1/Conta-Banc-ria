import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String animal01, animal02, animal03;

		System.out.println("Digite o 1º animal: ");
		leia.skip("\\R?");
		animal01 = leia.nextLine();
		System.out.println("Digite o 2º animal: ");
		animal02 = leia.nextLine();
		System.out.println("Digite o 3º animal: ");
		animal03 = leia.nextLine();

		if (animal01.equals("vertebrado")) {
			if (animal02.equals("ave")) {
				if (animal03.equals("carnivoro"))
					System.out.println("águia");
				else
					System.out.println("pomba");

			}
			if (animal03.equals("onivoro")) {
				System.out.println("homem");
			} else
				System.out.println("vaca");
		}

		if (animal02.equals("inseto")) {
			if (animal03.equals("hematofago"))
				System.out.println("pulga");
			else
				System.out.println("lagarta");
		} else {

			if (animal03.equals("onivoro"))
				System.out.println("minhoca");
			else
				System.out.println("sanguessuga");
		}
	}
}
