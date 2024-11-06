package questao02;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) throws InvalidAgeException {
        if (idade <= 0 || idade < 18) {
            throw new InvalidAgeException("Não foi possível cadastrar, a idade deve ser maior que 18 anos.");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
