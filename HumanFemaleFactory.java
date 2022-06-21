public class HumanFemaleFactory extends CharFactoryStore {

    Character c;

    @Override
    public Character createCharacter(String type) {
        switch (type.toLowerCase()) {
            case "blonde":
                c = new HumanFStyleBlondeChar();
                break;
            case "brunette":
                c = new HumanFStyleBrunetteChar();
                break;
            case "ginger":
                c = new HumanFStyleGingerChar();
                break;
            default:
                System.err.println("Invalid character type!");
        }
        return c;
    }

}
