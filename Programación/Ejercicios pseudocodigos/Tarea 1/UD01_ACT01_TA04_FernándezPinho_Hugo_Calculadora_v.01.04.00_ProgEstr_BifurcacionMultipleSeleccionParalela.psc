Algoritmo FernándezPinho_Hugo_Calculadora
	Escribir "La operacion 1 corresponde con una suma, la operacion 2 es resta, la operacion 3 es multiplicacion y la operacion 4 es division"
	Escribir "escribe primer numero"
		Leer  n
	Escribir "escribe segundo numero"
		Leer m
	Escribir "Operación 1,2,3,4"
		Leer Operacion
			Imprimir n
			Imprimir m
			Imprimir Operacion
			
			Segun Operacion
				Caso 1:
					Escribir n+m
				Caso 2:
					Escribir n-m
				Caso 3:
					Escribir n*m
				Caso 4:
					Escribir n/m
			FinSegun
			
	
	// Podemos ver que despues de introducir los dos numeros y seleccionar la operacion, el algoritmo nos muestra las 2 variables y la operacion seleccionada ademas de realizar la operacion que seleccionemos
FinAlgoritmo
