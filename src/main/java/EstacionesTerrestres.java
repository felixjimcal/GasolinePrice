import java.util.List;

public class EstacionesTerrestres {

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public List<EstacionTerrestre> getListaEESSPrecio() {
        return ListaEESSPrecio;
    }

    public void setListaEESSPrecio(List<EstacionTerrestre> listaEESSPrecio) {
        ListaEESSPrecio = listaEESSPrecio;
    }

    String Fecha;
    List<EstacionTerrestre> ListaEESSPrecio;
}
