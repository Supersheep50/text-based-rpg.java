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

        String PlayerName;
        String PlayerFrom;
        int PlayerAge;
        String[] PlayerClass = {"Ninja", "Warrior", "Wizard"};


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
            return;
        };

        // Character creator
        System.out.println("What is your name?");
        PlayerName = scanner.nextLine();
        System.out.println("Welcome to Dublin " + PlayerName + ", you look...old");
        System.out.println("What age are you " + PlayerName + " ?" );
        PlayerAge = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Oh christ, " + PlayerAge + ", is very old.");
        System.out.println("It's also quite obvious you're not from around here " + PlayerName);
        System.out.println("Where are you from?");
        PlayerFrom = scanner.nextLine();
        System.out.println("Oh god...so sorry to hear that");
        System.out.println(PlayerFrom + " is a terrible place so I hear");
        System.out.println("Anyway...you may choose one of the following classes for your journey");
        System.out.println(PlayerClass)

    }
}

