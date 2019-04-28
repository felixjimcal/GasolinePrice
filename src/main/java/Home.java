import REQUESTS.SPAIN;

public class Home {

    public static void main(String[] args) throws Exception {

        String url = SPAIN.EstacionesTerrestres.getUrl();

        String Data = DataCollector.GetData(url);

        System.out.println(Data);

    }
}
