/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.BufferedReader; 
import java.io.BufferedWriter; 
import java.io.File;
import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.ArrayList;
import controller.Campanha;
import controller.Sistema;
import java.util.logging.Level;
import java.util.logging.Logger;
import controller.IObjeto;

public class Arquivo { 
    static final String CAMINHO = "C:\\SARPG";
    
    public static String ler(String operacao) throws IOException {     
        String caminho = CAMINHO+"\\"+operacao;
        File diretorio = new File(caminho);
        if (diretorio.exists()) {
            BufferedReader buffRead = new BufferedReader(new FileReader(caminho)); 
            String linha = "", retorno = ""; 
            while (true) { 
                if (linha != null) { 
                    retorno += linha; 
                } 
                else 
                    break; 
                linha = buffRead.readLine(); 
            } 
            buffRead.close(); 
            return retorno;
        }
        return "";
    } 
    
    public static void escrever(ArrayList<IObjeto> o) throws IOException {    
        String caminho = CAMINHO+"\\"+o.get(0).getPasta();
        File diretorio = new File(CAMINHO); 
        if (!diretorio.exists()) {
           diretorio.mkdirs(); 
        }
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(caminho));  
        for(IObjeto io: o){
            buffWrite.append(io.toString()); 
        }
        
        buffWrite.close(); 
    }
    
    /**
     * Recebe um "texto" para ser escrito na "pasta" dentro do diretorio padrão
     * @param texto
     * @param pasta
     * @throws IOException
     */
    public static void escrever(String pasta, String texto) throws IOException {    
        String caminho = CAMINHO+"\\"+pasta;
        exportar(texto, caminho);
    }
    
    /**
     * Exporta o "texto" para um diretorio dado por um "caminho"
     * @param texto
     * @param caminho
     * @throws IOException
     */
    public static void exportar(String texto, String caminho) throws IOException {    
        File diretorio = new File(CAMINHO); 
        if (!diretorio.exists()) {
           diretorio.mkdirs(); 
        }
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(caminho));   
        buffWrite.append(texto); 
        
        buffWrite.close(); 
    }
    
    public static void escreverCasoNaoTenha(String texto, String operacao) throws IOException {   
        if(ler(operacao).equals("")) 
            escreverApagando(texto, operacao);
        else
            return;
    }      
    
    public static void escreverApagando(String texto, String operacao) throws IOException {         
        String caminho = CAMINHO+"\\"+operacao;
        File diretorio = new File(CAMINHO); 
        if (!diretorio.exists()) {
           diretorio.mkdirs(); 
        }
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(caminho));   
        buffWrite.append(texto); 
        buffWrite.close(); 
    }
    
    public static void atualizar(ArrayList<IObjeto> o){
        if(o == null || o.isEmpty()) return;        
        try {
            Arquivo.limpar(o.get(0).getPasta());
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
                Arquivo.escrever(o);
        } catch (IOException ex) {
            Logger.getLogger(Campanha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<IObjeto> carregarDoArquivo(Sistema.EnumObjeto ob){
        String s = "";
        try {
            s = Arquivo.ler(ob.getValor());
        } catch (IOException ex) {
            Logger.getLogger(Campanha.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(s.equals("")) return null;
                
        return ob.toObjeto(s);
    }

    public static void limpar(String operacao) throws IOException {
        Arquivo.escreverApagando("", operacao);
    }
    
}
