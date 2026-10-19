//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Total creados: " + Servidor.getTotalCreados());

        Servidor s1 = new Servidor("Web", "192.168.1.10", 80);
        Servidor s2 = new Servidor("BaseDatos", "192.168.1.20", 3306);
        Servidor s3 = new Servidor("Correo", "192.168.1.30", 25);

        // Prueba de datos incorrectos
        System.out.println("\n--- Probando datos incorrectos ---");
        s1.setPuerto(-5);
        s2.setNombre("");
        System.out.println("Puerto de s1: " + s1.getPuerto());
        System.out.println("Nombre de s2: " + s2.getNombre());

        // Acciones
        s1.encender();

        System.out.println("\n--- Datos de los servidores ---");
        s1.mostrarDatos();
        System.out.println();
        s2.mostrarDatos();
        System.out.println();
        s3.mostrarDatos();

        System.out.println("\nTotal creados: " + Servidor.getTotalCreados());
    }
}