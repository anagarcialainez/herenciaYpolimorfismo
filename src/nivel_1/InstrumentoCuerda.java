package nivel_1;

public class InstrumentoCuerda extends Instrumento{
    public InstrumentoCuerda(String nombreInstrumento, int precio){
        super(nombreInstrumento, precio);
    }

    @Override
    public void tocar() {
        System.out.println("Está sonando un instrumento de cuerda y es: " + getNombreInstrumento());
    }

}
