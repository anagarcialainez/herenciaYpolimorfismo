package nivel_1;

public class InstrumentoViento extends Instrumento {

    public InstrumentoViento(String nombreInstrumento, int precio){

        super(nombreInstrumento,precio);
    }

    public void tocar() {
        System.out.println("Está sonando un instrumento de viento y es: " + getNombreInstrumento());
    }

}
