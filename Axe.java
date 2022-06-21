public class Axe extends Decorator {

    private Character character;

    public Axe(Character character) {

        this.character = character;
    }
    @Override
    public String getDescription() {
        return character.name + " with Axe." + " Agility %" + character.agility + ", strength %" + character.strength
                + ", attack %" + character.attack + ", defence %" + character.defence + " and total price with item is " + (character.characterPrice + 1300) +"$";
    }
}