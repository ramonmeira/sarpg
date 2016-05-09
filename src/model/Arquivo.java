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
import com.itextpdf.text.Document;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.jfTelaPrincipal;

public class Arquivo { 
    static final String CAMINHO = "C:\\SARPG";
    
    public static String leitor(String operacao) throws IOException { 
        String caminho = CAMINHO+"\\"+operacao;
        return ler(caminho);
    }
    public static String ler(String caminho) throws IOException {         
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
    public static void escritor(String texto, String operacao) throws IOException{
        String caminho = CAMINHO+"\\"+operacao;
        escrever(texto, caminho);
    }
    
    public static void escrever(String texto, String caminho) throws IOException {         
        File diretorio = new File(CAMINHO); 
        if (!diretorio.exists()) {
           diretorio.mkdirs(); 
        }
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(caminho));   
        buffWrite.append(texto); 
        buffWrite.close(); 
    }
    
}
