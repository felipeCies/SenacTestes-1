package com.senac.bugs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Criação do Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número que deseja encontrar: ");
        int numberToFind = scanner.nextInt();

        int index = numbers.indexOf(numberToFind);
        if (index != -1) {
            System.out.println("O número " + numberToFind + " foi encontrado na posição " + index);
        } else {
            System.out.println("O número " + numberToFind + " não foi encontrado");
        }

        // Fechando o Scanner após o uso
        scanner.close();
    }
}