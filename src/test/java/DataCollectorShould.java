
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;

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
}
