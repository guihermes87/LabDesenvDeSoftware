/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desenvsoftware.formcadastroaluno;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hermes
 */
public class Arquivo {
    
    private FileWriter arqW;
    private BufferedWriter escritor;
    
    private FileWriter arqR;
    private BufferedWriter leitor;
    
    private List<Aluno> listaAlunos;
    
    public String nomeArquivo;
    
    public Arquivo(String nomeArquivo){
        
        this.nomeArquivo = nomeArquivo;
        
        listaAlunos = new ArrayList<>();
        
        {
            
           }
    }
    
}
