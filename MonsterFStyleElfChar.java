public class MonsterFStyleElfChar extends Character {
    @Override
    public void prepareCharacter(Character character) {
        super.prepareCharacter(character);
    }

    @Override
    public void releaseCharacter(Character character) {
        super.releaseCharacter(character);
    }



    public MonsterFStyleElfChar(){
        name = "Elf Female Monster Character";
        strength = 180;
        agility = 150;
        characterPrice = 150;
        attack = 100;
        defence = 100;
    }
}