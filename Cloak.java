public class Cloak extends Decorator {

    private Character character;

    public Cloak(Character character) {

        this.character = character;
    }

    @Override
    public String getDescription() {
        return character.name + " with Cloak." + " Agility %" + character.agility + ", strength %" + character.strength
                + ", attack %" + character.attack + ", defence %" + character.defence + " and total price with item is " + (character.characterPrice + 500) +"$";
    }
}