import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		
		while(s != 2002) {
			System.out.println("Senha Invalida");
			s = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		
		sc.close();

	}

}
