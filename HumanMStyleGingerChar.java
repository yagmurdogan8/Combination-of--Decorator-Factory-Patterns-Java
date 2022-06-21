public class HumanMStyleGingerChar extends Character {
    @Override
    public void prepareCharacter(Character character) {
        super.prepareCharacter(character);
    }

    @Override
    public void releaseCharacter(Character character) {
        super.releaseCharacter(character);
    }



    public HumanMStyleGingerChar(){
        name = "Ginger Male Human Character";
        strength = 100;
        agility = 80;
        characterPrice = 120;
        attack = 100;
        defence = 90;
    }
}