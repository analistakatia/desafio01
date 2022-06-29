import java.util.Random;
import java.util.Scanner;

public class SistemaSorteio {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(10) + 1;
        int valormenor = valor - 1;
        int valormaior = valor + 1;
        int acerto = 10;
        int aproximado = 5;

        Scanner numInformado = new Scanner(System.in);
        System.out.print("Escolha um número de 1 a 10: ");
        int num = numInformado.nextInt();
        System.out.println("O número sorteado é: " + valor);

        if (num == valor){
            System.out.println("Você acertou o número exato! Parabéns!!!\nVocê ganhou 10 pontos!");
        } else if (num == valormenor || num == valormaior) {
            System.out.println("Você errou por um número!! \nVocê ganhou 5 pontos por quase acertar!");
        }else {
            System.out.println("Poxa...Você não teve muita sorte :( \nMas não desista, na próxima você consegue!!");
        }
        /*Scanner continuar = new Scanner(System.in);
        System.out.println("Deseja continuar tentando?");
        System.out.println("1. Continuar");
        System.out.println("2. Sair");
        String escolha = continuar.next();

        while (escolha == "1"){

        }

        switch (escolha){
            case "1":
                int somaPto1 = acerto + acerto;
                int somaPto2 = aproximado + acerto;
                int SomaPto3 = aproximado + aproximado;
                while (escolha = )
        }


        String sim = continuar.next();
        String nao = continuar.next();
        String respSim = "S";
        String respNao = "N";

        if (sim == respSim){
            int somaPonto =
        }*/

    }
}
