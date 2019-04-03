Juan Diego González García

isc.juandgg@gmail.com

Proyecto RomanosProyect

Abrir el proyecto RomanosProyect con la plataforma de desarrollo NetBeans y ejecutar la clase principal.

El proyecto RomanosProyect cuenta con una unica clase principal enla cual se desarrollan los procesos necesarios para la conversion de numeros enteros a su reprecentación en numeros romanos.
para esta clase los primero es declarar los atributos que se estaran utilizando en toda la clase, estos seran de tipo publico y estatico ya que sera utilizado en el metodo principal el cual es estatico.
estan variables enteras (n,d,r,a,pos), variables array enteros llamados valoresN (son los valores en numeracion entero de los signos romanos), valoresR (valores de los signos romanos) y valoresF (esta sera para guardar la cantidad de signos).

Se cuentan con 3 metodos, main, cambia y formatea:

En el metodo principal se comienza con un cilo repetivivo que va a solicitar un numero entero al usuario entre el 1 y el 1000 que sera guardado en la variable n, se verifica si el numero es valido, en caso de ser erroneo, se manda un mensaje diciendo que el numero no es valido, y nuevamente se pide el valor, mientras el usuario digite numeros erroneos se estara pidiendo el dato hasta que sea bueno.
antes de continuar, sol valores de los array son:

Nombre del array
Posision  valores: valoresN   valoresR   valoresF
   0                 1000        M          0
   1  		     500         D          0
   2   		     100         C          0
   3                 50          L          0
   4                 10          X          0
   5                 5           V          0
   6                 1           I          0

Se crea un ciclo for que recorrera el array valoresN iniciando desde 0 con un incremento de 2 (Esto con la finalidad de dividir entre los valores 1000,100,10,1)
se obtiene el valor del array valoresN en la posision i declarada en el clico y se asigna a la variable d, se asigna a la variable r la divicion de n (numero ingresado por el usuario) entre la variable d antes obtenida para saber la cantidad,
se multiplica la variable d con la variable r y se asigna a la variable a, en el array valoresF en la posision i se asigna el valor de r, por ultimo se le resta el valor de "a" a "n" y se realiza nuevamente las operaciones.
Despues se crea una variable salida de tipo cadena y se inicia un ciclo for recorriendo el array "valoresF", dentro del ciclo, se crea una variable auxiliar de tipo entera con el valor del array en la posicion actual, se pregunta si ese valor es mayor a 4 con la finalidad de cumplir la regla 1 para repetir solo 3 veces una variable, si es mayor a 4, a la variable salida se le asigna el resultado de mandar el valor y la posicion al metodo formatea, en caso de ser menor, se hace lo mismo, solo que ahora se manda al metodo cambia,
al termino del ciclo se manda por consola el resultado de la conversion.

En el metodo cambia, entra la cantidad y la posición por parametro, se declara una variable de tipo cadena (salida) inicializandola en comillas vacias, esta sera retornada como salida del metodo,
posteriormente se crea un ciclo for iniciando desde 0, con incremento de 1 mientras sea menor a la cantidad entrante, dentro del clico, a la variable salida se concatena el valor que se obtiene del array valoresR en la posicion entrante,
al termino del clico se retorna la salida.

El metodo formatea, hace referencia a las reglas las cuales establecen que algunas de las variables pueden repetirse solo hasta 3 veces.
en este metodo contiene los parametros valor y pos de tipo entero, en ella se crea nuevamente una variable salida de tipo cadena inicializandolo, con un condicional if se verifica si el valor es mayor o igual a 5, en caso de ser falso a la variable salida se le asignan comillas vacias ya que los valores siguientes son enteros y que los tome como cadena, los valores siguientes es valor de valoresR en la posision pos entrante que es el simbolo romano y tambien el valor ahora en la posision pos menos 1, (las posiciones se representaron anteriormente).
por otro lado al ser verdadera se pregunta si el valor es un 5 si es verdadero a la cadena salida se le asigna el valor en la posicion menos uno del array valoresR, en caso de ser falso, se pregunta si el valor es 9, en caso de ser verdadero se asigna a la variable salida el valor del array valoresR en la posicion entrante y el valor en la posis}cion entrante menos 2, en caso de ser falso, a una variable auxiliar de tipo entera se se asigna el valor de la resta entre en valor entrante menos 5 (con la finalidad de dividir el valor en 2 y poder establecer la regla 3)
despues se asigna a la variable salida  el valor del array en la posicion entrante menos 1 y se crea un clico for para asignar los ultimos valores, en el se concatena el valor del array en la posicion entrante la cantidad de veces marcadas en la variable auxiliar. Al termino de ello se retorna la variable salida.

