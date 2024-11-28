// Abstract class Animal
abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom();
}

// Class Mamifero
class Mamifero extends Animal {
    protected String corPelo;

    public Mamifero(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }
}

// Class Ave
class Ave extends Animal {
    protected double tamanhoAsa;

    public Ave(String nome, int idade, double tamanhoAsa) {
        super(nome, idade);
        this.tamanhoAsa = tamanhoAsa;
    }
}

// Interface Nadador
interface Nadador {
    void nadando();
}

// Interface Voador
interface Voador {
    void voando();
}

// Class Elefante
class Elefante extends Mamifero {
    public Elefante(String nome, int idade, String corPelo) {
        super(nome, idade, corPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Elefante faz: Tromba!");
    }
}

// Class Tigre
class Tigre extends Mamifero {
    public Tigre(String nome, int idade, String corPelo) {
        super(nome, idade, corPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Tigre faz: Rugido!");
    }
}

// Class Pinguim
class Pinguim extends Ave implements Nadador {
    public Pinguim(String nome, int idade, double tamanhoAsa) {
        super(nome, idade, tamanhoAsa);
    }

    @Override
    public void emitirSom() {
        System.out.println("Pinguim faz: Grasnido!");
    }

    @Override
    public void nadando() {
        System.out.println("Pinguim está nadando!");
    }
}

// Class Aguia
class Aguia extends Ave implements Voador {
    public Aguia(String nome, int idade, double tamanhoAsa) {
        super(nome, idade, tamanhoAsa);
    }

    @Override
    public void emitirSom() {
        System.out.println("Águia faz: Pio!");
    }

    @Override
    public void voando() {
        System.out.println("Águia está voando!");
    }
}

// Main class to test the system
public class Zoo {
    public static void main(String[] args) {
        Elefante elefante = new Elefante("Dumbo", 10, "Cinza");
        Tigre tigre = new Tigre("Shere Khan", 5, "Laranja");
        Pinguim pinguim = new Pinguim("Pingu", 3, 0.5);
        Aguia aguia = new Aguia("Falcão", 4, 2.0);

        elefante.emitirSom();
        tigre.emitirSom();
        pinguim.emitirSom();
        pinguim.nadando();
        aguia.emitirSom();
        aguia.voando();
    }
}