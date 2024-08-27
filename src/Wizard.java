class Wizard extends RPGClass {
    public Wizard(String name) {
        super(name, 100, 100, 10,100);
    }
    public void attack() {
        System.out.println(PlayerName + " swings a mighty sword!");
    }}