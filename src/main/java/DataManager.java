import Models.ComunidadAutonoma;
import Models.EstacionesTerrestres;
import Models.ProductosPetroliferos;
import Models.Provincias;
import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

class DataManager {

    static EstacionesTerrestres GetEstacionesTerrestres(String data) {

        Gson gson = new Gson();
        EstacionesTerrestres estacionesTerrestres = gson.fromJson(data, EstacionesTerrestres.class);

        return estacionesTerrestres;
    }

    static List GetComunidadesAutonomas(String data) {

        Gson gson = new Gson();
        ComunidadAutonoma[] arraya = gson.fromJson(data, ComunidadAutonoma[].class);

        return Arrays.asList(arraya);
    }

    static List GetProductosPetroliferos(String data){

        Gson gson = new Gson();
        ProductosPetroliferos[] arraya = gson.fromJson(data, ProductosPetroliferos[].class);

        return Arrays.asList(arraya);
    }

    static List GetProvincias(String data){

        Gson gson = new Gson();
        Provincias[] arraya = gson.fromJson(data, Provincias[].class);

        return Arrays.asList(arraya);
    }
}
