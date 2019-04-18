package br.com.digitalhouse;

public class Aluno {

    private int registroAcademico;
    private String nome;
    private String sobrenome;
    private Curso curso;

    public Aluno() {
    }

    public Aluno(int registroAcademico, String nome, String sobrenome, Curso curso) {
        this.registroAcademico = registroAcademico;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.curso = curso;
    }

    public int getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object outroAluno) {

        if (!(outroAluno instanceof Aluno)) {
            return false;
        }

        if (((Aluno) outroAluno).getRegistroAcademico() == this.getRegistroAcademico() &&
                ((Aluno) outroAluno).getNome().equals(this.getNome())) {
            return true;
        }


        return false;
    }

    @Override
    public int hashCode() {
        return registroAcademico + nome.hashCode();
    }

    @Override
    public String toString() {
        return "ra: " + getRegistroAcademico() +
                "\nNome: " + getNome() +
                "\nSobrenome: " + "curso: " + getCurso().getNome();
    }
}
