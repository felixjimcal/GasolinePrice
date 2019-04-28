import REQUESTS.SPAIN;

import java.util.ArrayList;
import java.util.List;

public class Home {

    public static void main(String[] args) throws Exception {

        String url = SPAIN.ComunidadesAutonomas.getUrl();
        String Data = DataCollector.GetData(url);
        List ComunidadesAutonomas = DataManager.GetComunidadesAutonomas(Data);

        /*
        String url = SPAIN.EstacionesTerrestres.getUrl();
        String Data = DataCollector.GetData(url);
        List EstacionesTerrestres = DataManager.GetEstacionesTerrestres(Data);
        */

        System.out.println(Data);

    }
}
