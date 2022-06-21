public class Boots extends Decorator {

    private Character character;

    public Boots(Character character) {

        this.character = character;
    }
    @Override
    public String getDescription() {
        return character.name + " with Boots." + " Agility %" + character.agility + ", strength %" + character.strength
                + ", attack %" + character.attack + ", defence %" + character.defence + " and total price with item is " + (character.characterPrice + 600) +"$";
    }
}