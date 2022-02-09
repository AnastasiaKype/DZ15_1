import static kype.nastya.DZ16.speedCheck;

public class Main {
    public static void main(String[] args) {
        String player1 = speedCheck(5);
        System.out.println("Игрок 1 - " + player1);
        String player2 = speedCheck(0);
        System.out.println("Игрок 2 - " + player2);
        String player3 = speedCheck(2);
        System.out.println("Игрок 3 - " + player3);
    }

}

