public class Arch extends Decorator {

    private Character character;

    public Arch(Character character) {

        this.character = character;
    }

    @Override
    public String getDescription() {
        return character.name + " with Arch." + " Agility %" + character.agility + ", strength %" + character.strength
                + ", attack %" + character.attack + ", defence %" + character.defence + " and total price with item is " + (character.characterPrice + 1500) +"$";
    }
}
