package devtalles.patrones.estructurales.d.decorator.ejercicio;

// Añade una espada que aumenta el ataque en +7
public class SwordDecorator extends CharacterDecorator {
    public SwordDecorator(Character character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return String.format("%s con Espada", super.getDescription());
    }

    @Override
    public CharacterForce getStats() {
        CharacterForce characterForce = super.getStats();
        return new CharacterForce(characterForce.atack() + 7, characterForce.defense());
    }
}
