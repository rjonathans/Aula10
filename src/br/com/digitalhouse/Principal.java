package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Curso android = new Curso("Mobile Android - mutio massa");
        Curso fullStack = new Curso("Web fullStack - muito massa tbm");
        Aluno rob = new Aluno(100,"Robson","Jonathan",android);
        Aluno vini = new Aluno(111,"Vinicius","Oliveira",fullStack);
        Aluno vinicio = new Aluno(101,"Vinicius","Oliveira",fullStack);
        Aluno matheus = new Aluno(102,"Matheus","Amaral",android);
        Aluno tairo = new Aluno(103,"Tairo","Roberto",fullStack);

        //Lista de alunos

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(vini);
        //alunos.add(vinicio);
        alunos.add(rob);
        alunos.add(matheus);
        alunos.add(tairo);


        System.out.println(
               // vini.equals(vinicio)
               // alunos.contains(vinicio)
                //vinicio
                alunos
        ); //resultado false








    }
}
