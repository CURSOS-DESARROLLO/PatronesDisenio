package devtalles.patrones.estructurales.d.decorator.ejercicio;

// Añade un casco que aumenta la defensa en +5
public class HelmetDecorator extends CharacterDecorator {
    public HelmetDecorator(Character character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return String.format("%s \n con Casco", super.getDescription());
    }

    @Override
    public CharacterForce getStats() {
        CharacterForce characterForce = super.getStats();
        return new CharacterForce(characterForce.atack(), characterForce.atack() + 5);
    }
}
