import java.util.Scanner;

public class Main {
    final static int COUNT_CARS_IN_RACE = 3;
    final static int MIN_SPEED = 0;
    final static int MAX_SPEED = 250;

    public static void main(String[] args) {
        Race race = new Race();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= COUNT_CARS_IN_RACE; i++) {
            System.out.println("Введите название машины № " + i);
            String name = scanner.next();
            System.out.println("Введите скорость машины № " + i);

            while (true) {
                if (scanner.hasNextInt()) {
                    int speed = scanner.nextInt();
                    if (speed > MIN_SPEED && speed <= MAX_SPEED) {
                        Auto winnerAuto = new Auto(name, speed);
                        race.winnerAnnouncement(winnerAuto);
                        break;
                    } else {
                        System.out.println("Некорректное значение скорости. Скорость должна быть от " + MIN_SPEED + " до " + MAX_SPEED);
                        scanner.nextLine();
                    }
                } else {
                    System.out.println("Введите скорость от " + MIN_SPEED + " до " + MAX_SPEED);
                    scanner.next();
                }
            }
            race.winner = race.getWinner();
        }
        System.out.println("Самая быстрая машина: " + race.winner);
        scanner.close();
    }
}
