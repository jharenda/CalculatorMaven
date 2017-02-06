<%-- 
    Document   : index
    Created on : Jan 30, 2017, 7:30:39 PM
    Author     : Jennifer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <title>Web Calculators!</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link href="https://fonts.googleapis.com/css?family=Nova+Mono" rel="stylesheet">
            <link rel="stylesheet" href="Calculator.css">
            
    </head>
    <body>
        
            <h1>Geometric Calculations</h1><br><br>
            
            <br><br>
            <h2>Rectangle:</h2>
            <h3>Are you too lazy to do simple math in your head? Let me get you that area real quick.</h3>
            <img src="images/rect.jpg" width="330" height="200" alt="Rectangle">
            <form id="RectForm" name="RectForm" method="POST" action="calculationController?calcType=Rectangle"> 
                Length: <input id="numberOne" name="numberOne"/> 
                Width: <input id="numberTwo" name="numberTwo"/><br>
                <br>
                <input id="submitForm" name="submitForm" type="submit" value="Get Area"><br><br>
                 ${resultRect}<br><br><br><br>
            </form>
            <h2>Circle:</h2>
            <h3>What is the area of the circle? Please enter the radius! </h3>
             <img src="images/circle.gif" width="320" height="230" alt="Circle">
            <form id="CircleForm" name="CircleForm" method="POST" action="calculationController?calcType=Circle"> 
                Radius: <input id="Radius" name="Radius" /> <br><br>
                <input id="submitForm" name="submitForm" type="submit" value="Get Area"><br><br>
                ${resultCirc}<br><br><br><br>
            </form>
            <h2>Pythagorean:</h2>
            <h3>I will calculate the missing side of the triangle.</h3>
             <img src="images/triangle.gif" width="330" height="200" alt="Computer Hope">>
            <form id="TriangleForm" name="TriangleForm" method="POST" action="calculationController?calcType=Triangle"> 
                Side 1: <input id="numberOne" name="numberOne" /> 
                Side 2: <input id="numberTwo" name="numberTwo" /><br> <br>
                <input id="submitForm" name="submitForm" type="submit" value="Get Missing Side"/><br><br>
                ${resultTrig}<br><br><br><br>
            </form>            
    
    </body>
</html>
