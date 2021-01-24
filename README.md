# Curso POO
**Programación Orientada a Objetos: POO**
Esta hecho con mucho amor por el aprendizaje de [Platzi](https://platzi.com/r/cesarcalad/ "Platzi") :green_heart:

## Introducción
### Paradigma Orientado a Objetos
Es la forma de pensar sobre la orientación de objetos y esto surge a partir de los problemas que necesitamos plasmar en código. 
Un paradigma es una teoría que suministra la base y modelo para resolver problemas. La paradigma de Programación Orientada a Objetos se compone de 4 elementos:
- Clases
- Propiedades
- Métodos
- Objetos

Y 4 pilares:

- Encapsulamiento
- Abstracción
- Herencia
- Polimorfismo

## Orientación a Objetos
### Objetos
Son aquellos que tienen propiedades y comportamientos, también serán sustantivos.
- Pueden ser Físicos o Conceptuales
**Físicos:** Se refiere a la realidad como ejemplo; Manzana, perro, persona, etc.
**Conceptuales:** Se refiere que no existen en la realidad que viven en nuestra mente o procesos. Por ejemplo; Session
**Sustantivo:** Son la clase de palabras que dan nombre o identifican a todas las cosas que conocemos.
- Cuando tengamos un problema lo primero que debemos hacer es identificar los Objetos.

Las **Propiedades** también pueden llamarse atributos, que componen al objeto y estos también serán sustantivos. Algunos atributos o propiedades son nombre, tamaño, forma, estado, etc.

Los **Comportamientos** serán todas las operaciones que el objeto puede hacer, suelen ser verbos o sustantivos y verbo. Algunos ejemplos pueden ser que el usuario pueda hacer login y logout.

### Abstracción y Clases
#### Clase
Es el modelo sobre el cual se construirá nuestro objeto en pocas palabras es el molde del objeto. Al analizar el objeto, traemos todos sus atributos y entonces generamos modelos (Clases). Lo cual esto se llama la **abstracción** es cuando separamos los datos de un objeto para generar un molde.

### Modularidad
El diseño Modular viene de la arquitectura que significa subdivir un sistema en parte más pequeñas, se llamaran Modulos que funcionan de manera independiente. Esta relacionado al lema *Divide y vencerás*.
Los beneficios de utilizar la modularidad son los siguientes:
- Reutilizar código
- Evitar colapsos
- Hacer nuestro código más mantenible
- Legibilidad
- Resolución rápida de problemas

## Programación Orientada a Objetos. Análisis
### ¿Qué es la herencia?
#### DRY: Don't repeat yourself
- Promueve la reducción de duplicación en la programación
- Toda pieza de información nunca debe ser duplicada debido a que la duplicación incrementa la dificultad en los cambios y su evolución

La herencia nos permite crear nuevas clases a partir de otras, en pocas palabras al dectectar elementos duplicados realizaremos una abstracción para crear una clase general. Se estructura una jerarquía de **Padre** e **hijo(s)**.
[![Herencia>[![Herencia de clases](https://pbs.twimg.com/media/EsD8MA8XAAA4ppb?format=png&name=small "Herencia de clases")](https://platzi.com/comentario/2172174/ "Herencia de clases")
## Clases, Objetos y Método Constructor
### Objetos, método constructor y su sintaxis en código
El objeto es el resultado de lo que modelamos, es decir, al instanciar una clase, esto se convierte en un objeto. Por ejemplo:
Java

	Car car = new Car();
Javascript

	var car = new Car();
PHP

	$car = new Car();
Python

	car = Car()
Los metodos constructores dan un estado inicial al objeto y podemos añadirle parametros, lo cual seran los datos requeridos. Por ejemplo:
Java

	public Car(String license, Account driver){
		this.license = license;
		this.driver = driver;
	}
Javascript

	function Car(license, driver){
		this.id;
		this.license= license;
		this.driver = driver;
		this.passenger;
	}
PHP

	public function __constructor($license, $driver){
		$this->license = $license;
	}
Python

	def __init__(self, license, driver):
		self.license = license
		self.driver = driver

#### Las nuevas especificaciones del EcmaScript6, podemos declarar una clase
Se instancia de manera igual

	var car = new Car();
Mientras que el metodo constructor es diferente
	constructor(license, driver){
		this.id;
		this.license = license;
		this.driver = driver;
		this.passenger;
	}
