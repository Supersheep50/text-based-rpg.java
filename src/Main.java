import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Game title
        System.out.println("\n" +
                "███████ ██   ██  █████  ██████   ██████  ██     ██ ███████      ██████  ███████     ████████ ██   ██ ███████     ██      ██ ███████ ███████ ███████ ██    ██ \n" +
                "██      ██   ██ ██   ██ ██   ██ ██    ██ ██     ██ ██          ██    ██ ██             ██    ██   ██ ██          ██      ██ ██      ██      ██       ██  ██  \n" +
                "███████ ███████ ███████ ██   ██ ██    ██ ██  █  ██ ███████     ██    ██ █████          ██    ███████ █████       ██      ██ █████   █████   █████     ████   \n" +
                "     ██ ██   ██ ██   ██ ██   ██ ██    ██ ██ ███ ██      ██     ██    ██ ██             ██    ██   ██ ██          ██      ██ ██      ██      ██         ██    \n" +
                "███████ ██   ██ ██   ██ ██████   ██████   ███ ███  ███████      ██████  ██             ██    ██   ██ ███████     ███████ ██ ██      ██      ███████    ██    \n" +
                "                                                                                                                                                             \n" +
                "                                                                                                                                                             \n");


        // Game Intro
        System.out.println("Welcome to the Shadows of the Liffey videogame!");
        System.out.println("Prepare to explore the depths of Dublin in this text based RPG");
        System.out.println("You will see a side of Dublin never seen before!");
        System.out.println("Except by people who live there I guess...");
        System.out.println("Anyway, would you like to start a New Game?");
        System.out.println("y/n");
        String keyboard = scanner.nextLine();
        if (keyboard.equals("y")) {
            System.out.println("Excellent. Lets get you started traveller!");
        } else {
            System.out.println("Oh. Well piss off then");
        }

        // Character details
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name);

    }
}

