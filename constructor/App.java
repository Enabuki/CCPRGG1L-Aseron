public class App {
    public static void main(String[] args) {

        // Creates a new object named "Knight" from Character class
        Character knight = new Character(10, 5, 0, "Chen");
        // Calls the sayMyName method
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();

        Character mage = new Character(0, 5, 10, "Akasha");
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();

        Character thief = new Character(5, 10, 0, "Gondar");
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();

        Character archer = new Character(5, 10, 0, "Ashe");
        archer.sayMyName();
        archer.sayMyStrength();
        archer.sayMyAgility();
        archer.sayMyIntelligence();
    }
}
