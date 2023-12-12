Algoritmo FernándezPinho_Hugo_Calculadora
	Escribir "escribe primer numero"
		Leer  n
	Escribir "escribe segundo numero"
		Leer m
	Escribir "Operación suma o resta"
		Leer Operacion
			Imprimir n
			Imprimir m
			Imprimir Operacion
		Si Operacion="suma"
			Escribir n + m
		Fin si
		Si Operacion="resta"
			Escribir n-m
		FinSi
	// Podemos ver que despues de introducir los dos numeros y seleccionar la operacion, el algoritmo nos muestra las 2 variables y la operacion seleccionada ademas de realizar la operacion que seleccionemos
FinAlgoritmo
