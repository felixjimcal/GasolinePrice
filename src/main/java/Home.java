import Models.EstacionesTerrestres;
import Models.EstacionesTerrestresFiltroCCAAProducto;
import REQUESTS.SPAIN;

import java.util.List;

public class Home {

    public static void main(String[] args) throws Exception {

        String url, Data;

        url = SPAIN.EstacionesTerrestres.getUrl();
        Data = DataCollector.GetData(url);
        EstacionesTerrestres estacionesTerrestres = DataManager.GetEstacionesTerrestres(Data);

        url = SPAIN.EstacionesTerrestresFiltroCCAA.getUrl();
        url += "09"; // Cataluña
        Data = DataCollector.GetData(url);
        EstacionesTerrestres estacionesTerrestresFiltroCCAA = DataManager.GetEstacionesTerrestres(Data);

        url = SPAIN.EstacionesTerrestresFiltroCCAAProducto.getUrl();
        url += "09"; // IDCCAA (Catalunya)
        url += "/";
        url += "3"; // IDProducto (G98)
        Data = DataCollector.GetData(url);
        EstacionesTerrestresFiltroCCAAProducto estacionesTerrestresFiltroCCAAProducto = DataManager.GetEstacionesTerrestresFiltroCCAAProducto(Data);








        url = SPAIN.ComunidadesAutonomas.getUrl();
        Data = DataCollector.GetData(url);
        List ComunidadesAutonomas = DataManager.GetComunidadesAutonomas(Data);

        System.out.println(Data);

    }
}
