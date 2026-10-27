package devtalles.patrones.creacionales.d.prototype.devtalles;

/**
 * ! Patrón Prototype:
 * <p>
 * Es un patrón de diseño creacional que nos permite copiar objetos existentes sin hacer
 * que el código dependa de sus clases.
 * <p>
 * * Es útil cuando queremos duplicar el contenido,
 * * el título y el autor de un documento, por ejemplo o cualquier objeto complejo.
 * <p>
 * https://refactoring.guru/es/design-patterns/prototype
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // documento original
        Document documento = new Document("Enanitos", "libro de niños", "htts://algundominio.com/enanitos");

        System.out.println(documento);
        System.out.println("Documento original: " + documento);

        // esto hace que sea la misma referencia a un objeto.
        Document documentCopiaUno = documento;
        System.out.println("Documento copia misma referencia en memoria: " + documentCopiaUno);


        // esto es más largo y poco util
        Document documentCopiaDos = new Document();
        documentCopiaDos.setTitle(documento.getTitle());
        documentCopiaDos.setDescription(documento.getDescription());
        documentCopiaDos.setUrl(documento.getUrl());

        System.out.println("Documento copia dos larga: " + documentCopiaDos);

        // lo más rápido y práctico es esto:
        Document documentCopiaClone = (Document) documento.clone();
        documentCopiaClone.setTitle("Blanca nieves");
        System.out.println("Documento sobreescribiendo clone: " + documentCopiaClone);
    }
}
