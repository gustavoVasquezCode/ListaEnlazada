# ListaEnlazada
Quise compartir la práctica que hice de forma autodidácta mi código de una lista enlazada en java usando bloc de notas y cmd para compilar. Mas adelante lo hare en C++ y python y lógico que el programa ira mejorando poco a poco, el chiste es mostrar mi avance en las estructuras de datos.
Lo explicare como reporte de práctica.

### Nodo.java
La clase nodo, contendra solo 2 atributos, el objeto nodo de tipo siguiente que sirve como enlace a otro nodo y dato que es para almacenar un dato al nodo, y con su constructor se le declara un parametro llamado "dato",  a siguiente se le asigna null porque no sabemos a que apunta y a "dato" le asignamos el parametro "dato" del constructor.

![image](https://user-images.githubusercontent.com/70463233/178560999-318d9873-040a-4727-a1e7-1845e111c51f.png)

### ListaEnlazada.java
Se crea una clase nombrada "ListaEnlazada" y se declara 2 atributos, un objeto de tipo nodo llamado "primero" y el otro de tipo entero llamado "numeroElementos", ambos privados.

![image](https://user-images.githubusercontent.com/70463233/178557296-71f57b55-8130-4668-a751-14c17a884c56.png)

Se codifica un constructor no parametrizado, donde cada uno de los atributos seran inicializados a nulo para "primero" porque no sabemos a que apunta y 0 para "numeroElementos".

![image](https://user-images.githubusercontent.com/70463233/178557591-99017ad8-823f-4125-b991-48779c2caad1.png)

Creamos un método llamado «estaVacia()» para validar si la lista tiene o no tiene elementos, el cual se usara una condicional if-else donde si "primero" es nulo, la lista esta vacia, caso contrario, la lista tiene por lo menos 1 elemento y se concatena el atributo "numeroElementos" en la impresion para indicar cuantos elementos hay en la lista.

![image](https://user-images.githubusercontent.com/70463233/178558115-6e73f8b7-625e-4f32-8986-d34e2a9506d8.png)

Creamos un método parametrizado llamado «insertarElemento()», donde su parametro es de tipo entero llamado "dato". Dentro del método se crear un objeto de tipo nodo llamado "nuevo" donde su instancia es de la clase Nodo y pasamos como parametro lo ya declarado en este método, es decir, "dato", posteriormente "nuevo.siguiente" estara asignado por el valor de "primero" y "primero" almacenara el valor de "nuevo" y "numeroElementos" ira incrementando de 1 en 1.

![image](https://user-images.githubusercontent.com/70463233/178559087-fa2ff393-ebd9-48d0-950d-91d03a46669b.png)

Por consiguiente, se creara un método llamado «listar()» el cual vamos a imprimir toda la lista enlazada, se creara un objeto de tipo nodo llamado "actual" donde esar inicializado o se almacenara los valores de "primero". Se ejecutara una condicional que mientras actual sea diferente de null,ira ejecutando las siguientes instrucciones: imprimir "actual.dato" que hace referencia a cada elemento de la lista, pero para avanzar a cada elemento usamos "actual = actual.siguiente" hasta que nuestro objeto actual ya apunte a un valor nulo.

![image](https://user-images.githubusercontent.com/70463233/178560161-6422c97c-6aef-43db-8b98-21867052e305.png)

Para finalizar esta clase, se crear el método principal "main", haciendo instancia un objeto de la clase ListaEnlazada y se invocara cada uno de los elementos correspondientes.

![image](https://user-images.githubusercontent.com/70463233/178560441-93981690-39ea-4096-b481-7acf7625f31c.png)


### Resultados
A continuacion se muestra los resultados de la lista enlazada, compilado y ejecutado en CMD.

![image](https://user-images.githubusercontent.com/70463233/178560762-bb53bef0-3581-4639-9760-a77f024ed5c9.png)
