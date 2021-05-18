/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author carlo
 */
public class registrar extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        
        
        
    }


    
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        //Agora, precisamos adicionar a conecxão JDBC e pegar valores de jsp e 
        //inseri-los em nosso banco de dados.
        String fullname = request.getParameter("ncompleto");
        String username = request.getParameter("unome");
        String email = request.getParameter("email");
        String password = request.getParameter("paw");
        String confirmpass = request.getParameter("cnfpaw");
        
        //Aqui estamos pegando os valores de entrada do usuário do jsp e com a 
        //ajuda deste servlet somos capazes de
        //inseri-lo no banco de dados
        
        try{
            
            Connection con;
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
            
            System.out.println("Conectado");
            
            
            //Agora nós conectamos ao banco de dados
            String sql = "insert into db_formulario.registro(carlos,nome_de_usuario,email,senha,confsenhacarchar) values(?,?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, fullname);
            ps.setString(2, username);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setString(5, confirmpass);
            
            
            ps.executeUpdate();
            
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
            
            
            
        }catch(Exception e) {
            System.out.println("Error :: "+e.getMessage());
        }
        
    }

    
    
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
