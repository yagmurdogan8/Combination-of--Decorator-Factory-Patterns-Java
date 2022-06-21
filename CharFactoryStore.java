public abstract class CharFactoryStore{
    public Character orderCharacter(String type) {
        Character c = createCharacter(type);

        return c;
    }

    protected abstract Character createCharacter(String type);

}
