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
        // Defined Variables
        String PlayerName;
        String PlayerFrom;
        int PlayerAge;
        RPGClass playerClass;
        Dice dice = new Dice();
        int[] diceRoll = new int[]{1,2,3,4,5,6};


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
        }


        // Character creator
        System.out.println("What is your name?");
        PlayerName = scanner.nextLine();
        System.out.println("Welcome to Dublin " + PlayerName + ", you look...old");
        System.out.println("What age are you " + PlayerName + " ?");
        PlayerAge = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Oh christ, " + PlayerAge + ", is very old.");
        System.out.println("It's also quite obvious you're not from around here " + PlayerName);
        System.out.println("Where are you from?");
        PlayerFrom = scanner.nextLine();
        System.out.println("Oh god...so sorry to hear that");
        System.out.println(PlayerFrom + " is a terrible place so I hear");
        System.out.println("Anyway...you may choose one of the following classes for your journey");
        System.out.println("Warrior, Thief or Wizard. Which will it be?");
        String classChoice = scanner.nextLine();

        switch (classChoice.toLowerCase()) {
            case "warrior":
                playerClass = new Warrior(PlayerName);
                break;
            case "thief":
                playerClass = new Thief(PlayerName);
                break;
            case "wizard":
                playerClass = new Wizard(PlayerName);
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Warrior.");
                playerClass = new Warrior(PlayerName);

        }
        System.out.println("Well then, welcome " + PlayerName + " to Dublin!");
        System.out.println("You are a " + PlayerAge + " year old " + playerClass + " from " + PlayerFrom);


        // Stats and attack
        System.out.println("Seeing as you are a " + playerClass + "lets see your stats");
        System.out.println(playerClass.printStats());
        System.out.println("Wow. Pretty impressive I must say. Lets try an attack or some magic shall we?");
        System.out.println("Type attack to attack, magic to perform magic or run to run away. No judegement here.");
        String test = scanner.nextLine();

        switch (test) {
            case "attack":
                System.out.println(playerClass.playerAttack());
                break;
            case "magic":
                System.out.println(playerClass.playerMagic());
                break;
            case "run":
               playerClass.gameOver();
    }

    // Dice Roll for location

        System.out.println("Alright then! Looking good. Let me fetch the dice....");
        System.out.println("Oh this? Oh it's how you're going to get around our fair city");
        System.out.println("There are 6 wonderful (cough) locations to visit, take a look.");
        System.out.println("1 O'Connell Street\n" +
                "2 The GPO\n" +
                "3 Stoneybatter\n" +
                "4 Phoenix Park\n" +
                "5 Grand Canal Dock\n" +
                "6 Temple Bar");
        System.out.println("Would you like to roll the dice? Y/N");
        String roll = scanner.nextLine();
        switch (roll.toLowerCase()) {
            case "y":
                System.out.println(dice.rollDice());
                break;

            default:
                System.out.println("Invalid input. Please enter Y or N.");
                break;
        }
        int rollResult = dice.rollDice();
        if (rollResult == 1) {
            System.out.println("Ah! Off to O'Connell Street we go!");
            Locations.oConnellStreet(playerClass);
        }
        else if (rollResult == 2) {
            System.out.println("Ah! Off to The GPO we go!");
            Locations.theGPO(playerClass);
        }
        else if (rollResult == 3){
                System.out.println("Ah! Off to Stoneybatter we go!");
                Locations.stoneyBatter(playerClass);}
                else if (rollResult == 4){
                    System.out.println("Ah! Off to Phoenix Park we go!");
                    Locations.phoenixPark(playerClass);}
                    else if (rollResult == 5){
                        System.out.println("Ah! Off to Grand Canal Dock we go!");
                        Locations.grandCanal(playerClass);}
                        else if (rollResult == 6){
                            System.out.println("Ah! Off to Temple Bar we go!");
                            Locations.templeBar(playerClass);
                        }
                    }
                }







