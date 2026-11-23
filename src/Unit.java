public class Unit {
    private String name;
    private int healthPoint;
    private int attackStrength;
    private int armor; //implement at some point

    public Unit(String name, int healthPoint, int attackStrength, int armor) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.attackStrength = attackStrength;
        this.armor = armor;
    }

    public void attack(Unit attacker, Unit receiver) {
        receiver.healthPoint -= attacker.attackStrength;
        if (receiver.healthPoint <= 0) {
            System.out.println(receiver.name + " died!");
        } else {
            System.out.println(receiver.name + " has " + receiver.healthPoint + " HP left!");
        }
    }

    public int getHealthPoint() {
        return healthPoint;
    }
}