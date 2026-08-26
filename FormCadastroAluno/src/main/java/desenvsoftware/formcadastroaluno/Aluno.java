/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desenvsoftware.formcadastroaluno;

import java.util.Objects;

/**
 *
 * @author hermes
 */
public class Aluno {
    
    public String nome;
    public char sexo;
    public String dataNascimento;
    public String CPF;
    public String Matricula;
    public String endereco;
    public String curso;
    public String CEP;
    public String telefone;
    public String estado;

    public Aluno(String nome, char sexo, String dataNascimento, String CPF, String Matricula, String endereco, String curso, String CEP, String telefone, String estado) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.Matricula = Matricula;
        this.endereco = endereco;
        this.curso = curso;
        this.CEP = CEP;
        this.telefone = telefone;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    
    
    
    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + ", CPF=" + CPF + ", Matricula=" + Matricula + ", endereco=" + endereco + ", curso=" + curso + ", telefone=" + telefone + ", estado=" + estado + '}';
    }
    
    
    
    public Object[] obterDados(){
    
    return new Object[] {nome, sexo, dataNascimento, CPF, Matricula, endereco, curso, CEP, telefone, estado};
    
    }
    

}