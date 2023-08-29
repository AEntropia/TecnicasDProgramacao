/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa mae, pai;
    private List<Pessoa> filhos = new ArrayList<>();
    private List<Pessoa> irmaos = new ArrayList<>();

    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, int idade) {
        this(nome);
        this.idade = idade;
    }
    public Pessoa(String nome, int idade, Pessoa mae){
        this(nome, idade);
        setMae(mae);
        setIrmaos();
        refreshIrmaos();
    }
    public Pessoa(String nome, int idade, Pessoa mae, Pessoa pai){
        this(nome, idade, mae);
        setPai(pai);
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setMae(Pessoa mae){
        this.mae = mae;
        mae.setFilhos(this);
    }
    public void setPai(Pessoa pai){
        this.pai = pai;
        pai.setFilhos(this);
    }
    public void setFilhos(Pessoa filho){
        filhos.add(filho);
    }
    public void setIrmaos(){
        for(int i = 0; i < mae.filhos.size(); i++){
            if(this.nome != mae.filhos.get(i).nome){
                this.irmaos.add(mae.filhos.get(i));
            }
        }
    }
    public void refreshIrmaos(){
        for(int i = 0; i < irmaos.size(); i++){
            irmaos.get(i).setIrmaos();
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public Pessoa getMae(){
        return this.mae;
    }
    public Pessoa getPai(){
        return this.pai;
    }
    public List getFilhos(){
        return mae.filhos;
    }
    
    
    public String nomeFilhos(){
        String mensagem = "Os filhos de "  + nome + " são: ";
        for(int i = 0; i<filhos.size(); i++){
            mensagem += filhos.get(i).nome;
            if(i != filhos.size()-1){
                mensagem += ", ";
            }
            else{
                mensagem += ".";
            }
        }
        return mensagem;
    }
    public String nomeIrmaos(){
        String mensagem = "Os irmãos de "  + nome + " são: ";
        for(int i = 0; i<irmaos.size(); i++){
            mensagem += irmaos.get(i).nome;
            if(i != irmaos.size()-1){
                mensagem += ", ";
            }
            else{
                mensagem += ".";
            }
        }
        return mensagem;
    }
    public int qtdFilhos(){
        return this.filhos.size();
    }
    public int qtdIrmaos(){
        return this.irmaos.size();
    }
}
