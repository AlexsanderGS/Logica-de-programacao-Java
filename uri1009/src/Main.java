import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salarioFixo;
		double qtdVendas;
		
		nome = sc.next();
		salarioFixo = sc.nextDouble();
		qtdVendas = sc.nextDouble();
		
		double total = qtdVendas * 0.15 + salarioFixo;
		
		System.out.printf("TOTAL = R$ %.2f%n", total);
		
		sc.close();

	}

}
