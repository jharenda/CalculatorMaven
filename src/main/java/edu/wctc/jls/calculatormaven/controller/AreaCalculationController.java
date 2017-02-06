package edu.wctc.jls.calculatormaven.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.wctc.jls.calculatormaven.model.AreaCalculationService;

/**
 *
 * @author Jennifer
 */
import javax.servlet.RequestDispatcher;

@WebServlet(name = "calculationController", urlPatterns = {"/calculationController"})
public class AreaCalculationController extends HttpServlet {


    private final String RETURN_PAGE = "/index.jsp";
    
    
    private final String NUMBER_ONE = "numberOne";
    private final String NUMBER_TWO = "numberTwo";
        private final String RADIUS = "radius";
    private final String RESULT_RECT = "resultRect";
    private final String RESULT_CIRC = "resultCirc";
    private final String RESULT_TRIG = "resultTrig";
    
    
    public String calcType;
    

    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         AreaCalculationService acs = new AreaCalculationService();
        
//        PrintWriter out = response.getWriter();
//        out.println("<!DOCTYPE html>");
//        out.println("<html>"); 
//        out.println("<head>");
//        out.println("<title>Calculated Area!!</title>");            
//        out.println("</head>");  
        
        try {
            /* TODO output your page here. You may use following sample code. */
            calcType = request.getParameter("calcType");
            if(calcType.equals("Rectangle")){
                String numberOne = request.getParameter(NUMBER_ONE);
                String numberTwo = request.getParameter(NUMBER_TWO);
                String area = acs.getRectangleArea(numberOne, numberTwo);
                request.setAttribute(RESULT_RECT, area);
            }
            if(calcType.equals("Circle")){
                String radSet = request.getParameter("Radius");
                String area = acs.getCircleRadius(radSet);
                request.setAttribute(RESULT_CIRC, area);
            }
            if(calcType.equals("Triangle")){
                String numberOne = request.getParameter(NUMBER_ONE);
                String numberTwo = request.getParameter(NUMBER_TWO);
                String area = acs.getPythagoreanArea(numberOne, numberTwo);
                request.setAttribute(RESULT_TRIG, area);
            }
        }
        catch(Exception numberFormatException){
            if(calcType.equals("Rectangle")){
                request.setAttribute(RESULT_RECT, numberFormatException);
            }
            if(calcType.equals("Circle")){
                request.setAttribute(RESULT_CIRC, numberFormatException);
            }
            if(calcType.equals("Triangle")){
                request.setAttribute(RESULT_TRIG, numberFormatException);
            }
        }
        
        RequestDispatcher view = request.getRequestDispatcher(RETURN_PAGE);
        view.forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
