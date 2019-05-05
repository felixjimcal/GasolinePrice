package Models;

import java.util.List;

public class EstacionesTerrestres {
    String Fecha;

    List ListaEESSPrecio;

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public List getListaEESSPrecio() {
        return ListaEESSPrecio;
    }

    public void setListaEESSPrecio(List listaEESSPrecio) {
        ListaEESSPrecio = listaEESSPrecio;
    }

}
