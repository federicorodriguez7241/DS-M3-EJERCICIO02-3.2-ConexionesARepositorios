public class FabricaLocal extends FabricaAlmacenamiento {
    @Override
    public Almacenamiento crearAlmacenamiento() {
        return new AlmacenamientoLocal("C:/Usuarios/Multimedia/");
    }
}
