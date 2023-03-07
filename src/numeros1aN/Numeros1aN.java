package numeros1aN;

import java.util.Scanner;

public class Numeros1aN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int numero;
        Scanner entrada = new Scanner(System.in);
		System.out.println("Indica un número: ");
		numero=entrada.nextInt();
		for (int i=1; i<=numero;i++) {
			System.out.println(i);
		}
		entrada.close();
		
		
	}

}
