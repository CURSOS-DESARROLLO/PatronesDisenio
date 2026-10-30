package devtalles.patrones.estructurales.d.decorator.ejercicio;

public class BasicCharacter implements Character {
    @Override
    public String getDescription() {
        return "Personaje Básico";
    }

    @Override
    public CharacterForce getStats() {
        return new CharacterForce(10, 10);
    }
}
