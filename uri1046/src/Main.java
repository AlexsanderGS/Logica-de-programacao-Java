import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicio, horaFinal;
		
		
		horaInicio = sc.nextInt();
		horaFinal = sc.nextInt();
		

		int duracao;
		if (horaInicio < horaFinal) {
			duracao = horaFinal - horaInicio;
		}
		else {
			duracao = 24 - horaInicio + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();

	}

}
