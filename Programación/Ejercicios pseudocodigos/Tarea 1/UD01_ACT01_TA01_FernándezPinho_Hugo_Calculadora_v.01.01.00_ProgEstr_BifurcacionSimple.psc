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
	FinSi
	Si Operacion  <> "suma"
		Escribir "La operacion no puede completarse"
	FinSi
	// Podemos ver que despues de introducir los dos numeros y seleccionar la operacion, el algoritmo nos muestra las 2 variables y nos suma en caso de seleccionar suma si no nos mostrara un mensaje de que la operacion no se completo
FinAlgoritmo
