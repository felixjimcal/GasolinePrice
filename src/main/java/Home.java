import REQUESTS.SPAIN;

import java.util.List;

public class Home {

    public static void main(String[] args) throws Exception {

        String url, Data;

        url = SPAIN.ComunidadesAutonomas.getUrl();
        Data = DataCollector.GetData(url);
        List ComunidadesAutonomas = DataManager.GetComunidadesAutonomas(Data);

        url = SPAIN.EstacionesTerrestres.getUrl();
        Data = DataCollector.GetData(url);
        EstacionesTerrestres estacionesTerrestres = DataManager.GetEstacionesTerrestres(Data);



        System.out.println(Data);

    }
}
