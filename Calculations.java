package Calculator_Tamas_Borbely;

//BY TAMAS BORBELY

import java.math.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Calculations {
    private String lineToCalculate;
    private String awns = "";
    private ArrayList<String> myArray = new ArrayList<String>();
    private String awns2;
    private boolean inFront = false;
    private String lastAwns = "";

    Calculations() {
        lineToCalculate = "";
    }

    Calculations(String inputString) {
        this.lineToCalculate = inputString;
    }

    String getAwnser() {
        return awns;
    }

    String getAwnser2() {
        return awns2;
    }

    String getLastAwns() {
        return lastAwns;
    }

    void setCalc(String inpuString) {
        lineToCalculate = inpuString;
    }

    void clear() {
        for(int x = myArray.size()-1; x >= 0; x--) {
            myArray.remove(x);
        }
    }

    void clear2() {
        awns2 = "";
    }

    void convert(String currency1, String currency2, String amount) {
        DecimalFormat newFormat = new DecimalFormat("#.####");
        if(currency1.equals("USD")) {
            if(currency2.equals("USD")) {
                double temp = Double.valueOf(amount) * 1;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("EUR")) {
                double temp = Double.valueOf(amount) * 0.94;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("CAD")) {
                double temp = Double.valueOf(amount) * 1.34;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("GBP")) {
                double temp = Double.valueOf(amount) * 0.83;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("HUF")) {
                double temp = Double.valueOf(amount) * 369.61;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
        }
        if(currency1.equals("EUR")) {
            if(currency2.equals("USD")) {
                double temp = Double.valueOf(amount) * 1.07;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("EUR")) {
                double temp = Double.valueOf(amount) * 1;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("CAD")) {
                double temp = Double.valueOf(amount) * 1.43;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("GBP")) {
                double temp = Double.valueOf(amount) * 0.88;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("HUF")) {
                double temp = Double.valueOf(amount) * 394.09;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
        }
        if(currency1.equals("CAD")) {
            if(currency2.equals("USD")) {
                double temp = Double.valueOf(amount) * 0.75;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("EUR")) {
                double temp = Double.valueOf(amount) * 0.70;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("CAD")) {
                double temp = Double.valueOf(amount) * 1;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("GBP")) {
                double temp = Double.valueOf(amount) * 0.62;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("HUF")) {
                double temp = Double.valueOf(amount) * 275.31;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
        }
        if(currency1.equals("GBP")) {
            if(currency2.equals("USD")) {
                double temp = Double.valueOf(amount) * 1.21;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("EUR")) {
                double temp = Double.valueOf(amount) * 1.14;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("CAD")) {
                double temp = Double.valueOf(amount) * 1.63;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("GBP")) {
                double temp = Double.valueOf(amount) * 1;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("HUF")) {
                double temp = Double.valueOf(amount) * 447.69;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
        }
        if(currency1.equals("HUF")) {
            if(currency2.equals("USD")) {
                double temp = Double.valueOf(amount) * 0.0027;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("EUR")) {
                double temp = Double.valueOf(amount) * 0.0025;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("CAD")) {
                double temp = Double.valueOf(amount) * 0.0036;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("GBP")) {
                double temp = Double.valueOf(amount) * 0.0022;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
            if(currency2.equals("HUF")) {
                double temp = Double.valueOf(amount) * 1;
                if(temp % 1 == 0) {
                    awns2 = Integer.toString((int)temp);
                }
                else {
                    awns2 = newFormat.format(temp);
                }
            }
        }
    }

    void calculate() {
        lastAwns = awns;
        ArrayList<String> myArray3 = new ArrayList<String>();
        String tempLineToCalculate = lineToCalculate;
        ArrayList<String> tempArrayList = new ArrayList<String>();
        int tempMaxBracketString = lineToCalculate.length()-1;
        while(lineToCalculate.indexOf("(") >= 0) {
            System.out.println("inital input");
            System.out.println(lineToCalculate);
            System.out.println();
            String substring;
            System.out.println("use of bracket?");
            inFront = true;
            System.out.println(inFront);
            System.out.println();

            if(lineToCalculate.indexOf(")") == tempMaxBracketString) {
                substring = lineToCalculate.substring(lineToCalculate.indexOf("("),lineToCalculate.indexOf(")"));
                lineToCalculate = lineToCalculate.replace("(", "").replace(")", "");
                System.out.println("BREAK");
                System.out.println();
                break;
            }
            else {
                substring = lineToCalculate.substring(lineToCalculate.indexOf("("),lineToCalculate.indexOf(")")+1);
            }

            tempArrayList.add(substring);
            lineToCalculate = tempLineToCalculate.replace(substring, "");
            tempLineToCalculate = lineToCalculate;
            System.out.println("after bracket removal");
            System.out.println(lineToCalculate);
            System.out.println();
        }
        String newLineToCalculate = lineToCalculate;
        for(int t = 0; t < tempArrayList.size(); t++) {
            String tempStromg;
            tempStromg = tempArrayList.get(t).replace("(", "").replace(")", "");
            tempArrayList.set(t, tempStromg);
        }

        for(int y = 0; y < tempArrayList.size(); y++) {
            lineToCalculate = tempArrayList.get(y);
            ArrayList<String> myArray2 = new ArrayList<String>();
            if(lineToCalculate.indexOf(" ") >= 0) {
                String[] arrOfStr = lineToCalculate.split(" ", -1);
                for(int x = 0; x < arrOfStr.length; x++) {
                    myArray2.add(arrOfStr[x]);
                }
            }
            else if(!(lineToCalculate.indexOf("+") >= 0 || lineToCalculate.indexOf("-") >= 0 || lineToCalculate.indexOf("%") >= 0 || lineToCalculate.indexOf("*") >= 0) || lineToCalculate.indexOf("√") >= 0 || lineToCalculate.indexOf("^") >= 0) {
                myArray.add(lineToCalculate); 
            }
            else {
                String[] arrOfStr = lineToCalculate.split("");
                for(int x = 0; x < arrOfStr.length; x++) {
                    myArray2.add(arrOfStr[x]);
                }
            }

            System.out.println("numbers going through bracket func");
            for(int g = 0; g < myArray2.size(); g++) {
                System.out.println(myArray2.get(g));
            }
            System.out.println();

            for(int j = 0; j < myArray2.size(); j++) {
                if(myArray2.get(j).indexOf(".") < 0) {
                    while(myArray2.size() > 1) {
        
                        for(int i = 0; i < myArray2.size(); i++) {
                            if(myArray2.get(i).equals("^")) {
                                double temp = Math.pow(Integer.valueOf(myArray2.get(i-1)), Integer.valueOf(myArray2.get(i+1)));
                                if(temp % 1 == 0) {
                                    myArray2.set(i, Integer.toString((int)temp));
                                }
                                else {
                                    myArray2.set(i, Double.toString(temp));
                                }
                                myArray2.remove(i-1);
                                myArray2.remove(i);
                            }
                        }
        
                        for(int i = 0; i < myArray2.size(); i++) {
                            if(myArray2.get(i).equals("√")) {
                                double temp = Math.sqrt(Double.valueOf(myArray2.get(i+1)));
                                System.out.println(myArray2.get(i));
                                myArray2.remove(i+1);
                                if(temp % 1 == 0) {
                                    myArray2.set(i, Integer.toString((int)temp));
                                }
                                else {
                                    myArray2.set(i, Double.toString(temp));
                                }
                            }
                        }
                        
                        
        
                        for(int i = 0; i < myArray2.size(); i++) {
                            if(myArray2.get(i).equals("%")) {
                                if(Integer.valueOf(myArray2.get(i-1)) % Integer.valueOf(myArray2.get(i+1)) == 0) {
                                    myArray2.set(i, Integer.toString((Integer.valueOf(myArray2.get(i-1)) / Integer.valueOf(myArray2.get(i+1))))); 
                                    myArray2.remove(i-1);
                                    myArray2.remove(i);
                                } 
                                else {
                                    myArray2.set(i, Double.toString((Double.valueOf(myArray2.get(i-1)) / Double.valueOf(myArray2.get(i+1))))); 
                                    myArray2.remove(i-1);
                                    myArray2.remove(i);
                                }   
                            }
                        }
                        
                        for(int i = 0; i < myArray2.size(); i++) {
                            if(myArray2.get(i).equals("*")) {
                                try {
                                    myArray2.set(i, Integer.toString((Integer.valueOf(myArray2.get(i-1)) * Integer.valueOf(myArray2.get(i+1))))); 
                                    myArray2.remove(i-1);
                                    myArray2.remove(i);
                                } catch (Exception ex) {
                                    myArray2.set(i, Double.toString((Double.valueOf(myArray2.get(i-1)) * Double.valueOf(myArray2.get(i+1))))); 
                                    myArray2.remove(i-1);
                                    myArray2.remove(i);
                                }
                            }
                        }
                        for(int i = 0; i < myArray2.size(); i++) {
                            if((myArray2.get(i)).equals("+")) {
                                try {
                                    int temp = Integer.valueOf(myArray2.get(i-1)) + Integer.valueOf(myArray2.get(i+1));
                                    myArray2.set(i, Integer.toString(temp)); 
                                    myArray2.remove(i-1);
                                    myArray2.remove(i);
                                } catch (Exception ex) {
                                    double temp = Double.valueOf(myArray2.get(i-1)) + Double.valueOf(myArray2.get(i+1));
                                    myArray2.set(i, Double.toString(temp)); 
                                    myArray2.remove(i-1);
                                    myArray2.remove(i);
                                }  
                            }
                        }
                        for(int i = 0; i < myArray2.size(); i++) {
                            if(myArray2.get(i).equals("-")) {
                                try {
                                    int temp = Integer.valueOf(myArray2.get(i-1)) - Integer.valueOf(myArray2.get(i+1));
                                    myArray2.set(i, Integer.toString(temp)); 
                                    myArray2.remove(i-1);
                                    myArray2.remove(i);
                                } catch (Exception ex) {
                                    double temp = Double.valueOf(myArray2.get(i-1)) - Double.valueOf(myArray2.get(i+1));
                                    myArray2.set(i, Double.toString(temp)); 
                                    myArray2.remove(i-1);
                                    myArray2.remove(i);
                                }
                            }
                        }
                    }
                }
                else if(myArray2.get(j).indexOf(".") > 0) {
                    while(myArray2.size() > 1) {
        
                        for(int i = 0; i < myArray2.size(); i++) {
                            if(myArray2.get(i).equals("^")) {
                                double temp = Math.pow(Double.valueOf(myArray2.get(i-1)), Double.valueOf(myArray2.get(i+1)));
                                if(temp % 1 == 0) {
                                    myArray2.set(i, Integer.toString((int)temp));
                                }
                                else {
                                    myArray2.set(i, Double.toString(temp));
                                }
                                myArray2.remove(i-1);
                                myArray2.remove(i);
                            }
                        }
        
                        for(int i = 0; i < myArray2.size(); i++) {
                            if(myArray2.get(i).equals("√")) {
                                double temp = Math.sqrt(Double.valueOf(myArray2.get(i+1)));
                                System.out.println(myArray2.get(i));
                                myArray2.remove(i+1);
                                if(temp % 1 == 0) {
                                    myArray2.set(i, Integer.toString((int)temp));
                                }
                                else {
                                    myArray2.set(i, Double.toString(temp));
                                }
                            }
                        }
        
                        for(int i = 0; i < myArray2.size(); i++) {
                            if(myArray2.get(i).equals("%")) {
                                if(Float.valueOf(myArray2.get(i-1)) % Float.valueOf(myArray2.get(i+1)) == 0) {
                                    myArray2.set(i, Integer.toString((Integer.valueOf(myArray2.get(i-1)) / Integer.valueOf(myArray2.get(i+1))))); 
                                    myArray2.remove(i-1);
                                    myArray2.remove(i);
                                } 
                                else {
                                    myArray2.set(i, Float.toString((Float.valueOf(myArray2.get(i-1)) / Float.valueOf(myArray2.get(i+1))))); 
                                    myArray2.remove(i-1);
                                    myArray2.remove(i);
                                }   
                            }
                        }
        
                        for(int i = 0; i < myArray2.size(); i++) {
                            if(myArray2.get(i).equals("*")) {
                                double temp = (Double.valueOf(myArray2.get(i-1)) * Double.valueOf(myArray2.get(i+1)));
                                if(temp % 1 == 0) {
                                    myArray2.set(i, Integer.toString((int)temp));
                                }
                                else {
                                    myArray2.set(i, Double.toString(temp));
                                }
                                myArray2.remove(i-1);
                                myArray2.remove(i);
                            }
                        }
                        for(int i = 0; i < myArray2.size(); i++) {
                            if((myArray2.get(i)).equals("+")) {
                                double temp = Double.valueOf(myArray2.get(i-1)) + Double.valueOf(myArray2.get(i+1));
                                if(temp % 1 == 0) {
                                    myArray2.set(i, Integer.toString((int)temp));
                                }
                                else {
                                    myArray2.set(i, Double.toString(temp));
                                }
                                myArray2.remove(i-1);
                                myArray2.remove(i);
                            }
                        }
                        for(int i = 0; i < myArray2.size(); i++) {
                            if(myArray2.get(i).equals("-")) {
                                double temp = Double.valueOf(myArray2.get(i-1)) - Double.valueOf(myArray2.get(i+1));
                                if(temp % 1 == 0) {
                                    myArray2.set(i, Integer.toString((int)temp));
                                }
                                else {
                                    myArray2.set(i, Double.toString(temp));
                                }
                                myArray2.remove(i-1);
                                myArray2.remove(i);
                            }
                        }
                    }
                }
            }
            myArray3.add(myArray2.get(0));
        }

        lineToCalculate = newLineToCalculate;

        if(lineToCalculate.indexOf(" ") >= 0) {
            if(lineToCalculate.indexOf(" ") == 0) {
                lineToCalculate = lineToCalculate.substring(1);
            }

            String[] arrOfStr = lineToCalculate.split(" ", -1);

            System.out.println("intial input being split");
    
            System.out.println("what the inital acc got split into");
            for(int x = 0; x < arrOfStr.length; x++) {
                System.out.println("[" + arrOfStr[x] + "]");
            }
            System.out.println();

            int arrOfStrMax = arrOfStr.length-1;
            if(arrOfStr[arrOfStrMax].equals("")) {
                for(int x = 0; x < arrOfStr.length-1; x++) {
                    myArray.add(arrOfStr[x]);
                    if(myArray.get(x).equals(" ") || myArray.get(x).equals("")) {
                        myArray.remove(x);
                    }
                    System.out.println("intial input being split");
                    System.out.println("[" + myArray.get(x) + "]");
                }
            }
            else {
                System.out.println("intial input being split (but else)");
                for(int x = 0; x < arrOfStr.length; x++) {
                    myArray.add(arrOfStr[x]);
                    System.out.println("[" + myArray.get(x) + "]");
                }
                System.out.println();

                //backup for extra spaces
                for(int x = 0; x < myArray.size(); x++) {
                    if(myArray.get(x).equals(" ") || myArray.get(x).equals("")) {
                        System.out.println("possible problem being removed");
                        System.out.println("[" + myArray.get(x) + "]");
                        myArray.remove(x);
                    }
                }

            }

            
        }
        else if(!(lineToCalculate.indexOf("+") >= 0 || lineToCalculate.indexOf("-") >= 0 || lineToCalculate.indexOf("%") >= 0 || lineToCalculate.indexOf("*") >= 0) || lineToCalculate.indexOf("√") >= 0 || lineToCalculate.indexOf("^") >= 0) {
            myArray.add(lineToCalculate); 
        }
        else {
            String[] arrOfStr = lineToCalculate.split("");
            for(int x = 0; x < arrOfStr.length; x++) {
                myArray.add(arrOfStr[x]);

                System.out.println("intial input being split (if no space)");
                System.out.println(myArray.get(x));
            }
        }
        
        System.out.println("awnsers from bracket func (i think)");
        for(int g = 0; g < myArray3.size(); g++) {
            System.out.println(myArray3.get(g));
        }
        System.out.println();

        if(inFront == true) {
            if (myArray.get(0).equals("+") || myArray.get(0).equals("%") || myArray.get(0).equals("*") || myArray.get(0).equals("*") || myArray.get(0).equals("^")) {
                System.out.println("test1");
                System.out.println();
                myArray.add(0, myArray3.get(0));
                myArray3.remove(0);
            }
            int normMax = myArray.size();
            int bracketMax = myArray3.size();

            normMax -= 1;
            bracketMax -= 1; 

            System.out.println("brackets getting replaced");
            for(int g = 0; g < myArray.size(); g++) {
                System.out.println(myArray.get(g) + " " + "[" + g + "]");
            }
            System.out.println();
            if (myArray.get(normMax).equals("+") || myArray.get(normMax).equals("%") || myArray.get(normMax).equals("*") || myArray.get(normMax).equals("*") || myArray.get(normMax).equals("^")) {
                System.out.println("test2");
                System.out.println();
                myArray.add(myArray3.get(bracketMax));
                myArray3.remove(bracketMax);
            }
            for(int d = 0; d < myArray.size(); d++) {
                if(d != myArray.size()-2) {
                    if((myArray.get(d).equals("+") || myArray.get(d).equals("%") || myArray.get(d).equals("-") || myArray.get(d).equals("*") || myArray.get(d).equals("^")) && (myArray.get(d+1).equals("+") || myArray.get(d+1).equals("%") || myArray.get(d+1).equals("-") || myArray.get(d+1).equals("*") || myArray.get(d+1).equals("^"))) {
                        System.out.println("test3");
                        System.out.println(myArray.get(d));
                        System.out.println();
                        myArray.add(d+1, myArray3.get(0));
                        myArray3.remove(0);
                    }
                }
            }
        }

        System.out.println("after loop");
        for(int g = 0; g < myArray.size(); g++) {
            
            System.out.println(myArray.get(g) + " " + "[" + g + "]");
        }

        for(int y = 0; y < myArray.size(); y++) {
            if(myArray.get(y).indexOf(".") < 0) {
                while(myArray.size() > 1) {

                    for(int i = 0; i < myArray.size(); i++) {
                        if(myArray.get(i).equals("^")) {
                            double temp = Math.pow(Integer.valueOf(myArray.get(i-1)), Integer.valueOf(myArray.get(i+1)));
                            if(temp % 1 == 0) {
                                myArray.set(i, Integer.toString((int)temp));
                            }
                            else {
                                myArray.set(i, Double.toString(temp));
                            }
                            myArray.remove(i-1);
                            myArray.remove(i);
                        }
                    }

                    for(int i = 0; i < myArray.size(); i++) {
                        if(myArray.get(i).equals("√")) {
                            double temp = Math.sqrt(Double.valueOf(myArray.get(i+1)));
                            System.out.println(myArray.get(i));
                            myArray.remove(i+1);
                            if(temp % 1 == 0) {
                                myArray.set(i, Integer.toString((int)temp));
                            }
                            else {
                                myArray.set(i, Double.toString(temp));
                            }
                        }
                    }
                    
                    

                    for(int i = 0; i < myArray.size(); i++) {
                        if(myArray.get(i).equals("%")) {
                            if(Integer.valueOf(myArray.get(i-1)) % Integer.valueOf(myArray.get(i+1)) == 0) {
                                myArray.set(i, Integer.toString((Integer.valueOf(myArray.get(i-1)) / Integer.valueOf(myArray.get(i+1))))); 
                                myArray.remove(i-1);
                                myArray.remove(i);
                            } 
                            else {
                                myArray.set(i, Double.toString((Double.valueOf(myArray.get(i-1)) / Double.valueOf(myArray.get(i+1))))); 
                                myArray.remove(i-1);
                                myArray.remove(i);
                            }   
                        }
                    }
                    
                    for(int i = 0; i < myArray.size(); i++) {
                        if(myArray.get(i).equals("*")) {
                            try {
                                myArray.set(i, Integer.toString((Integer.valueOf(myArray.get(i-1)) * Integer.valueOf(myArray.get(i+1))))); 
                                myArray.remove(i-1);
                                myArray.remove(i);
                            } catch (Exception ex) {
                                myArray.set(i, Double.toString((Double.valueOf(myArray.get(i-1)) * Double.valueOf(myArray.get(i+1))))); 
                                myArray.remove(i-1);
                                myArray.remove(i);
                            }
                        }
                    }
                    for(int i = 0; i < myArray.size(); i++) {
                        if((myArray.get(i)).equals("+")) {
                            try {
                                int temp = Integer.valueOf(myArray.get(i-1)) + Integer.valueOf(myArray.get(i+1));
                                myArray.set(i, Integer.toString(temp)); 
                                myArray.remove(i-1);
                                myArray.remove(i);
                            } catch (Exception ex) {
                                double temp = Double.valueOf(myArray.get(i-1)) + Double.valueOf(myArray.get(i+1));
                                myArray.set(i, Double.toString(temp)); 
                                myArray.remove(i-1);
                                myArray.remove(i);
                            }  
                        }
                    }
                    for(int i = 0; i < myArray.size(); i++) {
                        if(myArray.get(i).equals("-")) {
                            try {
                                int temp = Integer.valueOf(myArray.get(i-1)) - Integer.valueOf(myArray.get(i+1));
                                myArray.set(i, Integer.toString(temp)); 
                                myArray.remove(i-1);
                                myArray.remove(i);
                            } catch (Exception ex) {
                                double temp = Double.valueOf(myArray.get(i-1)) - Double.valueOf(myArray.get(i+1));
                                myArray.set(i, Double.toString(temp)); 
                                myArray.remove(i-1);
                                myArray.remove(i);
                            }
                        }
                    }
                }
            }
            else if(myArray.get(y).indexOf(".") > 0) {
                while(myArray.size() > 1) {

                    for(int i = 0; i < myArray.size(); i++) {
                        if(myArray.get(i).equals("^")) {
                            double temp = Math.pow(Double.valueOf(myArray.get(i-1)), Double.valueOf(myArray.get(i+1)));
                            if(temp % 1 == 0) {
                                myArray.set(i, Integer.toString((int)temp));
                            }
                            else {
                                myArray.set(i, Double.toString(temp));
                            }
                            myArray.remove(i-1);
                            myArray.remove(i);
                        }
                    }

                    for(int i = 0; i < myArray.size(); i++) {
                        if(myArray.get(i).equals("√")) {
                            double temp = Math.sqrt(Double.valueOf(myArray.get(i+1)));
                            System.out.println(myArray.get(i));
                            myArray.remove(i+1);
                            if(temp % 1 == 0) {
                                myArray.set(i, Integer.toString((int)temp));
                            }
                            else {
                                myArray.set(i, Double.toString(temp));
                            }
                        }
                    }

                    for(int i = 0; i < myArray.size(); i++) {
                        if(myArray.get(i).equals("%")) {
                            if(Float.valueOf(myArray.get(i-1)) % Float.valueOf(myArray.get(i+1)) == 0) {
                                myArray.set(i, Integer.toString((Integer.valueOf(myArray.get(i-1)) / Integer.valueOf(myArray.get(i+1))))); 
                                myArray.remove(i-1);
                                myArray.remove(i);
                            } 
                            else {
                                myArray.set(i, Float.toString((Float.valueOf(myArray.get(i-1)) / Float.valueOf(myArray.get(i+1))))); 
                                myArray.remove(i-1);
                                myArray.remove(i);
                            }   
                        }
                    }

                    for(int i = 0; i < myArray.size(); i++) {
                        if(myArray.get(i).equals("*")) {
                            double temp = (Double.valueOf(myArray.get(i-1)) * Double.valueOf(myArray.get(i+1)));
                            if(temp % 1 == 0) {
                                myArray.set(i, Integer.toString((int)temp));
                            }
                            else {
                                myArray.set(i, Double.toString(temp));
                            }
                            myArray.remove(i-1);
                            myArray.remove(i);
                        }
                    }
                    for(int i = 0; i < myArray.size(); i++) {
                        if((myArray.get(i)).equals("+")) {
                            double temp = Double.valueOf(myArray.get(i-1)) + Double.valueOf(myArray.get(i+1));
                            if(temp % 1 == 0) {
                                myArray.set(i, Integer.toString((int)temp));
                            }
                            else {
                                myArray.set(i, Double.toString(temp));
                            }
                            myArray.remove(i-1);
                            myArray.remove(i);
                        }
                    }
                    for(int i = 0; i < myArray.size(); i++) {
                        if(myArray.get(i).equals("-")) {
                            double temp = Double.valueOf(myArray.get(i-1)) - Double.valueOf(myArray.get(i+1));
                            if(temp % 1 == 0) {
                                myArray.set(i, Integer.toString((int)temp));
                            }
                            else {
                                myArray.set(i, Double.toString(temp));
                            }
                            myArray.remove(i-1);
                            myArray.remove(i);
                        }
                    }
                }
            }
        }

        awns = myArray.get(0);
        System.out.println();
        System.out.println("calculation complete");
    }
}
