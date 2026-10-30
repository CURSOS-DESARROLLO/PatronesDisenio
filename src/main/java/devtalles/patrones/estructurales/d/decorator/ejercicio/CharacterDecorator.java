package devtalles.patrones.estructurales.d.decorator.ejercicio;

public class CharacterDecorator implements Character {
    protected Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }

    @Override
    public String getDescription() {
        return this.character.getDescription();
    }

    @Override
    public CharacterForce getStats() {
        return this.character.getStats();
    }
}
