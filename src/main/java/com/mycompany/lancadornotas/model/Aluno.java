/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lancadornotas.model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author alexisdanielkang
 */
public class Aluno {
    
    private static int contador = 1;
    private int id;
    private String nome;
    private String turma;
    private LocalDate dataNasc;

    public Aluno() {
        this.id = contador++;
    }

    public Aluno(String nome, String turma, LocalDate dataNasc) {
        this.id = contador++;
        this.nome = nome;
        this.turma = turma;
        this.dataNasc = dataNasc;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return  turma + " - " + nome;
    }
    
    public int retornaIdade(){
        
        return Period.between(
                dataNasc, LocalDate.now()).getYears();
    }
}
