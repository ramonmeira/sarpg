/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import model.Arquivo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramon
 */

public class Personagem implements IObjeto{
    public static final String PASTA = "personagem"; 
    private String nome;
    private String tendencia;
    private int forca;
    private int destreza;
    private int contituicao;
    private int inteligencia;
    private int sabedoria;
    private int carisma;
    private int id;
    
    public Personagem(
                        String nome, 
                        String tendencia, 
                        int forca,
                        int destreza,
                        int contituicao,
                        int inteligencia,
                        int sabedoria,
                        int carisma
                    ){
        this.nome = nome; 
        this.tendencia = tendencia; 
        this.forca = forca;
        this.destreza = destreza;
        this.contituicao = contituicao;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;
    }

    public Personagem() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getTendencia() {
        return tendencia;
    }

    public void setTendencia(String Tendencia) {
        this.tendencia = Tendencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForça(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getContituicao() {
        return contituicao;
    }

    public void setContituicao(int contituicao) {
        this.contituicao = contituicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligência(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }       
    
    public String getPasta() {
        return PASTA;
    }
    
    @Override
    public String toString(){
        String retorno = "";
        retorno +=  nome+"§"+
                    tendencia+"§"+
                    forca+"§"+
                    destreza+"§"+
                    contituicao+"§"+
                    inteligencia+"§"+
                    sabedoria+"§"+
                    carisma+"¢";
        return retorno;
    }
           
    public static ArrayList<Personagem> toObjeto(String as_personagem){
        ArrayList<Personagem> todos = new ArrayList<>();        
        
        if(!as_personagem.equals("")){
            String linhas[] = as_personagem.split("¢");
            for(int i=0; i<linhas.length; i++){
                String partes[] = linhas[i].split("§");                
                Personagem p = new Personagem(
                                                partes[0],
                                                partes[1],
                                                Integer.parseInt(partes[2]),
                                                Integer.parseInt(partes[3]),
                                                Integer.parseInt(partes[4]),
                                                Integer.parseInt(partes[5]),
                                                Integer.parseInt(partes[6]),
                                                Integer.parseInt(partes[7]));
                todos.add(p);                
            }
        }        
        return todos;
    }
        
    public void GerarPDF(String NomeArq, int nivel){        
        Document doc = new Document();    
        if (!NomeArq.endsWith(".pdf")){
              NomeArq += ".pdf"; 
        }
        Font f_Texto = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL);
        Font f_Legenda = new Font(Font.FontFamily.HELVETICA, 8, Font.NORMAL);
        try{
            PdfWriter.getInstance(doc, new FileOutputStream(NomeArq));
            doc.open();
            PdfPTable table = new PdfPTable(24);    
            table.setWidthPercentage(110.0f);
            table.addCell(Cel(this.getNome(), 12,f_Texto));            
            table.addCell(Cel(" ", 12,f_Texto));
            table.addCell(Cel("Nome do Personagem", 12, f_Legenda));
            table.addCell(Cel("Nome do Jogador", 12, f_Legenda));
            table.addCell(Cel(nivel+"", 12,f_Texto));
            table.addCell(Cel(" ", 4,f_Texto));
            table.addCell(Cel(this.getTendencia(), 4,f_Texto));
            table.addCell(Cel("", 4,f_Texto));
            table.addCell(Cel("Classe e Nível", 12, f_Legenda));
            table.addCell(Cel("Raça", 4, f_Legenda));
            table.addCell(Cel("Tendência", 4, f_Legenda));
            table.addCell(Cel("Divindade", 4, f_Legenda));
            table.addCell(Cel(" ", 3,f_Texto));
            table.addCell(Cel(" ", 3,f_Texto));
            table.addCell(Cel(" ", 3,f_Texto));
            table.addCell(Cel(" ", 3,f_Texto));
            table.addCell(Cel(" ", 3,f_Texto));
            table.addCell(Cel(" ", 3,f_Texto));
            table.addCell(Cel(" ", 3,f_Texto));
            table.addCell(Cel(" ", 3,f_Texto));
            table.addCell(Cel("Tamanho", 3, f_Legenda));
            table.addCell(Cel("Idade", 3, f_Legenda));
            table.addCell(Cel("Sexo", 3, f_Legenda));
            table.addCell(Cel("Altura", 3, f_Legenda));
            table.addCell(Cel("Peso", 3, f_Legenda));
            table.addCell(Cel("Olhos", 3, f_Legenda));
            table.addCell(Cel("Cabelo", 3, f_Legenda));
            table.addCell(Cel("Pele", 3, f_Legenda));
            doc.add(table);         
        }catch(DocumentException de){
            de.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }finally{
            doc.close();
        }
    }
    
    public PdfPCell Cel(String texto, int coluna,Font f){
        PdfPCell c = new PdfPCell(new Paragraph(texto,f));
        c.setColspan(coluna);
        return c;
    }    
}
