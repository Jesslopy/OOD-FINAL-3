import java.util.List;

public class WarEvent implements Event {

    @Override
    public void triggerEvent(Character character) {
        System.out.println("War has broken out in " + character.getCurrentLocation().display());
        // Assuming Component has a getCharacters method
        List<Character> affectedCharacters = character.getCurrentLocation().getCharacters();
        for (Character affectedCharacter : affectedCharacters) {
            affectedCharacter.decreaseHealth(30);
            // Replace RefugeeEvent with an existing event or define it
            Event someEvent = new SomeEvent(); // Replace with actual event
            someEvent.triggerEvent(affectedCharacter);
        }
    }
}