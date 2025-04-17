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

                case 5: // porcentagem
                System.out.printf("1. Adicionar porcentagem \n2. Subtrair porcentagem \n > O que deseja fazer? ");
                int escolha = entrada.nextInt();
                // adição de porcentagem
                if (escolha == 1) {
                    System.out.printf(" - Digite o número que será somado a porcentagem: ");
                    double numero_porcentagem = entrada.nextDouble();
                    System.out.println(" - Digite a porcentagem: ");
                    double valor_porcentagem = entrada.nextDouble();
                    double porcentagem = numero_porcentagem + ((numero_porcentagem * valor_porcentagem) / 100);
                    System.out.println(" >> O resultado é: "+porcentagem);
                    System.out.printf(" \n > Fim do programa, deseja voltar ao início? ");
                    String voltar_5_1 = entrada.next();
                    if (voltar_5_1.equals("sim")) {
                        System.out.println(" \n > Voltando ao menu principal...\n");
                        break;
                    }
                    else {
                        voltarMenu = false;
                        System.out.println(" \n | PROGRAMA ENCERRADO! |\n");
                    }
                    break;

                } else {
                    System.out.printf(" - Digite o número que será subtraído a porcentagem: ");
                    double numero_porcentagem_subtrair = entrada.nextDouble();
                    System.out.printf(" - digite a porcentagem: ");
                    double valor_porcentagem_subtrair = entrada.nextDouble();
                    double porcentagem_subtrair = numero_porcentagem_subtrair - ((numero_porcentagem_subtrair * valor_porcentagem_subtrair) / 100);
                    System.out.println(" >> O resultado é: "+porcentagem_subtrair);
                    System.out.printf(" \n > Fim do programa, deseja voltar ao início? ");
                    String voltar_5_2 = entrada.next();
                    if (voltar_5_2.equals("sim")) {
                        System.out.println(" \n > Voltando ao menu principal...\n");
                        break;
                    }
                    else {
                        voltarMenu = false;
                        System.out.println(" \n | PROGRAMA ENCERRADO! |\n");
                    }
                    break;
                }

                case 6: // potência
                System.out.printf(" - Digite o número que deseja elevar (base): ");
                double base = entrada.nextDouble();
                System.out.printf(" - Digite o número que irá elevar (expoente): ");
                double expoente = entrada.nextDouble();
                double elevado = Math.pow(base, expoente);
                System.out.println(" >> O resultado é: "+elevado);
                System.out.println(" \n > Fim do programa, deseja voltar ao início? ");
                String voltar_6 = entrada.next();
                if (voltar_6.equals("sim")) {
                    System.out.println(" \n > Voltando ao menu principal...\n");
                    break;
                }
                else {
                    voltarMenu = false;
                    System.out.println(" \n | PROGRAMA ENCERRADO! |\n");
                }
                break;

                case 7: // fração
                System.out.println("1. Somar frações \n2. Subtrair fração \n3. Multiplicar frações \n4. Dividir frações");
                System.out.printf(" > O que deseja fazer? ");
                int escolha_7 = entrada.nextInt();
                // adição de fração
                if (escolha_7 == 1) {
                    System.out.printf(" - Digite o numerador da 1º fração: ");
                    int numerador_1 = entrada.nextInt();
                    System.out.printf(" - Digite o denominador da 1º fração: ");
                    int denominador_1 = entrada.nextInt();
                    System.out.printf(" - Digite o numerador da 2º fração: ");
                    int numerador_2 = entrada.nextInt();
                    System.out.printf(" - Digite o denominador da 2º fração: ");
                    int denominador_2 = entrada.nextInt();
                    if (denominador_1 == denominador_2) {
                        int soma_fracao = numerador_1 + numerador_2;
                        System.out.println(" >> O resultado é: "+soma_fracao+" / "+ denominador_1);
                        System.out.printf(" > Fim do programa, deseja voltar ao menu principal? ");
                        String voltar_7_1_1 = entrada.next();
                        if (voltar_7_1_1.equals("sim")) {
                            System.out.println(" \n > Voltando ao menu principal...\n");
                            break;
                        }
                        else {
                            voltarMenu = false;
                            System.out.println(" \n | PROGRAMA ENCERRADO! |\n");
                        }
                        break;
                        // calculo de mmc, pois os denominadores são diferentes
                    } else {
                        int soma_fracao = numerador_1 + numerador_2;
                        int maior, mmc;
                        if (denominador_1 > denominador_2) {
                            maior = denominador_1;
                        } else {
                            maior = denominador_2;
                        }
                        while(true) {
                            if ((maior % denominador_1 == 0) && (maior % denominador_2 == 0)) {
                                mmc = maior;
                                break;
                            }
                            maior++;
                        }
                        System.out.println(" >> O resultado é: "+soma_fracao+" / "+mmc);
                        System.out.printf(" > Fim do programa, deseja voltar ao menu principal? ");
                        String voltar_7_1_2 = entrada.next();
                        if (voltar_7_1_2.equals("sim")) {
                            System.out.println(" \n > Voltando ao menu principal...\n");
                            break;
                        }
                        else {
                            voltarMenu = false;
                            System.out.println(" \n | PROGRAMA ENCERRADO! |\n");
                        }
                    }
                } 
                if (escolha_7 == 2) {
                    System.out.printf(" - Digite o numerador da 1º fração: ");
                    int numerador_1 = entrada.nextInt();
                    System.out.printf(" - Digite o denominador da 1º fração: ");
                    int denominador_1 = entrada.nextInt();
                    System.out.printf(" - Digite o numerador da 2º fração: ");
                    int numerador_2 = entrada.nextInt();
                    System.out.printf(" - Digite o denominador da 2º fração: ");
                    int denominador_2 = entrada.nextInt();
                    // caso os denominadores forem iguais
                    int subtracao_fracao = numerador_1 - numerador_2;
                    if (denominador_1 == denominador_2) {
                        System.out.println(" >> O resultado é: "+subtracao_fracao+" / "+ denominador_1);
                        System.out.printf(" > Fim do programa, deseja voltar ao menu principal? ");
                        String escolha_7_2_1 = entrada.next();
                        if (escolha_7_2_1.equals("sim")) {
                            System.out.println(" \n Voltando ao menu principal...\n");
                            break;
                        }
                        else {
                            voltarMenu = false;
                            System.out.println(" \n | PROGRAMA ENCERRADO! |\n");
                        }
                        break;
                        // calculo de mmc
                    } else {
                        int sub_fracao = numerador_1 - numerador_2;
                        int maior, mmc;
                        if (denominador_1 > denominador_2) {
                            maior = denominador_1;
                        } else {
                            maior = denominador_2;
                        }
                        while(true) {
                            if ((maior % denominador_1 == 0) && (maior % denominador_2 == 0)) {
                                mmc = maior;
                                break;
                            }
                            maior++;
                        }
                        System.out.println(" >> O resultado é: "+sub_fracao+" / "+mmc);
                        System.out.printf(" > fim do programa, deseja voltar ao menu principal? ");
                        String voltar_7_2_2 = entrada.next();
                        if (voltar_7_2_2.equals("sim")) {
                            System.out.println(" \n Voltando ao menu principal...\n");
                            break;
                        }
                        else {
                            voltarMenu = false;
                            System.out.println(" \n | PROGRAMA ENCERRADO! |\n");
                        }
                        break;
                    }
                }
                // multiplicação de fração
                if (escolha_7 == 3) {
                    System.out.printf(" - Digite o numerador da 1º fração: ");
                    int numerador_1 = entrada.nextInt();
                    System.out.printf(" - Digite o denominador da 1º fração: ");
                    int denominador_1 = entrada.nextInt();
                    System.out.printf(" - Digite o numerador da 2º fração: ");
                    int numerador_2 = entrada.nextInt();
                    System.out.printf(" - Digite o denominador da 2º fração: ");
                    int denominador_2 = entrada.nextInt();
                    int multiplicacao_numeradores = numerador_1 * numerador_2;
                    int multiplicacao_denominadores = denominador_1 * denominador_2;
                    System.out.println(" >> O resultado é: "+multiplicacao_numeradores+ "/ "+multiplicacao_denominadores);
                    System.out.printf(" > fim do programa, deseja voltar ao menu principal? ");
                        String voltar_7_3 = entrada.next();
                        if (voltar_7_3.equals("sim")) {
                            System.out.println(" \n Voltando ao menu principal...\n");
                            break;
                        }
                        else {
                            voltarMenu = false;
                            System.out.println(" \n | PROGRAMA ENCERRADO! |\n");
                        }
                        break;
                }
                // divisão de fração
                if (escolha_7 == 4) {
                    System.out.printf(" - Digite o numerador da 1º fração: ");
                    int numerador_1 = entrada.nextInt();
                    System.out.printf(" - Digite o denominador da 1º fração: ");
                    int denominador_1 = entrada.nextInt();
                    System.out.printf(" - Digite o numerador da 2º fração: ");
                    int numerador_2 = entrada.nextInt();
                    System.out.printf(" - Digite o denominador da 2º fração: ");
                    int denominador_2 = entrada.nextInt();
                    int multiplicacao_numeradores = numerador_1 * denominador_2;
                    int multiplicacao_denominadores = numerador_2 * denominador_1;
                    System.out.println(" >> O resultado é: "+multiplicacao_numeradores+ "/ "+multiplicacao_denominadores);
                    System.out.printf(" > fim do programa, deseja voltar ao menu principal? ");
                    String voltar_7_4 = entrada.next();
                    if (voltar_7_4.equals("sim")) {
                        System.out.println(" \n Voltando ao menu principal...\n");
                        break;
                    }
                    else {
                        voltarMenu = false;
                        System.out.println(" \n | PROGRAMA ENCERRADO! |\n");
                    }
                    break;
                }

                case 8:
                System.out.println("1. Bháskara \n2. Teorema de Pitágoras \n3. Área de um triângulo equilátero \n4. Função afim \n5. Função quadrática \n6. Área do círculo \n7. Volume do cilindro \n 8. Juros \n9. Função exponencial");
                System.out.printf(" > Qual fórmula deseja usar? ");
                int formula = entrada.nextInt();
                // bhaskara
                if (formula == 1) {
                    
                }
            }
        }
    }
}
