package nivel_1;

public abstract class Instrumento {
    private String nombreInstrumento;
    private int precio;

    public static void main(String[] args) {
        InstrumentoViento viento1 = new InstrumentoViento("trompeta", 189);
        viento1.tocar();
        InstrumentoCuerda cuerda1 = new InstrumentoCuerda("Guitarra",70);
        cuerda1.tocar();
        InstrumentoPercusion percusion1 = new InstrumentoPercusion("Bombo",250);
        percusion1.tocar();
    }

    //constructor
    public Instrumento(String nombreInstrumento, int precio) {
        this.nombreInstrumento = nombreInstrumento;
        this.precio = precio;
    }

    //getters y setters
    public String getNombreInstrumento() {
        return nombreInstrumento;
    }

    public void setNombreInstrumento(String nombreInstrumento) {
        this.nombreInstrumento = nombreInstrumento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //métodos
    public abstract void tocar();

}
