package franciscorp.rodneyJM.maratonajava.introducao.reviewPOO.classesAbstratas.domain;

public abstract class Funcionario {
    protected String nome;
    protected Integer idade;
    protected double salario;

    public Funcionario(String nome, Integer idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public abstract void calculaBonusSalario();
}

