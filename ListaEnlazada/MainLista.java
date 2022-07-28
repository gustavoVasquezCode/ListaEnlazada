import java.io.*;
import java.lang.NumberFormatException;

public class MainLista {
    public static void main(String[] args) throws IOException, NumberFormatException{
        boolean bandera = true;
        int opcion = 0;

        ListaEnlazada obj1 = new ListaEnlazada();

        InputStreamReader ent = new InputStreamReader(System.in);
        BufferedReader al = new BufferedReader(ent);

        while (bandera) {
            try {
                System.out.println("\n***************Seleccione una opcion del menu***************");
                System.out.println("1.Verificar contenido \n2.Insertar elementos \n3.Mostrar lista \n4.Salir");
                System.out.print("Opcion: ");
                opcion = Integer.valueOf(al.readLine()).intValue();
            } catch (NumberFormatException e) {
                System.out.println("\nError tipo: " + e);
            }
            if (opcion == 1) {
                System.out.println("\n*************** Verificar contenido ***************");
                obj1.estaVacia();
            }
            else if (opcion == 2) {
                System.out.println("\n*************** Insertar elementos ***************");
                obj1.introducirDatos();
            }
            else if (opcion == 3) {
                System.out.println("\n*************** Mostrar lista ***************");
                obj1.listar();
                System.out.println("\n");
            }
            else if (opcion == 4)
                bandera = false;
            else
                System.out.println("\nError, opcion incorrecta, vuelve a intentar.");
        }

    }
}
