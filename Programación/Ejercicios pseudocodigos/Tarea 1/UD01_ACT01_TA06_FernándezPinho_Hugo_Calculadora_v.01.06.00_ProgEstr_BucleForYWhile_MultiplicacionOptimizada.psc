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
					a=num1 
					b=num2 
					Si num1<num2 Entonces
						b<-num1
						a<-num2
					FinSi
					resultado<-0
					Para n<- 1 Hasta b Con Paso 1 Hacer
						resultado<- resultado + a
				Fin Para
					Imprimir Resultado
				Caso 4:
							Si num1=0 Entonces
								Escribir "La operacion no se pudo completar"
							FinSi
							
								Si num2=0 Entonces
									Escribir "La operacion no se pudo realizar"
								FinSi
					a=num1 
					b=num2 
					Si num1<num2 Entonces
						
						
						b<-num1
						a<-num2
					FinSi
					Resultado=0
					Mientras a>=b Hacer 
						resultado = resultado+1
						a<- a - b
					Fin Mientras
						
						Imprimir resultado
		FinSegun
			// Podemos ver que despues de introducir los dos numeros y seleccionar la operacion, el algoritmo nos muestra las 2 variables y la operacion seleccionada ademas de realizar la operacion que seleccionemos
FinAlgoritmo
