package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String name;
		String answer;
		int account, op;
		double value = 0;
		Boolean option = false;
		Account a;

		System.out.println(
				"Bom Dia, para efetuar o cadastro da sua conta, deseja realizar um deposito inicial? (yes/no) ");

		answer = sc.nextLine();

		if (answer.equalsIgnoreCase("yes")) {
			option = true;
		}

		if (option == true) {

			System.out.println("Digite o nome");
			name = sc.nextLine();
			System.out.println("Digite a conta");
			account = sc.nextInt();
			System.out.println("Digite o valor de depósito inicial");
			value = sc.nextDouble();
			
			a = new Account(name, account, value);


		} else {
			System.out.println("Digite o nome");
			name = sc.nextLine();
			System.out.println("Digite a conta");
			account = sc.nextInt();
			
			a = new Account(name, account);

		}

		

		a.Saldo();

		do {

			System.out.println(
					"\n \n \nEscolha uma operação \n Digite 0 para Saque \n Digite 1 para Depósito \n para sair digite 3");

			op = sc.nextInt();

			switch (op) {
			case 0:

				System.out.println("\n Digite o valor de Saque");

				a.Saque(sc.nextDouble());

				a.Saldo();

				break;

			case 1:

				System.out.println("\n Digite o valor de depósito");
				a.Deposito(sc.nextDouble());

				System.out.println(a);

				break;
				
			case 3:

				System.out.println("\n Obrigado e tenha um bom dia");

				break;				
				

			default:
				System.out.println("opção inválida");
				break;
			}
		} while (op != 3);

	}

}
