package leonardoMoreira98.com.github.projeto.banco.apps;

import leonardoMoreira98.com.github.projeto.banco.classes.ContaBancaria;
import leonardoMoreira98.com.github.projeto.banco.classes.ContaBancariaPj;

public class Programa1 {
	
	public static void main(String args[]) {
		
		ContaBancaria conta1 = new ContaBancariaPj ("Leonardo Moreira", 989.99, "678354", "PJ" );
		
		conta1.depositar(100.0);
		System.out.println("Deposito");
		System.out.println();
		conta1.detalhes();
		
		conta1.sacar(100.0);
		System.out.println();
		System.out.println("Saque 1");
		System.out.println();
		conta1.detalhes();
		
		conta1.sacar(100.0);
		System.out.println();
		System.out.println("Saque 2");
		System.out.println();
		conta1.detalhes();
		
		conta1.sacar(100.0);
		System.out.println();
		System.out.println("Saque 3");
		System.out.println();
		conta1.detalhes();
		
		conta1.sacar(100.0);
		System.out.println();
		System.out.println("Saque 4");
		System.out.println();
		conta1.detalhes();

	}
	
}