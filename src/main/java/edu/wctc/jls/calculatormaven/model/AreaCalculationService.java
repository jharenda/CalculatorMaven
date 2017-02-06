package edu.wctc.jls.calculatormaven.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jennifer
 */
public class AreaCalculationService {
      public String getRectangleArea(String length, String width) throws NumberFormatException {
        String area;
        
        double l = Double.parseDouble(length);
        double w = Double.parseDouble(width);
        
        double a = l * w;
        
        area = "" + a;
        
        return area;
    }
      
      
      public String getCircleRadius(String radius) throws NumberFormatException {
          
       String area; 
      
       double radiusNumber = Double.parseDouble(radius); 
       
       
        double areaNumber = radiusNumber * radiusNumber * Math.PI;  
        area = ""+ areaNumber; 
         return area; 
       
      }
      
      public final String getPythagoreanArea(String firstSide, String secondSide){
        double first;
        double second; 
        first = Double.parseDouble(firstSide);
        second = Double.parseDouble(secondSide);
       double thirdSide = Math.sqrt(first*first+second*second);
        return thirdSide + "";
    }
}
// throws unchecked number exception- 
// add validation 