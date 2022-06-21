public class HumanMaleFactory extends CharFactoryStore {

    Character c;

    @Override
    public Character createCharacter(String type) {
        switch (type.toLowerCase()) {
            case "blonde":
                c = new HumanMStyleBlondeChar();
                break;
            case "brunette":
                c = new HumanMStyleBrunetteChar();
                break;
            case "ginger":
                c = new HumanMStyleGingerChar();
                break;
            default:
                System.err.println("Invalid character type!");
        }
        return c;
    }

}