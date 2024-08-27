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
    }}