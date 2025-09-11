POOP3


Práctica P03-Programación Orientada a Obejetos



Este repositorio contiene el desarrollo del Proyecto 3 de la asignatura PO. 
Utilizar bibliotecas propias del lenguaje para realizar algunas tareas comunes y recurrentes. 

Teoría Básica 


Un arreglo es un objeto en el que se puede almacenar un conjunto de datos de un mismo tipo. Cada uno de los elementos del arreglo tiene asignado un índice numérico según su posición, siendo 0 el primer índice. Se declara de la siguiente manera:
tipoDeDato [ ] nombreVariable; o tipoDeDato nombreVariable[ ];
Como se puede apreciar, los corchetes pueden estar situados delante del nombre de la variable o detrás. Ejemplos:
int [ ] k; String [ ] p; char datos[ ];
Los arreglos pueden declararse en los mismos lugares que las variables estándar. Para asignar un tamaño al arreglo se utiliza la expresión:
variableArreglo = new tipoDeDato[tamaño];
También se puede asignar tamaño al arreglo en la misma línea de declaración de la
variable.
int [ ] k = new int[5];
Cuando un arreglo se dimensiona, todos sus elementos son inicializados explícitamente al valor por defecto del tipo correspondiente.
Para declarar, dimensionar e inicializar un arreglo en una misma sentencia se indican los valores del arreglo entre llaves y separados por comas. Ejemplo:
int [ ] nums = {10, 20, 30, 40};
El acceso a los elementos de un arreglo se realiza utilizando la expresión:
variableArreglo[índice]

MANEJO DE CADENAS
En Java las cadenas de caracteres no son un tipo de datos primitivo, sino que son objetos pertenecientes a la clase String.
La clase String proporciona una amplia variedad de métodos que permiten realizar las  operaciones de manipulación y tratamiento de cadenas de caracteres habituales en un programa.
Para crear un objeto String podemos seguir el procedimiento general de creación de objetos en Java, utilizando el operador new. Ejemplo:
String s = new String(“Texto de prueba”);
Sin embargo, dada la amplia utilización de estos objetos en un programa, Java permite crear y asignar un objeto String a una variable de la misma forma que se hace con los tipos de datos primitivos. Entonces el ejemplo anterior es equivalente a:
String s = “Texto de prueba”;
Una vez creado el objeto y asignada la referencia al mismo a una variable, puede utilizarse para acceder a los métodos definidos en la clase String (se pueden revisar en la documentación del API com java.lang.String). Los más usados son: length, equals, charAt,
substring, indexOf,replace, toUpperCase, toLowerCase, Split, entre otros.
Ejemplo:
s.length(); //Devuelve el tamaño de la cadena
s.toUpperCase(); //Devuelve la cadena en mayúsculas

WRAPPERS
Los wrappers o clases envoltorio son clases diseñadas para ser un complemento de los tipos primitivos. En efecto, los tipos primitivos son los únicos elementos de Java que no
son objetos. Esto tiene algunas ventajas desde el punto de vista de la eficiencia, pero algunos inconvenientes desde el punto de vista de la funcionalidad.
Por ejemplo, los tipos primitivos siempre se pasan como argumento a los métodos por valor, mientras que los objetos se pasan por referencia. No hay forma de modificar en un método un argumento de tipo primitivo y que esa modificación se trasmita al entorno que hizo la llamada.
Una forma de conseguir esto es utilizar un wrapper, esto es un objeto cuya variable miembro es el tipo primitivo que se quiere modificar. Las clases wrapper también proporcionan métodos para realizar otras tareas con los tipos primitivos, tales como conversión con cadenas de caracteres en uno y otro sentido.
Existe una clase wrapper para cada uno de los tipos primitivos: Byte, Short, Character, Integer, Long, Float, Double y Boolean (obsérvese que los nombres empiezan por mayúscula, siguiendo la nomenclatura típica de Java). Todas estas clases se encuentran en java.lang.
Todas las clases wrapper permiten crear un objeto de la clase a partir de tipo básico.
int k =23;
Integer num = new Integer(k);
A excepción de Character, las clases wrapper también permiten crear objetos partiendo de
la representación como cadena del dato.
String s = “4.65”;
Float ft = new Float(s);



Desarrollo de la práctica 
*Obervamos como esta formado un arreglo, de igual forma se observo la función del operador New. 
*Utilizamos distintas bibliotecas para la realizan de ejercicios como Calendar para imprimir una fecha. 
*Logramos poner en práctica como utilizar estos conceptos para el desarrollo de ejercicios que realizamos en casa.  
