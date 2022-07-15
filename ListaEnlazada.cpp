#include <iostream>
#include <stdlib.h>

class Nodo {
	public:
		Nodo *siguiente;
		int dato;
		Nodo(int dato){
			this->dato = dato;
			this->siguiente = NULL;
		}
};

class ListaEnlazada{
	private:
		Nodo *primero;
		int numeroElementos;
	public:
		ListaEnlazada(){
			this->primero = NULL;
			this->numeroElementos = 0;
		}
		
		void estaVacia() {
			if(primero == NULL)
				std::cout << "La lista esta vacia." << std::endl;
			else
				std::cout << "La lista tiene " << numeroElementos << " elementos." << std::endl;
		}
		
		void insertarDatos(int dato) {
			Nodo *nuevo = new Nodo(dato);
			nuevo->siguiente = primero;
			primero = nuevo;
			numeroElementos++;
		}
		
		void listar() {
			Nodo *actual = primero;
			while(actual != NULL) {
				std::cout << "[" << actual->dato << "]--->";
				actual = actual->siguiente;
			}
			std::cout << "NULL" << std::endl;
		}
};

int main(void) {
	ListaEnlazada *obj1 = new ListaEnlazada();
	obj1->estaVacia();
	std::cout << "" << std::endl;
	obj1->insertarDatos(8);
	obj1->insertarDatos(15);
	obj1->insertarDatos(36);
	obj1->insertarDatos(23);
	obj1->insertarDatos(1);
	obj1->listar();
	std::cout << "" << std::endl;
	obj1->estaVacia();
	std::cout << "" << std::endl;
	
	
	system("pause > 0");
	return EXIT_SUCCESS;
}
