public class Warlock extends Character{
    Warlock(String name){
        super(name);
    }
    //Create two attacking method
    public void energyBall(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with EnergyBall (Damage - 70)");
        int damagePoints = 70;
        int manaDeduct = 50;
        damageTarget(enemyCharacter, damagePoints, manaDeduct);
    }
    public void rayGun(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with RayGun (Damage - 45)");
        int damagePoints = 45;
        int manaDeduct = 70;
        damageTarget(enemyCharacter, damagePoints, manaDeduct);
    }
    //Create one healing method
    public void youthFountain(){
        int addHP = 100;
        int addMP = 20;

        super.healthPoints += addHP;
        super.manaPoints += addMP;

        System.out.println( super.characterName + " pick YouthFountain and gain " + addHP + " HP and " + addMP + " MP");
        System.out.println("Total HP is now " + super.healthPoints);
        System.out.println("Total MP is now " + super.manaPoints);
    }
}
