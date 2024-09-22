import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(100) + 1; // Número aleatório entre 1 e 100
        int tentativasMaximas = 10; // Limite de tentativas
        int tentativas = 0;
        boolean adivinhou = false;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Você tem " + tentativasMaximas + " tentativas para adivinhar o número entre 1 e 100.");

        // Loop de tentativas
        while (tentativas < tentativasMaximas && !adivinhou) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            // Comparação
            if (palpite < numeroSecreto) {
                System.out.println("O número é maior que " + palpite + ".");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número é menor que " + palpite + ".");
            } else {
                adivinhou = true; // O jogador acertou
            }
        }

        // Resultado final
        if (adivinhou) {
            System.out.println("Parabéns! Você adivinhou o número " + numeroSecreto + " em " + tentativas + " tentativas.");
        } else {
            System.out.println("Você esgotou suas tentativas. O número era " + numeroSecreto + ".");
        }

        scanner.close(); // Fechar o scanner
    }
}
