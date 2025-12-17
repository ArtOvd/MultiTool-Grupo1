# Practica_Grupo1
Práctica Final del Grupo 1

Autores:
Artem Ovdiienko -líder de repositorio-
Vladyslav Dumynsky
Adrián Subies
William Thompson -documentador-

Colaboradora:
Àngels Chover
______________
README
______________
##  DESCRIPCIÓN:


La aplicación hace uso de un fichero clase Main para estructurar y llamar a las distintas aplicaciones. Cada una de esas aplicaciones se trata de un fichero de clase independiente con sus propias funcionalidades y desarrollado por un integrante en concreto. Este Main se trata de un switch-case que actúa como menú al leer el valor de una variable de tipo Entero entre 1 y 5, y que nos permitirá elegir entre las cuatro aplicaciones o terminar la ejecución del programa. Esta estructura de menú switch-case será recurrente a lo largo de las distintas aplicaciones.


### 1. Gestor de archivos.

Desarrollado por: William Thompson.
Este gestor trabaja con una variable int array de tamaño de 20, con valores no asignados. Al no estar inicializado, el resto de funciones no pueden leer ningún valor inicializado. Por ello, se bloquean todos los valores hasta que exista al menos una variable inicializada. La lectura trabaja a través de un bucle for que recorre los diversos valores, y una variable que cuenta cuántas de esas variables han sido usadas para limitar la lectura de esas variables en los métodos que necesitan leer el array. Existen métodos independientes que se aseguran de la entrada del usuario como input.


### 2. Conversor multitipo.

Desarrollado por: Adrián Subies.
Este conversor permite operar distintas variables double a través de distintos métodos asignados, que más tarde se muestran en pantalla, presuponiendo que se le entrega a la aplicación un valor en un determinado sistema de medida y pasándolo a su equivalente estadounidense. Hace uso de un método Scanner para leer y asignar así el valor cuando se hace uso de los métodos.


### 3. Analizador de texto.

Desarrollado por Vladyslav Dumynsky.
Un menú switch-case que permite analizar distintos casos con Strings.
El primer método ContarVocales() pide una String que se presupone tiene una longitud mayor a 0 y que se pasa a minúsculas (toLowerCase()). Gracias a un bucle for se analiza cada uno de los char que conforman la cadena de caracteres, y que se clasifican a través de un switch-case en cada caso, avanzando una variable que cuenta el total de vocales.

El segundo método ContarPalabras() lee un string asignado a una variable llamada texto y lo pasa por otro método llamado ReemplacarCaracteres() que elimina signos de puntuación, y lo devuelve al método ContarPalabras() como la variable texto. Un método llamado ValidaciónTexto() también recibe el texto y se asegura de que el usuario no haya introducido un string conformado por signos de puntuación, devuelve un booleano y en caso afirmativo (if-else) termina el método con un mensaje en pantalla. Si el texto es correcto, hace uso de la función split propia de las variables string, y más tarde se cuenta con un bucle for y una variable encargada de contar.

El último método trabaja de forma similar. Su estructura es parecida aunque no necesita validar el texto con un método booleano. Se hace uso de un for que recorre cada palabra, y con un if se reasigna el valor de una variable String que almacena la palabra más larga inicializada en 0, y compara si la palabra que se está recorriendo es mayor. Si es así, se reasigna la nueva palabra.

### 4. Gestor de tareas.

Desarrollado por Artem Ovdiienko.
Este método trabaja con un array de Strings con tamaño máximo 15 al que se recurre a través de todos los métodos y una variable entero índice que cuenta cuántos espacios del array han sido usados.
Un primer método addTarea() que se asegura de que haya espacio para añadir el input del usuario. De ser así, se usa un booleano y un while para asegurar que el input del usuario almacenado en una string no esté vacío, que la tarea tenga una longitud mayor a 10 o que la tarea ya se encuentre en la lista.
Un segundo método, listarTareas(), que gracias a un bucle for muestra todas las tareas usadas y las imprime en pantalla.
El tercer método buscarTareas() parte de un if que comprueba que la lista esté inicializada y, usando un booleano, busca en la lista una palabra que coincida con el input del usuario. Un bucle for recorre la lista, y usando otro if, si al comparar strings con .equals devuelve true, el booleano pasa a true y devuelve la string de tarea y la posición que ocupa.


________________
##  CÓMO EJECUTAR:

Al ejecutar el programa, introduce la tecla numérica asignada al programa del que deseas hacer uso, es decir, las teclas del [1] al [4]. Hacer uso de la tecla [5] terminará el programa. Introducir cualquier otro valor repetirá el proceso de menú de selección.

[1] - GESTOR DE ARCHIVOS
[2] - CONVERSOR MULTITIPO
[3] - ANALIZADOR DE TEXTO
[4] - GESTOR DE TAREAS
[5] - SALIR

A continuación se detallan todos los programas en orden de entrada.


### 1. - GESTOR DE NÚMEROS

Este gestor se maneja usando las teclas asociadas a las funciones [1] al [4], y [0] para salir.
Al usar este programa es importante saber que el resto de funciones, al margen de salir, no estarán disponibles hasta que se haya usado por primera vez

[1] - AÑADIR NÚMERO.
Añade un número a una lista de números, hasta un total de 20 números. Introduce un valor entre
-2147483648 y 2147483647, y luego dale a ENTER.

[2] - LISTAR NÚMEROS.
Enseña automáticamente en pantalla todos los números que se han introducido en la lista.

[3] - VER MÍNIMO Y MÁXIMO.
Enseña automáticamente en pantalla el valor mínimo y el valor máximo introducido.

[4] - BUSCAR NÚMERO
Introduce un número entero y dale a Enter. Si se ha introducido previamente en la lista, se
mostrará en pantalla la posición que ocupa en la lista.

[0] - SALIR
Vuelve al menú principal.

### 2. - CONVERSOR MULTITIPO

Este gestor se maneja usando las teclas asociadas a las funciones, [1] - [2] - [3] , y la tecla [0] para salir.

[1] - CELSIUS A FAHRENHEIT
Introduce el valor numérico decimal de una temperatura en Celsius. Se mostrará el valor en Fahrenheit.

[2] - METROS A PIES
Introduce un valor numérico decimal de los metros que se quieren convertir a pies.

[3] - KG A LIBRAS
Introduce un valor numérico entero de los quilogramos que se quieren pasar a libras.

[0] - SALIR
Vuelve al menú principal.


### 3. ANALIZADOR DE TEXTO

Este gestor se maneja usando las teclas asociadas a las funciones, [1] - [2] - [3] , y la tecla [0] para salir.

[1] - CONTAR VOCALES
Introduce una palabra en consola y dale a Enter. Se mostrará el número de vocales totales presentes en la 	palabra.

[2] - CONTAR PALABRAS
Introduce un texto en una sola línea. Se mostrará por pantalla el total de palabras presentes en el texto.

[3] - PALABRA MÁS LARGA
Introduce un texto en una sola línea. Se mostrará por pantalla la palabra más larga del texto.

[0] - SALIR
Vuelve al menú principal.


### 4. GESTIÓN DE TAREAS

Este gestor se maneja usando las teclas asociadas a las funciones, [1] - [2] - [3] , y la tecla [0] para salir.
Esta lista acepta un total de 15 tareas.

[1] - AÑADIR TAREA
Introduce una tarea en la lista, y dale a Enter. Vuelve al menú.

[2] - LISTAR TAREAS
Muestra automáticamente toda la lista de tareas introducidas línea a línea.

[3] - BUSCAR PALABRA
Introduce una palabra, y muestra por pantalla todas las tareas en las que figura la palabra introducida.

[0] - SALIR
Vuelve al menú principal.
