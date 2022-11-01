package org.prototype;

public class Cracha implements Cloneable {
    private Integer id;
    private Integer atribuicao;
    private String nome;

    private Colaborador colaborador;

    public Cracha(Integer id, Integer atribuicao, String nome, Colaborador colaborador) {
        super();
        this.id = id;
        this.atribuicao = atribuicao;
        this.nome = nome;
        this.colaborador = colaborador;
    }

    public Integer getId() {
        return id;
    }

    public void setAtribuicao(Integer atribuicao) {
        this.atribuicao = atribuicao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Cracha setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getAtribuicao() {
        return atribuicao;
    }


    public String getNome() {
        return nome;
    }


    public Colaborador getColaborador() {
        return colaborador;
    }


    @Override
    public Cracha clone() throws CloneNotSupportedException {
        Cracha cracha = (Cracha) super.clone();
        return cracha;
    }

    @Override
    public String toString() {
        return "Cracha{" +
                "id=" + id +
                ", atribuicao=" + atribuicao +
                ", nome='" + nome + '\'' +
                ", colaborador=" + colaborador +
                '}';
    }
}
