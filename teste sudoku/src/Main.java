import Board.Board;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private static Board board;
    private final static int BOARD_LIMIT = 9;

    public static void main(String[] args) {
        int option = -1;

        while (true) {
            System.out.println("\n🧩 Bem-vindo ao Sudoku!");
            System.out.println("1 - Iniciar um novo Jogo");
            System.out.println("2 - Colocar um novo número");
            System.out.println("3 - Remover um número");
            System.out.println("4 - Visualizar jogo atual");
            System.out.println("5 - Verificar status do jogo");
            System.out.println("6 - Limpar jogo");
            System.out.println("7 - Finalizar jogo");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Entrada inválida. Digite um número.");
                continue;
            }

            switch (option) {
                case 1 -> startGame();
                case 2 -> inputNumber();
                case 3 -> removeNumber();
                case 4 -> showCurrentGame();
                case 5 -> showGameStatus();
                case 6 -> clearGame();
                case 7 -> finishGame();
                case 8 -> {
                    System.out.println("👋 Obrigado por jogar! Até a próxima.");
                    System.exit(0);
                }
                default -> System.out.println("❌ Opção inválida! Escolha novamente.");
            }
        }
    }

    // Os métodos abaixo devem ser implementados com a lógica específica do jogo:
    private static void startGame() {
        System.out.println("🔄 Iniciando novo jogo...");
        board = new Board(); // certifique-se de que a classe Board está implementada corretamente
    }

    private static void inputNumber() {
        System.out.println("✏️ Função para inserir número no tabuleiro (a ser implementada).");
    }

    private static void removeNumber() {
        System.out.println("🗑️ Função para remover número do tabuleiro (a ser implementada).");
    }

    private static void showCurrentGame() {
        System.out.println("📄 Exibindo jogo atual...");
        if (board != null) {
            board.print(); // Assumindo que a classe Board tenha esse método
        } else {
            System.out.println("⚠️ Nenhum jogo iniciado.");
        }
    }

    private static void showGameStatus() {
        System.out.println("🔍 Verificando status do jogo (a ser implementado).");
    }

    private static void clearGame() {
        System.out.println("🧹 Limpando tabuleiro (a ser implementado).");
    }

    private static void finishGame() {
        System.out.println("✅ Finalizando jogo atual (a ser implementado).");
    }
}
