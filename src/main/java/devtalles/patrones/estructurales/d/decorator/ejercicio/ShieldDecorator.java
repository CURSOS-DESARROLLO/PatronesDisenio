package devtalles.patrones.estructurales.d.decorator.ejercicio;

// Añade un escudo que aumenta la defensa en +10
public class ShieldDecorator extends CharacterDecorator {

    public ShieldDecorator(Character character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return String.format("%s \n con Escudo", super.getDescription());
    }

    @Override
    public CharacterForce getStats() {
        CharacterForce characterForce = super.getStats();
        return new CharacterForce(characterForce.atack(), characterForce.defense() + 10);
    }
}
