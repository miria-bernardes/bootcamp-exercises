package com.bootcamp.exercises.classtwo.classmanagement;

public class Main {
    public static void main(String[] args) {
        Estudante estudantes  [] = { new Estudante("Miria Bernardes", 25, 1223, 8),
                                     new Estudante("Kaleb Bernardes", 21, 1224, 8),
                                     new Estudante("Ismael Bernardes", 23, 1225, 8) };

        Disciplina disciplinas [] =
                {new Disciplina("Portugues", 40), new Disciplina("Matemática", 40), new Disciplina("Ingles", 40)};

        Turma turma = new Turma();
        turma.setSerie(8);
        turma.setIdentificador("c");
        turma.setEstudantes(estudantes);
        turma.setDisciplinas(disciplinas);


    }
}
