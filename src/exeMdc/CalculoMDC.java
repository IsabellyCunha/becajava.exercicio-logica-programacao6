package exeMdc;

import java.util.Scanner;

public class CalculoMDC {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n1, n2, aux = 1, mdc= 0, contador = 1;
		
		System.out.print("Digite o primeiro n�mero: ");
		n1 = leitor.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		n2 = leitor.nextInt();
		
		
		//verificando qual o menor dos dois numeros digitados pelo usuario e o atribuindo a aux
		 if(n1 < n2) aux = n1; else aux = n2;
		 
		//usando a variavel aux para indicar quando o looping deve parar
		while (contador <= aux) {
			if(n1 % contador == 0 && n2 % contador == 0) {//contador faz a divisao dos numeros
				mdc = contador;//quando a divisao nao deixa casas depois da virgula != 0, o numero do contador � atribuido a variavel mdc
			}
			
			contador++;
		}

		
		System.out.print("\n\nO M�ximo Divisor Comum de " + n1 + " e " +n2+ " �: "+ mdc);
		
		

	}

}
