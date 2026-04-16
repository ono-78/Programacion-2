
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

    def juega(self):
        self.reiniciaPartida()

        # Genera número aleatorio entre 0 y 10
        self.numeroAdivinar = random.randint(0, 10)

        print("Adivina un número entre el 0 y el 10.")

        while True:
            try:
                intento = int(input("Introduce un número: "))

                if 0 <= intento <= 10:
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
                else:
                    print("El número debe estar entre 0 y 10.")

            except ValueError:
                print("Por favor ingresa un número entero válido.")


# ====================== APLICACIÓN (main) ======================
if __name__ == "__main__":
    print("=== Juego 1: Adivina el Número ===\n")
    juego = JuegoAdivinaNumero(3)
    juego.juega() 
