public class AlmacenamientoLocal implements Almacenamiento {
    private String rutaCarpeta;

    public AlmacenamientoLocal(String rutaCarpeta) {
        this.rutaCarpeta = rutaCarpeta;
    }

    @Override
    public void guardar(String nombreArchivo) {
        System.out.println("[Disco Local] Guardando '" + nombreArchivo + "' en " + rutaCarpeta);
    }

    @Override
    public void recuperar(String nombreArchivo) {
        System.out.println("[Disco Local] Leyendo '" + nombreArchivo + "' desde " + rutaCarpeta);
    }
}