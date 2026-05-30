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
    
    //Atributo utilizado para criar auto incremento do id
    private static int contador = 1; //Static = é um atributo para dizer que esse atributo é "compartilhado" para todos os objetos da classe
    
    //Atributos
    private int id;
    private String nome;
    private String turma;
    private LocalDate dataNasc;

    //Cosntrutores
    public Aluno() {
        this.id = contador++;   //Ao instanciar um objeto o id recebe o valor 
    }                           //de contador e depois o cantador é incrementado para +1

    public Aluno(String nome, String turma, LocalDate dataNasc) {
        this.id = contador++;
        this.nome = nome;
        this.turma = turma;
        this.dataNasc = dataNasc;
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

    //toString= retornar uma representação em texto de um objeto.
    @Override
    public String toString() {
        return  turma + " - " + nome;
    }
    
    /*
        Regras de negocio = são as regras que definem 
        como o sistema deve funcionar
    */
    public int retornaIdade(){ //Faz o calculo da data de nascimento menos a data atual retornando o valor(inteiro) em anos

            return Period.between(
                    dataNasc, LocalDate.now()).getYears();
        }
    }
