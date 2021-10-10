package com.jf.demoservlet;

import entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.*;

@WebServlet(name = "createUser", value = "/createUser")
public class CreateNewUser extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setEmail( req.getParameter("emailUser"));
        user.setPassword( req.getParameter("newPassword"));

        try {
            ResultSet resultQuery = addNewUser(user);
            String idUser;
            String emailRes;
            String passwRes;

            int i=1;
            while(resultQuery.next()){
                idUser = resultQuery.getString("id_user");
                emailRes = resultQuery.getString("email");
                passwRes = resultQuery.getString("password");
                resp.getWriter().write(idUser+" "+emailRes+" "+passwRes+"\n");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        //resp.getWriter().write( "EMAIL: " + user.getEmail() + "\n"+ "PASSWORD: " + user.getPassword());
        //resp.sendRedirect("index.jsp");
    }


    private ResultSet addNewUser(User user) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_demoJSP?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
        Statement statement = connection.createStatement();

        String query = "SELECT * FROM users";
        ResultSet resultQuery = statement.executeQuery(query);
        return resultQuery;
    }

}
