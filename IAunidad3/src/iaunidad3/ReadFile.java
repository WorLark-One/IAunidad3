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
public class ReadFile {
    private double[] clumpThickness = new double[699];
    private double[] uniformityOfCellSize  = new double[699];
    private double[] uniformityOfCellShape  = new double[699];
    private double[] marginalAdhesion  = new double[699];
    private double[] singleEpithelialCellSize  = new double[699];
    private double[] bareNuclei  = new double[699];
    private double[] blandChromatin  = new double[699];
    private double[] normalNucleoli  = new double[699];
    private double[] mitoses  = new double[699];
    private double[] classes  = new double[699];

    public ReadFile(String nameFile) throws FileNotFoundException {
        this.readFile(nameFile);
    }
    
    private void readFile(String nameFile) throws FileNotFoundException{
        try {
            Scanner file = new Scanner(new File(nameFile));
            int counter = 0;
            while (file.hasNextLine()) {
                String lineFile = file.nextLine();
                String[] arrayLineFile = lineFile.split(",");
                this.clumpThickness[counter] = Double.parseDouble(arrayLineFile[1]);
                this.uniformityOfCellSize[counter]  = Double.parseDouble(arrayLineFile[2]);
                this.uniformityOfCellShape[counter]  = Double.parseDouble(arrayLineFile[3]);
                this.marginalAdhesion[counter]  = Double.parseDouble(arrayLineFile[4]);
                this.singleEpithelialCellSize[counter]  = Double.parseDouble(arrayLineFile[5]);
                this.bareNuclei[counter]  = Double.parseDouble(arrayLineFile[6]);
                this.blandChromatin[counter]  = Double.parseDouble(arrayLineFile[7]);
                this.normalNucleoli[counter]  = Double.parseDouble(arrayLineFile[8]);
                this.mitoses[counter] = Double.parseDouble(arrayLineFile[9]);
                this.classes[counter]  = Double.parseDouble(arrayLineFile[10]);
                counter ++;
            }
        }
        catch(FileNotFoundException | NumberFormatException e) {
            System.out.println("Error reading from file");
        }
    }

    public double[] getClumpThickness() {
        return clumpThickness;
    }

    public void setClumpThickness(double[] clumpThickness) {
        this.clumpThickness = clumpThickness;
    }

    public double[] getUniformityOfCellSize() {
        return uniformityOfCellSize;
    }

    public void setUniformityOfCellSize(double[] uniformityOfCellSize) {
        this.uniformityOfCellSize = uniformityOfCellSize;
    }

    public double[] getUniformityOfCellShape() {
        return uniformityOfCellShape;
    }

    public void setUniformityOfCellShape(double[] uniformityOfCellShape) {
        this.uniformityOfCellShape = uniformityOfCellShape;
    }

    public double[] getMarginalAdhesion() {
        return marginalAdhesion;
    }

    public void setMarginalAdhesion(double[] marginalAdhesion) {
        this.marginalAdhesion = marginalAdhesion;
    }

    public double[] getSingleEpithelialCellSize() {
        return singleEpithelialCellSize;
    }

    public void setSingleEpithelialCellSize(double[] singleEpithelialCellSize) {
        this.singleEpithelialCellSize = singleEpithelialCellSize;
    }

    public double[] getBareNuclei() {
        return bareNuclei;
    }

    public void setBareNuclei(double[] bareNuclei) {
        this.bareNuclei = bareNuclei;
    }

    public double[] getBlandChromatin() {
        return blandChromatin;
    }

    public void setBlandChromatin(double[] blandChromatin) {
        this.blandChromatin = blandChromatin;
    }

    public double[] getNormalNucleoli() {
        return normalNucleoli;
    }

    public void setNormalNucleoli(double[] normalNucleoli) {
        this.normalNucleoli = normalNucleoli;
    }

    public double[] getMitoses() {
        return mitoses;
    }

    public void setMitoses(double[] mitoses) {
        this.mitoses = mitoses;
    }

    public double[] getClasses() {
        return classes;
    }

    public void setClasses(double[] classes) {
        this.classes = classes;
    }

}
