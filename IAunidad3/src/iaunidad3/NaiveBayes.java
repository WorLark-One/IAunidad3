/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaunidad3;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author PinkyStyle
 */
public class NaiveBayes {

    private ReadFile reader;
    private ArrayList<FrequencyTable> tables;

    public NaiveBayes() throws FileNotFoundException {
        this.reader = new ReadFile("breast-cancer-wisconsin.data");
        this.tables = new ArrayList<>();
    }

    public void createTables(){
        FrequencyTable clumpThickness = new FrequencyTable("Clump Thickness", this.reader.getClumpThickness(), this.reader.getClasses());
        FrequencyTable uniformityOfCellSize  = new FrequencyTable("Uniformity of Cell Size", this.reader.getUniformityOfCellSize(), this.reader.getClasses());
        FrequencyTable uniformityOfCellShape  = new FrequencyTable("Uniformity of Cell Shape", this.reader.getUniformityOfCellShape(), this.reader.getClasses());
        FrequencyTable marginalAdhesion  = new FrequencyTable("Marginal Adhesion", this.reader.getMarginalAdhesion(), this.reader.getClasses());
        FrequencyTable singleEpithelialCellSize  = new FrequencyTable("Single Eputhelial Cell Size", this.reader.getSingleEpithelialCellSize(), this.reader.getClasses());
        FrequencyTable bareNuclei = new FrequencyTable("Bare Nuclei", this.reader.getBareNuclei(), this.reader.getClasses());
        FrequencyTable blandChromatin  = new FrequencyTable("Bland Chromatin", this.reader.getBlandChromatin(), this.reader.getClasses());
        FrequencyTable normalNucleoli  = new FrequencyTable("Normal Nucleoli", this.reader.getNormalNucleoli(), this.reader.getClasses());
        FrequencyTable mitoses = new FrequencyTable("Mitoses", this.reader.getMitoses(), this.reader.getClasses());

        this.tables.add(clumpThickness);
        this.tables.add(uniformityOfCellSize);
        this.tables.add(uniformityOfCellShape);
        this.tables.add(marginalAdhesion);
        this.tables.add(singleEpithelialCellSize);
        this.tables.add(bareNuclei);
        this.tables.add(blandChromatin);
        this.tables.add(normalNucleoli);
        this.tables.add(mitoses);
    }

    public double calculateProbability(int[] newData){
        double result = 0;
        for(int i = 0; i < this.tables.size(); i++){
            double x = this.tables.get(i).getProbability(newData[i])/9;  
            result +=x;
            System.out.println(x);
        }
        return result;
    }

    public ReadFile getReader() {
        return reader;
    }

    public void setReader(ReadFile reader) {
        this.reader = reader;
    }

    public ArrayList<FrequencyTable> getTables() {
        return tables;
    }

    public void setTables(ArrayList<FrequencyTable> tables) {
        this.tables = tables;
    }
    
    


}
