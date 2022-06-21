public class MonsterMaleFactory extends CharFactoryStore{

    Character c;

    @Override
    public Character createCharacter(String type) {
        switch (type.toLowerCase()) {
            case "troll":
                c = new MonsterMStyleTrollChar();
                break;
            case "elf":
                c = new MonsterMStyleElfChar();
                break;
            case "vampire":
                c = new MonsterMStyleVampireChar();
                break;
            default:
                System.err.println("Invalid character type!");
        }
        return c;
    }

}
