class Thief extends RPGClass {
    public Thief(String name) {
        super(name, 150, 15, 50,80);
    }
    public void attack() {
        System.out.println(PlayerName + " swings a mighty dagger!");
    }}