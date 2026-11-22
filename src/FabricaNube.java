public class FabricaNube extends FabricaAlmacenamiento {
    @Override
    public Almacenamiento crearAlmacenamiento() {
        return new AlmacenamientoNube("https://nube.miapp.com/archivos/");
    }
}