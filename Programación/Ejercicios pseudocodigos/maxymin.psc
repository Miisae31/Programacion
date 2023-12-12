Algoritmo Mayores
		
		// primero se declara un arreglo de 200 elementos
		Dimension numeros[10]
		
		// luego se pide al usuario ingresar la cantidad de datos, 
		// que no debera ser mayor a 200
		Escribir "Ingrese la cantidad de datos (10):"
		Leer n
	
		Para i<-1 Hasta n Hacer
			Escribir "Ingrese el dato ",i,":"
			Leer numeros[i]
		FinPara
		posicionMay<-0
		PosicionMen<-0
		
		Si numeros[1]>numeros[2] Entonces
			may<-numeros[1]
			men<-numeros[2]
			posicionMay<-1
			posicionMen<-2
		SiNo
			may<-numeros[2]
			men<-numeros[1]
			posicionMay<-2
			posicionMen<-1
		FinSi
		
		Para i<-3 Hasta n Hacer
			Si numeros[i]>may Entonces 
				may<-numeros[i] 
				posicionMay<- i 
			SiNo
				Si numeros[i]<men Entonces 
					men<-numeros[i]
					posicionMen <- i 
				FinSi
			FinSi
		FinPara
		
		
		Escribir "El mayor es: ",may ," y se encuentra en la " ,posicionMay "º"
		Escribir "El minimo es ",men ," y se encuentra en la " ,posicionMen "º"
	
FinAlgoritmo
