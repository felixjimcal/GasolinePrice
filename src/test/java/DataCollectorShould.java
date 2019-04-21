
import org.junit.Before;
import org.junit.Test;

import java.net.HttpURLConnection;
import java.net.URL;

import static junit.framework.TestCase.assertEquals;

public class DataCollectorShould {

    String strUrl = "https://sedeaplicaciones.minetur.gob.es/ServiciosRESTCarburantes/PreciosCarburantes/Listados/ComunidadesAutonomas/";

    @Before
    public void Initialize() {
        DataCollector.setURL(strUrl);
    }

    @Test
    public void HaveAURLToConnect() {
        String expected_url = DataCollector.getURL();
        assertEquals(expected_url, strUrl);
    }

    @Test
    public void HaveConnectivity() {
        boolean IsConnected = DataCollector.CheckConnection();
        assertEquals(IsConnected, true);
    }

    @Test
    public void ParseData()
    {
        try
        {
           // GasStation msg = new Gson().fromJson("", GasStation.class);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
