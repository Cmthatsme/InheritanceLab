public class Wizard extends Character{
    Wizard(String name){
        super(name);
    }
    //Create two attacking method
    public void fireStorm(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 50)");
        int damagePoints = 50;
        int manaDeduct = 20;
        damageTarget(enemyCharacter, damagePoints, manaDeduct);
    };
    public void thunderBolt(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with ThunderBolt (Damage - 30)");
        int damagePoints = 30;
        int manaDeduct = 40;
        damageTarget(enemyCharacter, damagePoints, manaDeduct);
    };
    //Create one healing method
    public void edenApple(){
        int addHP = 90;
        int addMP = 40;

        super.healthPoints += addHP;
        super.manaPoints += addMP;

        System.out.println( super.characterName + " pick EdenApple and gain " + addHP + " HP and " + addMP + " MP");
        System.out.println("Total HP is now " + super.healthPoints);
        System.out.println("Total MP is now " + super.manaPoints);
    }
}
