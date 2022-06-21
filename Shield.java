public class Shield extends Decorator {

    private Character character;

    public Shield(Character character) {

        this.character = character;
    }

    @Override
    public String getDescription() {
        return character.name + " with Shield." + " Agility %" + character.agility + ", strength %" + character.strength
                + ", attack %" + character.attack + ", defence %" + character.defence + " and total price with item is " + (character.characterPrice + 2400) +"$";
    }
}