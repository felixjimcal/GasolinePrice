import Models.ComunidadAutonoma;
import Models.EstacionesTerrestres;
import Models.EstacionesTerrestresFiltroCCAAProducto;
import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

public class DataManager {

    public static EstacionesTerrestres GetEstacionesTerrestres(String data) {

        Gson gson = new Gson();
        EstacionesTerrestres estacionesTerrestres = gson.fromJson(data, EstacionesTerrestres.class);

        return estacionesTerrestres;
    }

    public static EstacionesTerrestresFiltroCCAAProducto GetEstacionesTerrestresFiltroCCAAProducto(String data) {

        Gson gson = new Gson();
        EstacionesTerrestresFiltroCCAAProducto estacionesTerrestresFiltroCCAAProductos = gson.fromJson(data, EstacionesTerrestresFiltroCCAAProducto.class);

        return estacionesTerrestresFiltroCCAAProductos;
    }

    public static List GetComunidadesAutonomas(String data) {

        Gson gson = new Gson();
        ComunidadAutonoma[] arraya = gson.fromJson(data, ComunidadAutonoma[].class);

        List <ComunidadAutonoma> ccaa = Arrays.asList(arraya);

        return ccaa;
    }
}
