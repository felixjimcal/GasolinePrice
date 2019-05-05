import Models.EstacionesTerrestres;
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
        EstacionesTerrestres estacionesTerrestresFiltroCCAAProducto = DataManager.GetEstacionesTerrestres(Data);

        url = SPAIN.EstacionesTerrestresFiltroMunicipio.getUrl();
        url += "1"; // IDMunicipio (Alegría-Dulantzi)
        Data = DataCollector.GetData(url);
        EstacionesTerrestres estacionesTerrestresFiltroMunicipio = DataManager.GetEstacionesTerrestres(Data);

        url = SPAIN.EstacionesTerrestresFiltroMunicipioProducto.getUrl();
        url += "1"; // IDMunicipio (Alegría-Dulantzi)
        url += "/";
        url += "1"; // IDProducto (I don't remember what is)
        Data = DataCollector.GetData(url);
        EstacionesTerrestres estacionesTerrestresFiltroMunicipioProducto = DataManager.GetEstacionesTerrestres(Data);

        url = SPAIN.EstacionesTerrestresFiltroProducto.getUrl();
        url += "3"; // IDPRODUCTO (G98)
        Data = DataCollector.GetData(url);
        EstacionesTerrestres estacionesTerrestresFiltroProducto = DataManager.GetEstacionesTerrestres(Data);

        url = SPAIN.EstacionesTerrestresFiltroProvincia.getUrl();
        url += "01"; // PROVINCIA (ÁLAVA)
        Data = DataCollector.GetData(url);
        EstacionesTerrestres estacionesTerrestresFiltroProvincia = DataManager.GetEstacionesTerrestres(Data);

        url = SPAIN.EstacionesTerrestresFiltroProvinciaProducto.getUrl();
        url += "01"; // PROVINCIA (ÁLAVA)
        url += "/";
        url += "3"; // IDPRODUCTO (G98)
        Data = DataCollector.GetData(url);
        EstacionesTerrestres estacionesTerrestresFiltroProvinciaProducto = DataManager.GetEstacionesTerrestres(Data);

        // ------------------------------------------------------------------------------------------------------------
        url = SPAIN.ComunidadesAutonomas.getUrl();
        Data = DataCollector.GetData(url);
        List ComunidadesAutonomas = DataManager.GetComunidadesAutonomas(Data);

        // ------------------------------------------------------------------------------------------------------------
        url = SPAIN.Municipios.getUrl();
        Data = DataCollector.GetData(url);
        List Municipios = DataManager.GetComunidadesAutonomas(Data);

        url = SPAIN.MunicipiosPorProvincia.getUrl();
        url += "01"; // PROVINCIA (ÁLAVA)
        Data = DataCollector.GetData(url);
        List MunicipiosPorProvincia = DataManager.GetComunidadesAutonomas(Data);

        // ------------------------------------------------------------------------------------------------------------
        url = SPAIN.ProductosPetroliferos.getUrl();
        Data = DataCollector.GetData(url);
        List ProductosPetroliferos = DataManager.GetProductosPetroliferos(Data);

        // ------------------------------------------------------------------------------------------------------------
        url = SPAIN.Provincias.getUrl();
        Data = DataCollector.GetData(url);
        List Provincias = DataManager.GetProvincias(Data);

        url = SPAIN.ProvinciasPorComunidad.getUrl();
        url += "01"; // PROVINCIA (ÁLAVA)
        Data = DataCollector.GetData(url);
        List ProvinciasPorComunidad = DataManager.GetProvincias(Data);

        System.out.println(Data);

    }
}
