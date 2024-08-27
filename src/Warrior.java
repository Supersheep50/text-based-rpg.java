class Warrior extends RPGClass {
    public Warrior(String name) {
        super(name, 150, 0, 100,10);
    }
    public void attack() {
        System.out.println(PlayerName + " swings a mighty sword!");
    }}