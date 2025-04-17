import java.util.Scanner;
import java.lang.Math;

public class Calculadora_Terminal_2 {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
        boolean voltarMenu = true;

        while (voltarMenu) {
            System.out.println("  BEM-VINDO(A) A SUA CALCULADORA FAZ TUDO!\n               MENU PRINCIPAL:");
            System.out.println(" ");
            System.out.println("1. Somar\n2. Subtrair\n3. Multiplicar\n4. Dividir\n5. Procentagem\n6. Potência\n7. Fração\n8. Fórmulas\n9. Conversor de termperatura\n10. Conversor de medidas\n11. Raiz quadrada");
            System.out.println(" ");
            System.out.printf(" > Qual função deseja usar? ");
            int resposta = entrada.nextInt();

            switch (resposta) {
                case 1: // adição
                System.out.printf(" - Digite o 1º número: ");
                double somar_numero_1 = entrada.nextDouble();
                System.out.printf(" - Digite o 2º número: ");
                double somar_numero_2 = entrada.nextDouble();
                double soma = somar_numero_1 + somar_numero_2;
                System.out.println(" >> O resultado é: "+soma);
                System.out.printf(" \n > Fim do programa, deseja voltar ao início? ");
                String voltar = entrada.next();
                if (voltar.equals("sim")) {
                    System.out.println(" > Voltando ao menu principal...\n ");
                    break;
                }
                else {
                    voltarMenu = false;
                    System.out.println(" \n | PROGRAMA ENCERRADO! |\n ");
                }
                break;

                case 2: // subtração
                System.out.printf(" - Digite o 1º número: ");
                double subtrair_numero_1 = entrada.nextDouble();
                System.out.printf(" - Digite o 2º número: ");
                double subtrair_numero_2 = entrada.nextDouble();
                double subtracao = subtrair_numero_1 - subtrair_numero_2;
                System.out.println(" >> O resultado é: "+subtracao);
                System.out.printf(" \n > Fim do programa, deseja voltar ao início? ");
                String voltar_2 = entrada.next();
                if (voltar_2.equals("sim")) {
                    System.out.println(" > Voltando ao menu principal...\n ");
                    break;
                }
                else {
                    voltarMenu = false;
                    System.out.println(" \n | PROGRAMA ENCERRADO! |\n ");
                }
                break;

                case 3: // multiplicação
                System.out.printf(" - Digite o 1º número: ");
                double multiplicar_numero_1 = entrada.nextDouble();
                System.out.printf(" - Digite o 2º número: ");
                double multiplicar_numero_2 = entrada.nextDouble();
                double multiplicacao = multiplicar_numero_1 * multiplicar_numero_2;
                System.out.println(" >> O resultado é: "+multiplicacao);
                System.out.printf(" \n > Fim do programa, deseja voltar ao início? ");
                String voltar_3 = entrada.next();
                if (voltar_3.equals("sim")) {
                    System.out.println(" > Voltando ao menu principal...\n");
                    break;
                }
                else {
                    voltarMenu = false;
                    System.out.println(" \n | PROGRAMA ENCERRADO! |\n");
                }
                break;

                case 4: // divisão
                System.out.printf(" - Digite o 1º número: ");
                double dividr_numero_1 = entrada.nextDouble();
                System.out.printf(" - Digite o 2º número: ");
                double dividr_numero_2 = entrada.nextDouble();
                double divisao = dividr_numero_1 / dividr_numero_2;
                System.out.println(" >> O resultado é: "+divisao);
                System.out.println(" \n > Fim do programa, deseja voltar ao início? ");
                String voltar_4 = entrada.next();
                if (voltar_4.equals("sim")) {
                    System.out.println(" \n > Voltando ao menu principal...\n");
                }
                else {
                    voltarMenu = false;
                    System.out.println(" \n | PROGRAMA ENCERRADO! |\n");
                }
                break;
            }
        }
    }
}