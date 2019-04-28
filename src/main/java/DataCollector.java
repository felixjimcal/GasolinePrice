
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class DataCollector {
    static String URL = "";
    static HttpURLConnection urlConn = null;
    private static String requestData;

    public static String getURL() {
        return URL;
    }

    public static void setURL(String URLToConnect) {
        URL = URLToConnect;
    }

    public static boolean CheckConnection() {
        boolean result = false;

        try
        {
            URL url = new URL(DataCollector.getURL());
            urlConn = (HttpURLConnection) url.openConnection();
            urlConn.setRequestMethod("GET");
            urlConn.setRequestProperty("Accept","application/json");
            urlConn.setRequestProperty("Content-Type","application/json");
            urlConn.connect();

            if(urlConn.getResponseCode() == HttpURLConnection.HTTP_OK)
            {
                result = true;

                ReadResponse();
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

    private static void ReadResponse() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }

        requestData = response.toString();

        in.close();
    }

    public static String GetData(String url )
    {
        DataCollector.setURL(url);

        String response = "No data collected";

        if(CheckConnection())
        {
            response = requestData;
        }

        return response;
    }
}
