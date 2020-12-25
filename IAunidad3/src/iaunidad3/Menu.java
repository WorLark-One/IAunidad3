/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaunidad3;

import java.util.Scanner;

/**
 *
 * @author WorLark
 */
public class Menu {
    private Scanner reader = new Scanner(System.in);
    public Menu() {
        this.menuOfOptions();
    }
    
    private void menuOfOptions(){
        boolean flag = true;
        boolean flag2 = false;
        boolean flag3 = false;
        while(flag){
            this.Options();
            String option = reader.next();
            while(!this.isNumeric(option,flag2,flag3)){
                this.Options();
                option = reader.next();
            }
            int numberOption= Integer.parseInt(option);
            switch(numberOption){
                case 0:
                    //exit
                    flag = false;
                    break;
                case 1:
                    this.printFrequencyTables();
                    break;
                case 2:
                    this.breastCancerScreeningTest();
                    break;
            }
        }
    }
    
    private void Options(){
        System.out.println("");
        System.out.println("--------- Options ---------");
        System.out.println("[ 1 ] : Print frequency tables");
        System.out.println("[ 2 ] : Doing a breast cancer screening test");
        System.out.println("[ 0 ] : Exit");
        System.out.print("Please enter an option: ");
        
    }
    
    private void printFrequencyTables(){
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            this.printAttributeFrequencyTables(i);
            System.out.println(" ");
            for (int j = 0; j < 10; j++) {
                System.out.print("tables ");
            }
            System.out.println(" ");
        }
    }
    
    private void breastCancerScreeningTest(){
        System.out.println("");
        System.out.println("--------- Breast Cancer Screening Test ---------");
        int[] arrayAttributes = new int[10];
        boolean flag2 = true;
        boolean flag3 = false;
        for (int i = 0; i < 10; i++) {
            this.printAttributeEnter(i);
            String number = reader.next();
            if (i==9) {
                flag3 = true;
            }
            while(!this.isNumeric(number,flag2,flag3)){
                this.printAttributeEnter(i);
                number = reader.next();
            }
            int numberAux = Integer.parseInt(number);
            arrayAttributes[i]=numberAux;
        }
    }
    
    private void printAttributeEnter(int counter){
        switch(counter){
            case 0:
                System.out.print("Please enter Clump Thickness:");
                break;
            case 1:
                System.out.print("Please enter Uniformity of Cell Size:");
                break;
            case 2:
                System.out.print("Please enter Uniformity of Cell Shape:");
                break;
            case 3:
                System.out.print("Please enter Marginal Adhesion:");
                break;
            case 4:
                System.out.print("Please enter Single Epithelial Cell Size:");
                break;
            case 5:
                System.out.print("Please enter Bare Nuclei:");
                break;
            case 6:
                System.out.print("Please enter Bland Chromatin:");
                break;
            case 7:
                System.out.print("Please enter Normal Nucleoli:");
                break;
            case 8:
                System.out.print("Please enter Mitoses:");
                break;
            case 9:
                System.out.print("Please enter Class:");
                break;
        }
    }
    
    private void printAttributeFrequencyTables(int counter){
        switch(counter){
            case 0:
                System.out.print("--- Clump Thickness Frequency Table ---");
                break;
            case 1:
                System.out.print("--- Uniformity of Cell Size Frequency Table ---");
                break;
            case 2:
                System.out.print("--- Uniformity of Cell Shape Frequency Table ---");
                break;
            case 3:
                System.out.print("--- Marginal Adhesion Frequency Table ---");
                break;
            case 4:
                System.out.print("--- Epithelial Cell Size Frequency Table ---");
                break;
            case 5:
                System.out.print("--- Bare Nuclei Frequency Table ---");
                break;
            case 6:
                System.out.print("--- Bland Chromatin Frequency Table ---");
                break;
            case 7:
                System.out.print("--- Normal Nucleoli Frequency Table ---");
                break;
            case 8:
                System.out.print("--- Mitoses Frequency Table ---");
                break;
            case 9:
                System.out.print("--- Class Frequency Table ---");
                break;
        }
    }
    
    private boolean isNumeric(String number, boolean flag2, boolean flag3){
	try {
            int numberAux =Integer.parseInt(number);
            if (flag2) {
                return this.isValidNumber(numberAux);
            }
            else if(flag3){
                return this.isValidClass(numberAux);
            }
            return this.isValidOption(numberAux );
	} catch (NumberFormatException nfe){
            System.out.println("Please enter a number");
            return false;
	}
    }
    private boolean isValidOption(int option){
        if (option == 0 || option == 1 || option == 2) {
            return true;
        }
        System.out.println("Please enter a valid option [0 - 2]");
        return false;
    }
    
    private boolean isValidNumber(int number){
        if (number >=1 && number <=10) {
            return true;
        }
        System.out.println("Please enter a valid number [1 - 10]");
        return false;
    }
    private boolean isValidClass(int number){
        if (number ==2 || number == 4) {
            return true;
        }
        System.out.println("Please enter only 2 for benig or 4 for malignant");
        return false;
    }
}
