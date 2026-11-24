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
    }

    public String getName() {
        return name;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public int getHealthPoint() {
        return healthPoint;
    }
}