public class Armour extends Decorator {

    private Character character;

    public Armour(Character character) {

        this.character = character;
    }
    @Override
    public String getDescription() {
        return character.name + " with Armour." + " Agility %" + character.agility + ", strength %" + character.strength
                + ", attack %" + character.attack + ", defence %" + character.defence + " and total price with item is " + (character.characterPrice + 3200) +"$";
    }
}
