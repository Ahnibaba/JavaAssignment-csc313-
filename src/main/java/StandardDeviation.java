

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ani
 */
public class StandardDeviation {
    public static void main(String[] args){

        double sumNum = 0;
        int [] arr = {2,5,5,9,4,7,0,9,6,11,12};
        for(int i=0; i<arr.length; i++) {
            sumNum += arr[i];
            
            
        }
        double mean = sumNum/arr.length;
        System.out.print("Mean: " + mean);
        System.out.print("\nMedian: " + arr[5]);
        
        double variance = 0;
        
        for(int i=0; i<arr.length; i++){
            variance += Math.pow((arr[i] - mean), 2);
        }
        
        variance = variance/arr.length;
        double standardDeviation = Math.sqrt(variance);
        
        System.out.print("\nStandard Deviation: " + standardDeviation);
        
      
        
    }
}
