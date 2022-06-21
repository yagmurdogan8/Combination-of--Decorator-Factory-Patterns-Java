public abstract class Character{
    String name;
    int strength;
    int agility;
    float characterPrice;
    int attack;
    int defence;

    public Character() {
    }

    public Character(String name, int strength, int agility, float characterPrice, int attack, int defence) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.characterPrice = characterPrice;
        this.attack = attack;
        this.defence = defence;
    }

    String description = "";


    public String getDescription() {

        return
                "Name: "+ this.name  + ", with agility %" + this.agility + ", strength %" +this.strength
                        + ", attack %" + this.attack + ", defence %" + this.defence + " and price " + this.characterPrice + "$" +"\n";
    }



    public void prepareCharacter(Character character) {
        System.out.println("The character: " + character.description + " is preparing...");
    }

    public void releaseCharacter(Character character) {
        System.out.println("The character: " + character.description + " is ready. Now, let's release the character...");
    }


}
