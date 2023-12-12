Algoritmo Paquetes
	Escribir "Introducir peso en gramos"
	Leer peso
	Escribir "Introducir zona"
	Leer zona
	Si peso >=0.1 Entonces
		Escribir "El paquete sera admitido"
		
			Si zona=1
				Escribir "El precio del envio será " peso*11 " dolares"
					FinSi
				Si zona=2
					Escribir "El precio del envio será " peso*10 " dolares"
						FinSi
					Si zona=3
						Escribir "El precio del envio será " peso*12 " dolares"
							FinSi
						Si zona=4
							Escribir "El precio del envio será " peso*24 " dolares"
								FinSi
							Si zona=5
								Escribir "El precio del envio será " peso*27 " dolares"
									FinSi
							
	Sino Si peso <=0 Entonces
		Escribir "El paquete no puede pesar menos de 0 ni ser igual a este"
	Sino Si peso >5000 Entonces
		Escribir "El Paquete excede el peso maximo"
			
	FinSi
		FinSi	
			FinSi
FinAlgoritmo
