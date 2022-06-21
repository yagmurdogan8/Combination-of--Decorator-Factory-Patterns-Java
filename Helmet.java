public class Helmet extends Decorator {

    private Character character;

    public Helmet(Character character) {

        this.character = character;
    }

    @Override
    public String getDescription() {
        return character.name + " with Helmet." + " Agility %" + character.agility + ", strength %" + character.strength
                + ", attack %" + character.attack + ", defence %" + character.defence + " and total price with item is " + (character.characterPrice +2500) +"$";
    }
}