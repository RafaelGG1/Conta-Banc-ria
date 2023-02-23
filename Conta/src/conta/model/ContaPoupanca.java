package conta.model;


public class ContaPoupanca extends Conta{

	private int niver;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.niver = aniversario;
	}

	public int getAniversario() {
		return niver;
	}

	public void setAniversario(int aniversario) {
		this.niver = aniversario;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("AniversÃ¡rio da conta: " + this.niver);
	}
	
}