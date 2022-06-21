public class MonsterFemaleFactory extends CharFactoryStore{

    Character c;

    @Override
    public Character createCharacter(String type) {
        switch (type.toLowerCase()) {
            case "troll":
                c = new MonsterFStyleTrollChar();
                break;
            case "elf":
                c = new MonsterFStyleElfChar();
                break;
            case "vampire":
                c = new MonsterFStyleVampireChar();
                break;
            default:
                System.err.println("Invalid character type!");
        }
        return c;
    }

}