package nivel_1;

public class InstrumentoPercusion extends Instrumento{
    public InstrumentoPercusion(String nombreInstrumento, int precio) {
    super(nombreInstrumento, precio);
    }

    @Override
    public void tocar() {
        System.out.println("Está sonando un instrumento de percusión y es: " + getNombreInstrumento());
    }


}
