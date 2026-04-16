# 🔹 CLASE BASE
class CriaturaMarina:
    def __init__(self, nombre="sin nombre"):
        self.nombre = nombre

    def metodo1(self):
        print("criatura 1")

    def metodo2(self):
        print("criatura 2")

    def __str__(self):
        return "habita en el oceano: " + self.nombre


# 🔹 MAMIFERO
class Mamifero(CriaturaMarina):
    def __init__(self, nombre):
        super().__init__(nombre)

    def metodo1(self):
        print("sangre caliente")


# 🔹 DELFIN
class Delfin(Mamifero):
    def __init__(self, nombre):
        super().__init__(nombre)

    def metodo1(self):
        print("sopla burbujas")
        super().metodo1()  # inciso c

    def __str__(self):
        return "delfin: " + self.nombre


# 🔹 CALAMAR
class Calamar(CriaturaMarina):
    def __init__(self, nombre):
        super().__init__(nombre)

    def metodo2(self):
        print("tentaculos")

    def __str__(self):
        return "calamar: " + self.nombre


# 🔹 BALLENA
class Ballena(Mamifero):
    def __init__(self, nombre):
        super().__init__(nombre)

    def metodo1(self):
        print("canta canciones")

    def nadar(self):
        print("nada profundamente")

    def __str__(self):
        return "ballena: " + self.nombre


# 🔹 MAIN
if __name__ == "__main__":

    print(" INCISO a ")
    elementos = [
        Calamar("Calamardo"),
        Delfin("Flipper"),
        Mamifero("MamiferoX"),
        Ballena("Moby"),
        CriaturaMarina("General")
    ]

    for i in range(len(elementos)):
        elementos[i].metodo2()
        print(elementos[i])
        elementos[i].metodo1()
        print()

    print(" INCISO b ")
    b = Ballena("Azul")
    print(b)
    b.metodo1()
    b.nadar()

    print(" INCISO c ")
    d = Delfin("Flipper")
    d.metodo1()

    print(" INCISO d ")
    cm = CriaturaMarina("Nemo")
    print(cm)

    print(" INCISO e ")
    print("Todos los objetos con nombre:")
    for obj in elementos:
        print(obj)
