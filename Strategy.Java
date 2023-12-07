//Interface for Character Behavior



public interface Strategy {
    void executeStrategy(Character character, GameState gameState);
}

public class AggressiveStrategy implements Strategy {
    @Override
    public void executeStrategy(Character character, GameState gameState) {
        System.out.println(character.getName() + " is using an aggressive strategy.");
        character.decreaseHealth(5); // Example of an aggressive action
    }
}
