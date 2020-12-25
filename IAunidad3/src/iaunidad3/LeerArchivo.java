/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaunidad3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author WorLark
 */
public class LeerArchivo {
    private double[] grosor = new double[699];
    private double[] tamaño  = new double[699];
    private double[] forma  = new double[699];
    private double[] adhesión  = new double[699];
    private double[] epiteliales  = new double[699];
    private double[] nucleos  = new double[699];
    private double[] cromatina  = new double[699];
    private double[] nucleoli  = new double[699];
    private double[] mitosis  = new double[699];
    private double[] clase  = new double[699];

    public LeerArchivo(String nombreArchivo) throws FileNotFoundException {
        this.leerArchivo(nombreArchivo);
    }
    
    private void leerArchivo(String nombreArchivo) throws FileNotFoundException{
        try {
            Scanner archivo = new Scanner(new File(nombreArchivo));
            int contador = 0;
            while (archivo.hasNextLine()) {
                String lineaArchivo = archivo.nextLine();
                String[] arrayLineArchivo = lineaArchivo.split(",");
                this.grosor[contador] = Double.parseDouble(arrayLineArchivo[1]);
                this.tamaño[contador]  = Double.parseDouble(arrayLineArchivo[2]);
                this.forma[contador]  = Double.parseDouble(arrayLineArchivo[3]);
                this.adhesión[contador]  = Double.parseDouble(arrayLineArchivo[4]);
                this.epiteliales[contador]  = Double.parseDouble(arrayLineArchivo[5]);
                this.nucleos[contador]  = Double.parseDouble(arrayLineArchivo[6]);
                this.cromatina[contador]  = Double.parseDouble(arrayLineArchivo[7]);
                this.nucleoli[contador]  = Double.parseDouble(arrayLineArchivo[8]);
                this.mitosis[contador] = Double.parseDouble(arrayLineArchivo[9]);
                this.clase[contador]  = Double.parseDouble(arrayLineArchivo[10]);
                contador ++;
            }
        }
        catch(FileNotFoundException | NumberFormatException e) {
            System.out.println("Error Al leer el archivo");
        }
    }

    public double[] getGrosor() {
        return grosor;
    }

    public void setGrosor(double[] grosor) {
        this.grosor = grosor;
    }

    public double[] getTamaño() {
        return tamaño;
    }

    public void setTamaño(double[] tamaño) {
        this.tamaño = tamaño;
    }

    public double[] getForma() {
        return forma;
    }

    public void setForma(double[] forma) {
        this.forma = forma;
    }

    public double[] getAdhesión() {
        return adhesión;
    }

    public void setAdhesión(double[] adhesión) {
        this.adhesión = adhesión;
    }

    public double[] getEpiteliales() {
        return epiteliales;
    }

    public void setEpiteliales(double[] epiteliales) {
        this.epiteliales = epiteliales;
    }

    public double[] getNucleos() {
        return nucleos;
    }

    public void setNucleos(double[] nucleos) {
        this.nucleos = nucleos;
    }

    public double[] getCromatina() {
        return cromatina;
    }

    public void setCromatina(double[] cromatina) {
        this.cromatina = cromatina;
    }

    public double[] getNucleoli() {
        return nucleoli;
    }

    public void setNucleoli(double[] nucleoli) {
        this.nucleoli = nucleoli;
    }

    public double[] getMitosis() {
        return mitosis;
    }

    public void setMitosis(double[] mitosis) {
        this.mitosis = mitosis;
    }

    public double[] getClase() {
        return clase;
    }

    public void setClase(double[] clase) {
        this.clase = clase;
    }
    
    
}
