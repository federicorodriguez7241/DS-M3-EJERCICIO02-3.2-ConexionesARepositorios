public class AlmacenamientoNube implements Almacenamiento {
    private String urlServidor;

    public AlmacenamientoNube(String urlServidor) {
        this.urlServidor = urlServidor;
    }

    @Override
    public void guardar(String nombreArchivo) {
        System.out.println("[Nube] Subiendo '" + nombreArchivo + "' al servidor " + urlServidor);
    }

    @Override
    public void recuperar(String nombreArchivo) {
        System.out.println("[Nube] Descargando '" + nombreArchivo + "' desde " + urlServidor);
    }
}
