/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaunidad3;


/**
 *
 * @author PinkyStyle
 */
public class FrequencyTable {

    private String name;
    private int[] positiveValues;
    private int[] negativeValues;
    private int total;

    public FrequencyTable(String name, double[] data, double[] cases){
        this.name = name;
        this.positiveValues = new int[10];
        this.negativeValues = new int[10];
        this.total = 0;
        populateTable(data,cases);
    }

    public double getProbability(int value){
        return 0;
    }

    public void populateTable(double[] data, double[] cases){
        for( int i = 0; i < data.length; i++){
            switch( (int)data[i]){
                case 1:
                    if(cases[i] == 4){
                        this.negativeValues[0]+=1;
                    }
                    else{
                        this.positiveValues[0]+=1;
                    }
                    break;
                case 2:
                    if(cases[i] == 4){
                        this.negativeValues[1]+=1;
                    }
                    else{
                        this.positiveValues[1]+=1;
                    }
                    break;
                case 3:
                    if(cases[i] == 4){
                        this.negativeValues[2]+=1;
                    }
                    else{
                        this.positiveValues[2]+=1;
                    }
                    break;
                case 4:
                    if(cases[i] == 4){
                        this.negativeValues[3]+=1;
                    }
                    else{
                        this.positiveValues[3]+=1;
                    }
                    break;
                case 5:
                    if(cases[i] == 4){
                        this.negativeValues[4]+=1;
                    }
                    else{
                        this.positiveValues[4]+=1;
                    }
                    break;
                case 6:
                    if(cases[i] == 4){
                        this.negativeValues[5]+=1;
                    }
                    else{
                        this.positiveValues[5]+=1;
                    }
                    break;
                case 7:
                    if(cases[i] == 4){
                        this.negativeValues[6]+=1;
                    }
                    else{
                        this.positiveValues[6]+=1;
                    }
                    break;
                case 8:
                    if(cases[i] == 4){
                        this.negativeValues[7]+=1;
                    }
                    else{
                        this.positiveValues[7]+=1;
                    }
                    break;
                case 9:
                    if(cases[i] == 4){
                        this.negativeValues[8]+=1;
                    }
                    else{
                        this.positiveValues[8]+=1;
                    }
                    break;
                case 10:
                    if(cases[i] == 4){
                        this.negativeValues[9]+=1;
                    }
                    else{
                        this.positiveValues[9]+=1;
                    }
                    break;
                default:
                    break;
            }
            this.total+=1;
        }
    }

}
