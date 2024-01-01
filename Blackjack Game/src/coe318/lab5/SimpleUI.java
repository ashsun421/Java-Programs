package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

    @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

    @Override
    public void display() {
        System.out.println("House Holds: \n============\n" + this.game.getHouseCards().toString() + "\n"); // House Cards
        System.out.println("You Hold: \n=========\n" + this.game.getYourCards().toString() + "\n"); // Your Cards
    }

    @Override
    public boolean hitMe() {
        System.out.println("\nDo you want to 'hit' (y) or 'stand' (n)?");
        String choice = user.nextLine();
        boolean hit = false;

        switch(choice){
            case "y":
                hit = true; // User wants to "hit"
                break;
            case "n":
                hit = false; // User does not want to "hit"
                break;
            default:
                System.out.println("Invalid input. Please type 'y' for 'hit' or 'n' for 'stand'.");
                hitMe(); // Recursively call the function if input is invalid
        }
        return hit;
    }

    @Override
    public void gameOver() {
        this.display();
        int yourScore = game.score(game.getYourCards());
        int houseScore = game.score(game.getHouseCards());
        System.out.println("House Score: " + houseScore + ", Your Score: " + yourScore);

        if ((yourScore > houseScore || houseScore > 21) && (yourScore <= 21)) {
            System.out.println("Congratulations! You Win!");
        } else {
            System.out.println("House Wins. Better luck next time!");
        }
        System.out.println("Thank you for playing!");
    }
}
