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
 private static final String RESULTS_PAGE = "/results.jsp";
    private static final String SHAPE = "shape";
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
        try (PrintWriter out = response.getWriter()) {
           AreaCalculationService calcServ = new AreaCalculationService();
              String type = request.getParameter(SHAPE);
             if(type.equals("rectangle")){
             if (type.equals("rectangle")) {
                  String length = request.getParameter("rectangleLength");
                  String width = request.getParameter("rectangleWidth");
                  String responseMsg = calcServ.getRectangleArea(length, width);
                 request.setAttribute("area", responseMsg);
                 request.setAttribute("shape", type);
                 RequestDispatcher view = request.getRequestDispatcher(RESULTS_PAGE);
                 view.forward(request, response);
        }
    }
        }
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
