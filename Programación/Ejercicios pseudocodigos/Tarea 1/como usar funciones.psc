Funcion sum <- sumar( x Por Referencia, z Por Referencia)
	sum <- x+z
	x <- x+1
	z <- z-1
FinFuncion

Algoritmo Suma
	Leer a
	Leer b
	Resultado <- sumar(a,b)
	Escribir Resultado
	Escribir a
	Escribir b
FinAlgoritmo
