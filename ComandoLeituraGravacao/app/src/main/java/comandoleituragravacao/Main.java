/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package comandoleituragravacao;

import java.util.Scanner;

public class Main {
   public String getGreeting() {
       return "Hello World!";
   }

    public static void main(String[] args) {
        System.out.println(new Main().getGreeting());
        
        Scanner leitor = new Scanner(System.in);

        //nextInt vai lei a proxima variável inteira e coloca dentro da variável.

        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        //nextLine entrada para uma quantidade grande de texto
        String nome = leitor.nextLine();
        //next entrada para apenas uma palavra
        String nomedeRua = leitor.next();

        //Saída de dados
        System.out.println("imprime e pula para próxima linha");
        System.out.print("imprime e mantem na mesma linha");


    }
}
