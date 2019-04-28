import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

public class DataManager {

    public static EstacionesTerrestres GetEstacionesTerrestres(String data) {

        Gson gson = new Gson();
        EstacionesTerrestres arraya = gson.fromJson(data, EstacionesTerrestres.class);

        return arraya;
    }

    public static List GetComunidadesAutonomas(String data) {

        Gson gson = new Gson();
        ComunidadesAutonomas[] arraya = gson.fromJson(data, ComunidadesAutonomas[].class);

        List <ComunidadesAutonomas> ccaa = Arrays.asList(arraya);

        return ccaa;
    }
}
