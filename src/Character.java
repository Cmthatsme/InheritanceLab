public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    //Create two constructor, one without parameter and one without parameter
    Character(){}
    Character(String characterName, int level, int healthPoints, int manaPoints){
        this.characterName = characterName;
        this.level = level;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
    }
    Character(String name){
        characterName = name;
    }
    //Method to display character name
    public void displayName(){
        System.out.println("Character Initialized : " + characterName);
    }
    //method for damage and mp computation
    public void damageTarget(Character enemyCharacter,int damagePoints, int manaDeduct){
        
        enemyCharacter.healthPoints -= damagePoints;
        enemyCharacter.manaPoints -= manaDeduct;

        if(enemyCharacter.manaPoints <= 0)enemyCharacter.manaPoints = 0;
        if(enemyCharacter.healthPoints <= 0)enemyCharacter.healthPoints = 0;

        System.out.println("enemy character HP Left = " + enemyCharacter.healthPoints);
        System.out.println("enemy character MP Left = " + enemyCharacter.manaPoints);

        if(enemyCharacter.healthPoints <= 0){
            System.out.println("Character " + enemyCharacter.characterName + " defeated");
            level += 10;
            System.out.println(characterName + "'s level is now " + level);
        }
    }

}