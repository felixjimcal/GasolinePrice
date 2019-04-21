import java.net.HttpURLConnection;
import java.net.URL;

class DataCollector {
    private static HttpURLConnection urlConn;

    public static String DataCollected;
    static

    public static boolean CheckConnection() {
        boolean result = false;
        try
        {
            URL url = new URL(URL);
            urlConn = (HttpURLConnection) url.openConnection();
            urlConn.connect();

            if(urlConn.getResponseCode() == HttpURLConnection.HTTP_OK)
            {
                result = true;
            }

        } catch (Exception ex) {
            System.err.println("Error creating HTTP connection");
            ex.printStackTrace();
        }
        finally {
            urlConn.disconnect();
        }

        return result;
    }

    public CollectData()
    {

    }
}
