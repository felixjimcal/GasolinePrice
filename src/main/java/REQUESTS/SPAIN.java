package REQUESTS;

public enum SPAIN {

    EstacionesTerrestres("https://sedeaplicaciones.minetur.gob.es/ServiciosRESTCarburantes/PreciosCarburantes/EstacionesTerrestres/"),
    EstacionesTerrestresFiltroCCAA("https://sedeaplicaciones.minetur.gob.es/ServiciosRESTCarburantes/PreciosCarburantes/EstacionesTerrestres/FiltroCCAA/");

    private String url;

    SPAIN(String envUrl) {
        this.url = envUrl;
    }

    public String getUrl() {
        return url;
    }
}
