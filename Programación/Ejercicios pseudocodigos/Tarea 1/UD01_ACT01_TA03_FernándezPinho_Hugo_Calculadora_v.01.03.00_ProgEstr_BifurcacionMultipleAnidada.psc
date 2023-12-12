Algoritmo FernándezPinho_Hugo_Calculadora
	Escribir "escribe primer numero"
		Leer  n
	Escribir "escribe segundo numero"
		Leer m
	Escribir "Operación suma,resta,multiplicacion,division"
		Leer Operacion
			Imprimir n
			Imprimir m
			Imprimir Operacion
	Si operacion="suma"
		Escribir n + m
		
				Sino Si operacion="restar"
						Escribir n - m
				
					Sino Si operacion="multiplicacion"
						Escribir n*m
					
						Sino Si operacion="division"
								
								Escribir n / m
								
							FinSi		
						FinSI	
					FinSi
	Finsi 
	// Podemos ver que despues de introducir los dos numeros y seleccionar la operacion, el algoritmo nos muestra las 2 variables y la operacion seleccionada ademas de realizar la operacion que seleccionemos
FinAlgoritmo
