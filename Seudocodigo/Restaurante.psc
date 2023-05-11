Algoritmo restaurante
	
	Definir opc Como Entero
	
	Escribir "Escoja una opción"
	Escribir "1. cliente"
	Escribir "2. Mesero"
	Leer  opc
	
	Segun opc Hacer
		1:
			Definir reserv Como Caracter
			Escribir "Estas son las mesas que tenemos disponibles."
			Escribir "mesa 5, mesa 2"
			Escribir "cual mesa deseas apartar"
			Leer reserv
			Si reserv = "mesa 5" o reserv = "mesa 2" Entonces
				Escribir "Se realizo la reserva de la "+reserv
			SiNo
				Escribir "Esa mesa ya esta reservada"
			Fin Si
		2:
			Escribir "Estas son las mesas reservadas"
			Escribir "mesa 1."
			escribir "mesa 3."
			Escribir "mesa 4."
		De Otro Modo:
			Escribir  "no perteneces al sistema"
	Fin Segun
	
FinAlgoritmo
