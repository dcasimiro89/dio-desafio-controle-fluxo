package application;

import entities.ParametrosInvalidosException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {

        try {
            menuContador();

        } catch (ParametrosInvalidosException p) {
            System.out.println("Erro: " + p.getMessage());
            menuContador();
        } catch (InputMismatchException i) {
            System.out.println("Erro: Caractere digitado ao invés de número!");
            System.out.println("Digitar o segundo número digitado maior que o primeiro!");
            menuContador();
        } finally {
            System.out.println("Finalizando sistema...");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }

    static void menuContador() throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        contar(parametroUm, parametroDois);
    }
}
