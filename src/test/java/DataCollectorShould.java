import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DataCollectorShould {

    @Test
    public void HaveConnectivity() {
        boolean IsConnected = DataCollector.CheckConnection();
        assertEquals(IsConnected, true);
    }
}
