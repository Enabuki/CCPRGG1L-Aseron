public class Gear {
    // Character attributes
    String name;
    String type;
    String rarity;
    float weight;
    String description;

    // Gear method
    public void sayGearDescription() {
        System.out.println("The " + name + "is a " + type + " that is " + rarity + " and it weighs " + weight);
    }

    // Constructor
    public Gear(String gearName, String gearType, String gearRarity, float gearWeight) {
        name = gearName;
        type = gearType;
        rarity = gearRarity;
        weight = gearWeight;
        
    }
}
