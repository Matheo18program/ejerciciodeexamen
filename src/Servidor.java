public class Servidor {
    private String nombre;
    private String direccionIP;
    private int puerto;
    private boolean activo;

    private static int contador = 0;

    public Servidor(String nombre, String direccionIP, int puerto) {
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.puerto = puerto;
        this.activo = false;
        contador++;
    }

    public static int getTotalCreados() {
        return contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        } else {
            System.out.println("Advertencia: el nombre no puede estar vacío.");
        }
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        if (puerto > 0) {
            this.puerto = puerto;
        } else {
            System.out.println("Advertencia: el puerto debe ser mayor que 0.");
        }
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void encender() {
        this.activo = true;
    }

    public void apagar() {
        this.activo = false;
    }

    public void mostrarDatos() {
        System.out.println("Servidor: " + nombre);
        System.out.println("IP: " + direccionIP);
        System.out.println("Puerto: " + puerto);
        System.out.println("Estado: " + (activo ? "ENCENDIDO" : "APAGADO"));
    }
}