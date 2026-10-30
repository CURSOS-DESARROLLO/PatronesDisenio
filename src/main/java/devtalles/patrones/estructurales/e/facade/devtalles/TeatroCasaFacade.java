package devtalles.patrones.estructurales.e.facade.devtalles;

public class TeatroCasaFacade {
    private Proyector proyector;
    private ReproductorVideo reproductorVideo;
    private SistemaSonido sistemaSonido;
    private MaquinaPalomitas maquinaPalomitas;

    public TeatroCasaFacade(Proyector proyector, ReproductorVideo reproductorVideo, SistemaSonido sistemaSonido, MaquinaPalomitas maquinaPalomitas) {
        this.proyector = proyector;
        this.reproductorVideo = reproductorVideo;
        this.sistemaSonido = sistemaSonido;
        this.maquinaPalomitas = maquinaPalomitas;
    }

    public void comenzarFuncion() {
        System.out.println("Comenzando preparaciones para ver película");
        this.maquinaPalomitas.comenzarPreparacion();
        this.proyector.encender();
        this.reproductorVideo.encender();
        this.reproductorVideo.reproducir();
        this.sistemaSonido.prender();
        System.out.println("Disfrute la pelicula");
    }

    public void terminarFuncion() {
        System.out.println("Terminando la función de la pelicula");
        this.maquinaPalomitas.terminarPreparacion();
        this.proyector.apagar();
        this.reproductorVideo.apagar();
        this.sistemaSonido.apagar();
        System.out.println("Hasta pronto...");
    }
}
