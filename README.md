README. :::AUTOR::: 
Gabriela Alejandra Goycochea Romero Seccion 2 Analista Programador Computacional Online

Nombre del proyecto: SalmonttAppV5

Descripción El proyecto genera una interfaz grafica para agregar y visualizar productos con respecto a los datos de diferentes centros operativos.
Los datos que te permite agregar el programa por centro:
    
    Tipo de Centro
    Nombre del Centro
    Ubicacion del Centro
    Cantidad de producto en el centro
    Capacidad del centro para el producto -Estado del centro (Ok o sobrecapacidad)
    Producto a tratar en el centro.

Permite en la interfaz mostrar la información heredada en la subclases (nombre, ubicacion, cantidad de producto, capacidad del centro)

Estructura. Dentro de la carpeta src/com.Salmontt.App.version5 Se encuentran 4 paquetes de trabajo.

1.- Model que tiene la clase de los objetos a utilizar -> CentrosDeReproduccion -> CentrosDeCrecimiento -> CentrosOperativos -> PlantaDeProcesamiento -> PlantaProduccionAlimentos -> Registrable (interfaz general)

2.-Data tiene los datos que permiten crear la lista donde se agregan los centros por la interfaz, mostrar el dato, verificar como proceder con instance of y actualizarlo.

3.- UI contiene 2 paquetes:

-> Menu Principal : Donde se encuentra el MAIN. 
->Ventana Principal: Tiene la estructura para crear la ventana principal de la interfaz y que permiten agregar los datos.

4.- Test  -> Contiene datos de pruebas para verificar la visualización de la interfaz.

Ejecutable -> Para ejecutar el proyecto debe ir a la carpeta "menu principal" dentro de UI -> Localizar la clase Main -> Click derecho y "Run"

De querer realizar la prueba, se debe ir al Test -> claseprueba click derecho y "run"
