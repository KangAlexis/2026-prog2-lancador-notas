/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lancadornotas.model;

/**
 *
 * @author alexisdanielkang
 */
public class Nota {
    
    private static int contador = 1;
    private int id;
    private Aluno aluno;
    private String disciplina;
    private float nota;
    
    public Nota(){
        this.id = contador++;
    }

    public Nota(Aluno aluno, String disciplina, float nota) {
        this.id = contador++;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nota{" + "id=" + id + ", aluno=" + aluno + ", disciplina=" + disciplina + ", nota=" + nota + '}';
    }
    
    public String retornaSituacao(){
        return nota >= 7 ? "Aprovado" : "Reprovado";
    }
}
