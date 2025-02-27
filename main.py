import Examen

def main():
    #Variables utilizadas en las funciones
    archivo = "Numeros_aleatorios.txt"
    cantidad = 10000000

    print("Generando números...")
    Examen.genarar_numeros(archivo, cantidad)
    print(f"{cantidad} números generados y guardados en {archivo}.")

    print("Cargando números para realizar busquedas")
    numeros_set = Examen.cargar_numeros(archivo)
    print(f"{len(numeros_set)} Numeros cargados a estructura set")

    # Realizar búsqueda
    while True:
        try:
            numero = int(input("Introduce un número para buscar en el archivo: "))
            print(Examen.busqueda(numeros_set, numero))
            respuesta = input("¿Quieres seguir buscando? (sí/no): ").strip().lower()
            if respuesta == "no":
                break
            elif respuesta != "sí":
                print("")
        except ValueError:
            print("Por favor, introduce un número válido.")

if __name__ == "__main__":
    main()
