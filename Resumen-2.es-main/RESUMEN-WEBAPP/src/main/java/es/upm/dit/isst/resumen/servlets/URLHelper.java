package es.upm.dit.isst.resumen.servlets;

//Para no tener que escribir la URL a RESUMEN-SERVICE en todos los servlets

public class URLHelper {
    public static String getURL() {
            String envValue = System.getenv("RESUMENSERVICE_SRV_SERVICE_HOST");
            if(envValue == null)
                    return "http://localhost:8080/RESUMEN-SERVICE/rest/TFGs";//Apuntar desde aqui a RESUMEN-SERVICE ¿Resumenes?
            else
                    return envValue;
    }
}
