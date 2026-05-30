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
    //Atributo utilizado para criar auto incremento do id
    private static int contador = 1; //Static = é um atributo para dizer que esse atributo é "compartilhado" para todos os objetos da classe
    
    //Atributos
    private int id;
    private Aluno aluno;
    private String disciplina;
    private float nota;
    
    //Construtores
    public Nota(){
        this.id = contador++;   //Ao instanciar um objeto o id recebe o valor 
    }                           //de contador e depois o cantador é incrementado para +1

    

    public Nota(Aluno aluno, String disciplina, float nota) {
        this.id = contador++;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.nota = nota;
    }

    //Getters e Setters
    //Getter (get) = pega o valor
    //Setter (set) = insere um valor
    
    /*
        Foi criado somente o get, pois nossa aplicação 
        não necessita o usuário por de forma manual o id, 
        pois criamos o auto incremento usando o static
    */ 
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
    
    //toString= retornar uma representação em texto de um objeto.
    @Override
    public String toString() {
        return "Nota{" + "id=" + id + ", aluno=" + aluno + ", disciplina=" + disciplina + ", nota=" + nota + '}';
    }
    
    /*
        Regras de negocio = são as regras que definem 
        como o sistema deve funcionar
    */
    public String retornaSituacao(){
        return nota >= 7 ? "Aprovado" : "Reprovado";
    }
}
