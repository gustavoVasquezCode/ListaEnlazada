public class ListaEnlazada {
private Nodo primero;
private int numeroElementos;

public static void main(String[] args) {
ListaEnlazada obj1 = new ListaEnlazada();
obj1.estaVacia();
obj1.insertarElemento(7);
obj1.insertarElemento(4);
obj1.insertarElemento(0);
obj1.insertarElemento(10);
obj1.insertarElemento(5);
System.out.println("");
obj1.listar();
System.out.println("");
obj1.estaVacia();
}

public ListaEnlazada() {
this.primero = null;
this.numeroElementos = 0;
}

// validar si la lista esta vacia
public void estaVacia() {
if(primero == null)
   System.out.println("La lista esta vacia.");
else
   System.out.println("La lista tiene " + numeroElementos + " elementos.");
}

// agregar elementos a la lista
public void insertarElemento(int dato) {
Nodo nuevo = new Nodo(dato);
nuevo.siguiente = primero;
primero = nuevo;
numeroElementos++;
}

// listamos la lista
public void listar() {
Nodo actual = primero;
while(actual != null) {
System.out.print("[" + actual.dato + "]--->");
actual = actual.siguiente;
}
System.out.println("null");
}

}