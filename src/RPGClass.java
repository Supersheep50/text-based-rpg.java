public class RPGClass {
    protected String PlayerName;
    protected int health;
    protected int magic;
    protected int strength;
    protected int intelligence;

    RPGClass(String name, int health, int magic, int strength, int intelligence) {
        this.PlayerName = name;
        this.health = health;
        this.magic = magic;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public String printStats() {
        return "Player Name: " + PlayerName + "\n" +
                "Health: " + health + "\n" +
                "Magic: " + magic + "\n" +
                "Strength: " + strength + "\n" +
                "Intelligence: " + intelligence;
    }

    public String playerAttack() {
        return PlayerName + " attacked the enemy";
    }

}