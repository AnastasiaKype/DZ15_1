public class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 2;
        int speedOfPlayer3 = 3;

        int numbersOfPlayers = 0;

        if (isGreenLight == true) {

            System.out.println("Выбывших: " + numbersOfPlayers);
        } else {
            if (speedOfPlayer1 > 0) {
                numbersOfPlayers = numbersOfPlayers + 1;
            }
            if (speedOfPlayer2 > 0) {
                numbersOfPlayers = numbersOfPlayers + 1;
            }
            if (speedOfPlayer3 > 0) {
                numbersOfPlayers = numbersOfPlayers + 1;
            }
            System.out.println("Выбывших: " + numbersOfPlayers);
        }
    }
}

