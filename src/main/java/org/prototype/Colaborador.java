package org.prototype;

public class Colaborador implements Cloneable {
    private int personNumber;
    private String nome;
    private String funcao;

    public Colaborador(int personNumber, String nome, String funcao) {
        this.personNumber = personNumber;
        this.nome = nome;
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getId() {
        return personNumber;
    }

    public void setId(int personNumber) {
        this.personNumber = personNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "personNumber=" + personNumber +
                ", nome='" + nome +
                ", funcao='" + funcao + '\'' +
                '}';
    }
}