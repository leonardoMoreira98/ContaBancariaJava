package leonardoMoreira98.com.github.projeto.banco.classes;

public class ContaBancariaPr extends ContaBancaria {
	
	private Integer saquesDisponiveis;	

	public ContaBancariaPr(String nome, Double saldo, String numero, String tipo) {
		super(nome, saldo, numero, tipo);
		this.saquesDisponiveis = 3;	
		
	}

	
	@Override
	public void sacar(Double valor) {
		
		if(valor > this.getSaldo() ) { 
			System.err.println("Valor solicitado maior que saldo");
			return;
		}
		if(this.saquesDisponiveis < 1) {
			Double taxa = 0.02;
			Double desconto = valor * taxa;
			Double saldo = valor + desconto;
			this.setSaldo (saldo);
			return;
		}
		super.sacar(valor);
	}
}
