
import java.net.HttpURLConnection;
import java.net.URL;

class DataCollector {
    static String URL = "";

    public static String getURL() {
        return URL;
    }

    public static void setURL(String URLToConnect) {
        URL = URLToConnect;
    }

    public static boolean CheckConnection() {
        boolean result = false;

        HttpURLConnection urlConn = null;
        try
        {
            URL url = new URL(DataCollector.getURL());
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
}
