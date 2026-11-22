public class Main {
    public static void main(String[] args) {

        System.out.println("--- PREFERENCIA: DISCO LOCAL ---");
        FabricaAlmacenamiento fabrica1 = seleccionarFabrica("LOCAL");
        gestionarMultimedia(fabrica1, "video_vacaciones.mp4");

        System.out.println("\n--- PREFERENCIA: SERVIDOR EN LA NUBE ---");
        FabricaAlmacenamiento fabrica2 = seleccionarFabrica("NUBE");
        gestionarMultimedia(fabrica2, "foto_perfil.png");
    }

    // 1. Logica de seleccion (decide que fabrica usar segun la configuracion)
    private static FabricaAlmacenamiento seleccionarFabrica(String preferencia) {
        if (preferencia.equalsIgnoreCase("LOCAL")) {
            return new FabricaLocal();
        } else if (preferencia.equalsIgnoreCase("NUBE")) {
            return new FabricaNube();
        }
        System.out.println("Error: Tipo de almacenamiento no valido.");
        return null;
    }

    // 2. Logica de negocio (usa la interfaz Almacenamiento sin conocer la clase concreta)
    private static void gestionarMultimedia(FabricaAlmacenamiento fabrica, String archivo) {
        if (fabrica == null) {
            return;
        }
        Almacenamiento repo = fabrica.crearAlmacenamiento();
        repo.guardar(archivo);
        repo.recuperar(archivo);
    }
}