public class App {
    public static void main(String[] args) {
        System.out.println("\n" + "test project" + "\n");

        CharFactoryStore humanFStore = new HumanFemaleFactory();
        CharFactoryStore monsterMStore = new MonsterMaleFactory();
        CharFactoryStore monsterFStore = new MonsterFemaleFactory();
        CharFactoryStore humanMStore = new HumanMaleFactory();

        Character character = humanFStore.createCharacter("brunette");
        Character character2 = monsterMStore.createCharacter("vampire");

        Character character3 = monsterFStore.createCharacter("elf");
        character3 = new Helmet(character3);

        Character character4 = humanMStore.createCharacter("blonde");
        character4 = new Sword(character4);

        System.out.println("You ordered a " + character.getDescription());
        System.out.println("You ordered a " + character2.getDescription());
        System.out.println("You ordered a " + character3.getDescription() + "\n");
        System.out.println("You ordered a " + character4.getDescription());

    }
}
