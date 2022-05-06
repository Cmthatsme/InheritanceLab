public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks");

        Wizard Merlin = new Wizard("Merlin");
        Warlock Saruman = new Warlock("Saruman");

        //Display characters names
        Merlin.displayName();

        Saruman.displayName();

        Merlin.thunderBolt(Saruman);

        Saruman.energyBall(Merlin);

        //Merlin used recovery spell
        Merlin.edenApple();

        Saruman.energyBall(Merlin);

        Merlin.fireStorm(Saruman);

        Saruman.rayGun(Merlin);
        
        Merlin.fireStorm(Saruman);
    }
}
