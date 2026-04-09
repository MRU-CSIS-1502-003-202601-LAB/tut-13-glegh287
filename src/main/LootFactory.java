package main;

public class LootFactory {
    public static Loot create(String[] fields) {
        String type = fields[0];
        String name = fields[1];
        String rarity = fields[2];
        int value = Integer.parseInt(fields[3]);

        if (type.equalsIgnoreCase("weapon")) {
            return new Weapon(name, rarity, value);
        } else if (type.equalsIgnoreCase("consumable")) {
            return new Consumable(name, rarity, value);
        }
        return null;
    }
} 
