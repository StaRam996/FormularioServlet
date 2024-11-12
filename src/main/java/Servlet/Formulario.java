package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//implemento el path de acceso
@WebServlet("/ingresar")
public class Formulario extends HttpServlet {

    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //seteamos el setContextpath
        resp.setContentType("text/html");
        //declaro ee inicializo una variable de tipo string para el nomnre
        String username = req.getParameter("username");
        //declaro e inicializo una variable de tipo string para la contraseña
        String password = req.getParameter("password");
        //declaro e inicializo una variable de tipo string para ael email
        String emaul=req.getParameter("email");


    }



}
