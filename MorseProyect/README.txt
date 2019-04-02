Juan Diego González García

isc.juandgg@gmail.com

Proyecto MorseProyect

Abrir el proyecto MorseProyect con la plataforma de desarrollo NetBeans.

Cuenta con una unica clase principal, esta misma se ejecuta para ejecutar el proyecto.
en esta clase primero se declaran las variables a utilizar, estas variables seran publicas y estaticas ya que seran utilizadas por el metodo main el cual es estatico y solo acepta variables estaticas.
Las variables a utilizar son:
variables de tipo String llamados mensajeN, mensajeM, salida y entry inicializadas en comillas vacias.
variable de tipo boolean llamado bandera inicializada en true.
variable de tipo array de string llamado codigos inicializada en null.
variable de tipo int llamado seleccion inicializado en 0.

Los metodos utilizados son main (principal), traductorTM (traductor de texto a codigo morse) y traductorMT (traductor de codigo morse a texto)

El metodo traductorTM contiene una variable de entrada de tipo char llamada character para ser utilizada dentro del metodo en un codicional selectivo switch, en este condicional se establece el abecedario en mayusculas y numeros 
con sus respectivos valores en codigo morse asignandoselos a la variable salida, al establecer el valor, esta cadena es regresada o retornada con un especio al final, en caso de no encontrar el caracter el valor de la cadena salida sera vacia.

El metodo traductorMT es similar al anterior solo que este su variable de entrada no es un caracter, es una cadena, esta cadena de texto es utilizada en el switch para ser traducida en letras o numeros respectivamente, al igual que en el metodo anterior,
 estos valores son asignados a la variable salida, en caso de no encotrar la cadena de entrada el valor de salida sera vacio, a diferencia del metodo anterior, este regresara solo el valor de salida, sin espacios.

En el metodo principal se tiene um ciclo repetitivo do while para ejecutar instrucciones mientras no sea la opcion 3, en el cual su primera instruccion es mandar un mensaje de Bienvenida y mostrar un menu de opciones, estas opciones son 1.- Convertir texto a codigo morse, 2.- Convertir codigo morse a texto y 3.- Salir.
despues del mensaje se crea una variable de tipo Scanner llamada entradaEscaner inicializando el objeto, posteriormente a la variable entry se le asigna la lectura de la cosola, esa cadena es convertida a entera y asignada a la variable selection, se crea un switch con esta variable, 

En caso de que sea la opcion 1, se solicita al usuario ingrear un texto, se asigna a la variable mensajeN la lectura de cosola, se crea un cliclo repetitivo for con la variable entera i inicializada en 0, con condicional mientras i sea menor que mensajeN.legth() (tamaño de la cadena),
con un incremento de 1 (i++), dentro de este cliclo solo se ejecuta una acción obteniendo el caracter de la cadena mensajeN en la posición i el cual es enviado al metodo traductorTM, este metodo regresa la traduccion delcaracter en codigo morse y es concatenada a la variable mensajeM,
al tarminar este ciclo se manda mensaje traducido por consola.

En caso de que sea la opcion 2, de igual manera se solicita el codigo morse al usuario, se lee la entrada y es asignada a la variable mensajeM, esta variable es dividida por cada espacio en blanco con el metodo split y almacenado en la variable codigos, se le asignan comillas vacias
a la variable menajeN y procedemos a crear un cliclo repetitivo for con una variable entera llamada i inicializdada en 0, con una condicion mientras i sea menor a codigos legth y un incremento de 1, dentro de este cliclo se icluye un condicional para preguntar si la cadena en la posisión i es vacia, 
en caso de ser veradera se omite esa posision y se incrementa la variable i (Esto se realiza con la finalidad de que se asigne solo un espacio en blanco ya que 1 espacio en blanco son 3 espacios encodigo morse y al dividir la cadena obtiene 2 cadenas vacias que se traducen a espacios en blanco), 
despues de esta condiciónse manda la cadena almacenada en la variable codigos en la posisión i al metodo traductorMT el cual retorna la traduccion, esta se concatena a la variable mensajeN y se continua con el ciclo, al finalizar se manda por consola el resultado de la cadena.

En caso que precione la opción 3 manda un mensaje por consola indicando el final del programa.

En todo caso que el usuario ingrese una opcion diferente, se volvera a mostrar el mismo menu y pedir una opcion valida.