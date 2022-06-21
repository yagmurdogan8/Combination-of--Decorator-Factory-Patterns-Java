public class Sword extends Decorator {

    private Character character;

    public Sword(Character character) {

        this.character = character;
    }
    @Override
    public String getDescription() {
        return character.name + " with Sword." + " Agility %" + character.agility + ", strength %" + character.strength
                + ", attack %" + character.attack + ", defence %" + character.defence + " and total price with item is " + (character.characterPrice + 2300) +"$";
    }
}