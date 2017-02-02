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
}
// throws unchecked number exception- 
// add validation 