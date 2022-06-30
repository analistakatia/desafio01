import java.util.Random;
import java.util.Scanner;

public class SistemaSorteio {
    public static void main(String[] args) {
        int possibilidades = 100;
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(possibilidades) + 1;
        int valormenor = valor - 1;
        int valormaior = valor + 1;
        int pontuacao = 0;

        Scanner numInformado = new Scanner(System.in);
        System.out.print("Escolha um número de 1 a " + possibilidades + ": ");
        int num = numInformado.nextInt();
        System.out.println("O número sorteado é: " + valor);

        //int resultado = numInformado.nextInt();
        if (num == valor) {
            System.out.println("Parabéns!! Você  acertou o número exato!!!\nVocê ganhou 10 pontos!");
            pontuacao = pontuacao + 10;
        } else if (num == valormaior || num == valormenor) {
            System.out.println("Você errou por um número!! \nVocê ganhou 5 pontos por quase acertar!");
            pontuacao = pontuacao + 5;
        } else {
            System.out.println("Poxa...Você não teve muita sorte :( \nMas não desista, na próxima você consegue!!");
        }
        System.out.println("Sua pontuação é: " + pontuacao);

        Scanner continuar = new Scanner(System.in);
        System.out.println("Deseja continuar tentando? Digite s para sim ou n não");
        String escolha = continuar.next();



        while (escolha.equals("s")) {
            System.out.print("Escolha um número de 1 a " +possibilidades+ ": ");
            num = numInformado.nextInt();
            aleatorio = new Random();
            valor = aleatorio.nextInt(possibilidades) + 1;
            valormenor = valor - 1;
            valormaior = valor + 1;
            System.out.println("O número sorteado é: " + valor);

            if (num == valor) {
                System.out.println("Parabéns!! Você  acertou o número exato!!!\nVocê ganhou 10 pontos!");
                pontuacao = pontuacao + 10;
            } else if (num == valormaior || num == valormenor) {
                System.out.println("Você errou por um número!! \nVocê ganhou 5 pontos por quase acertar!");
                pontuacao = pontuacao + 5;
            } else {
                System.out.println("Poxa...Você não teve muita sorte :( \nMas não desista, na próxima você consegue!!");
            }
            System.out.println("Sua pontuação é: " + pontuacao);

            System.out.println("Deseja continuar tentando? Digite s para sim ou n não");
            escolha = continuar.next();

            //System.out.println("Fim de jogo!!");


        }
    }
}