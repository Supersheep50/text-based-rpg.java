import java.util.Scanner;



public class Locations {

    public static void oConnellStreet() {
        System.out.println("Welcome to O'Connell Street! Or what we call the Champs-Élysées of Ireland!");
        System.out.println("Just ignore the junkies....");
        System.out.println("Wait actually...I think thats the King of the Junkies over there!!");
        System.out.println("Oi...Greg! Greg!");
        System.out.println("HE TURNS AROUND");
        System.out.println("Oh christ he's running towards us!");
        System.out.println("Type attack to attack or run, to run away like a bitch");
        Scanner scanner = new Scanner(System.in);
        String junkieAttack = scanner.nextLine();
        switch (junkieAttack) {
            case "attack":
                System.out.println(RPGClass.playerAttack());
                break;
            case "run":
                System.out.println("Well off you run then you little coward");
                break;
        }

    }
}








/* Dublin locations

1 O'Connell Street
2 The GPO
3 Stoneybatter
4 Phoenix Park
5 Grand Canal Dock
6 Temple Bar


 */