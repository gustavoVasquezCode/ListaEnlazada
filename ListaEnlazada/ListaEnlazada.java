import java.io.*;
import java.lang.NumberFormatException;

public class ListaEnlazada {
    private Nodo primero;
    private int tamanio;

    InputStreamReader ent = new InputStreamReader(System.in);
    BufferedReader al = new BufferedReader(ent);

    public ListaEnlazada() {
        this.primero = null;
        this.tamanio = 0;
    }

    public void estaVacia() {
        if(primero == null)
           System.out.println("La lista esta vacia.");
        else
           System.out.println("La lista tiene " + tamanio + " elementos.");
    }

    public void introducirDatos() throws IOException, NumberFormatException{
        int dato = 0;
        boolean bandera = true;
        while(bandera) {
            try {
                System.out.print("Introduzca un dato a la lista: ");
                dato = Integer.valueOf(al.readLine()).intValue();
                bandera = false;
            } catch (NumberFormatException e) {
                System.out.println("\n" + e + "\n");
            }
        }
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = primero;
        primero = nuevo;
        tamanio++;
    }

    public void listar() {
        Nodo actual = primero;
        while (actual != null) {
            System.out.print("[" + actual.dato + "]-->");
            actual = actual.siguiente;
        }
        System.out.print("null");
    }
}
