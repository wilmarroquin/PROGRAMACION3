#Libreria para genenerar numeros random
import random
import main

#Funcion para crear el archivo genarar los numeros
def genarar_numeros(archivo, cantidad):
    with open(archivo, 'w') as file:
        for _ in range(cantidad):
            numero = random.randint(-5000000, 50000000)
            file.write(f"{numero}\n")

#Funcion agregar los numeros del archivo a estructura set
def cargar_numeros(archivo):
    numeros = set()
    with open(archivo, 'r') as file:
        for line in file:
            numeros.add(int(line.strip()))
    return numeros

#Funcion para buscar numero dentro del archivo
def busqueda(numeros_set, numero):
    if numero in numeros_set:
        return f"El número {numero} está en listado de numeros."
    else:
        return f"El número {numero} no está en listado de numeros."
    
