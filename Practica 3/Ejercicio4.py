

class Juego:
    def __init__(self, vidas):
        self.numeroDeVidas = vidas
        self.record = 0
        self.vidas_iniciales = vidas

    def reiniciaPartida(self):
        self.numeroDeVidas = self.vidas_iniciales

    def actualizaRecord(self):
        if self.numeroDeVidas > self.record:
            self.record = self.numeroDeVidas

    def quitaVida(self):
        self.numeroDeVidas -= 1
        return self.numeroDeVidas > 0


class JuegoAdivinaNumero(Juego):
    def __init__(self, vidas):
        super().__init__(vidas)

    def validaNumero(self, numero):
        return 0 <= numero <= 10

    def juega(self):
        self.reiniciaPartida()

        # Genera número que cumpla la validación de la clase actual
        while True:
            self.numeroAdivinar = random.randint(0, 10)
            if self.validaNumero(self.numeroAdivinar):
                break

        print("Adivina un número entre el 0 y el 10.")

        while True:
            try:
                intento = int(input("Introduce un número: "))

                if self.validaNumero(intento):
                    if intento == self.numeroAdivinar:
                        print("¡Acertaste!!")
                        self.actualizaRecord()
                        break
                    else:
                        tieneMasVidas = self.quitaVida()
                        if not tieneMasVidas:
                            print("Ya no te quedan más vidas.")
                            break
                        else:
                            pista = "mayor" if intento < self.numeroAdivinar else "menor"
                            print(f"El número es {pista}")
                            print(f"Te quedan {self.numeroDeVidas} vidas. Inténtalo de nuevo.")
                # Si no es válido, las subclases ya imprimieron su mensaje de error

            except ValueError:
                print("Por favor ingresa un número entero válido.")


class JuegoAdivinaPar(JuegoAdivinaNumero):
    def validaNumero(self, numero):
        if 0 <= numero <= 10 and numero % 2 == 0:
            return True
        elif 0 <= numero <= 10 and numero % 2 != 0:
            print("Error: el número es impar. Debe ser par.")
            return False
        else:
            return False


class JuegoAdivinaImpar(JuegoAdivinaNumero):
    def validaNumero(self, numero):
        if 0 <= numero <= 10 and numero % 2 != 0:
            return True
        elif 0 <= numero <= 10 and numero % 2 == 0:
            print("Error: el número es par. Debe ser impar.")
            return False
        else:
            return False


#  APLICACIÓN (main) 
if __name__ == "__main__":
    print("=== Juego 2: Tres versiones del juego ===\n")
    
    print("--- Juego Adivina Número Normal ---")
    juego_normal = JuegoAdivinaNumero(3)
    juego_normal.juega()

    print("\n--- Juego Adivina Número Par ---")
    juego_par = JuegoAdivinaPar(3)
    juego_par.juega()

    print("\n--- Juego Adivina Número Impar ---")
    juego_impar = JuegoAdivinaImpar(3)
    juego_impar.juega() 
