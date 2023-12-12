Algoritmo FernándezPinho_Hugo_Calculadora
	Escribir "La operacion 1 corresponde con una suma, la operacion 2 es resta, la operacion 3 es multiplicacion y la operacion 4 es division"
	Escribir "escribe primer numero"
		Leer  num1
	Escribir "escribe segundo numero"
		Leer num2
	Escribir "Operación 1,2,3,4"
		Leer Operacion
			Imprimir num1
			Imprimir num2
			Imprimir Operacion
			
			Segun Operacion
				Caso 1:
					Escribir num1+num2
					
				Caso 2:
					Escribir num1-num2
					
				Caso 3:
					resultado<-0
					Para n<- 1 Hasta num2 Con Paso 1 Hacer
						resultado<- resultado + num1
					Fin Para
					Imprimir Resultado
					Caso 4:
						Resultado=0
						Mientras num1>=num2 Hacer 
							resultado = resultado+1
							num1<- num1 - num2
						Fin Mientras
							resto<- num1
							Imprimir Resultado
							Imprimir resto
					
			FinSegun
			
			
			
			
			
			// Podemos ver que despues de introducir los dos numeros y seleccionar la operacion, el algoritmo nos muestra las 2 variables y la operacion seleccionada ademas de realizar la operacion que seleccionemos
FinAlgoritmo
