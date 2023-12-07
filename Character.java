public class Character {
    private String name;
    private int health;
    private int strength;
    private Component currentLocation;
    private int wealth; // For events affecting wealth
    private int influence; // For diplomatic events
    private boolean infected; // For plague events
    private int morale; // For events affecting morale

    public Character(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.wealth = 0; // Initial wealth
        this.influence = 0; // Initial influence
        this.infected = false; // Initial health status
        this.morale = 0; // Initial morale
    }

    // Existing methods...

    public Component getCurrentLocation() {
        return currentLocation;
    }

    public void increaseWealth(int amount) {
        this.wealth += amount;
    }

    public void increaseInfluence(int amount) {
        this.influence += amount;
    }

    public void loseResources(String resource, int amount) {
        // Implement resource loss logic based on your game design
    }

    public void setInfected(boolean infected) {
        this.infected = infected;
    }

    public void increaseMorale(int amount) {
        this.morale += amount;
    }

    public String getName() {
        return name;
    }

    // Getters and setters for new attributes...
}