import java.util.Random;
import java.util.Scanner;

public class SimpleCasino {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int balance = 100; // Начальный баланс

        while (balance > 0) {
            System.out.println("Ваш баланс: " + balance);
            System.out.println("1. Сделать ставку");
            System.out.println("2. Выйти");
            System.out.println("Выберите вариант: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Введите сумму ставки: ");
                int bet = scanner.nextInt();

                if (bet <= balance) {
                    balance -= bet;

                    int playerNumber = random.nextInt(10) + 1; // Число игрока
                    int casinoNumber = random.nextInt(10) + 1; // Число казино

                    System.out.println("Ваше число: " + playerNumber);
                    System.out.println("Число казино: " + casinoNumber);

                    if (playerNumber == casinoNumber) {
                        System.out.println("Вы выиграли! + " + (bet * 2));
                        balance += bet * 2; // Выигрыш в два раза больше ставки
                    } else {
                        System.out.println("Вы проиграли!");
                    }
                } else {
                    System.out.println("Недостаточно средств на счету!");
                }
            } else if (choice == 2) {
                System.out.println("Спасибо за игру!");
                break;
            } else {
                System.out.println("Неверный выбор!");
            }
        }

        if (balance == 0) {
            System.out.println("Ваш баланс исчерпан. Игра окончена.");
        }

        scanner.close();
    }
}