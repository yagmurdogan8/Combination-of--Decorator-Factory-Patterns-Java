public class Pants extends Decorator {

    private Character character;

    public Pants(Character character) {

        this.character = character;
    }

    @Override
    public String getDescription() {
        return character.name + " with Pants." + " Agility %" + character.agility + ", strength %" + character.strength
                + ", attack %" + character.attack + ", defence %" + character.defence + " and total price with item is " + (character.characterPrice + 700) +"$";
    }
}