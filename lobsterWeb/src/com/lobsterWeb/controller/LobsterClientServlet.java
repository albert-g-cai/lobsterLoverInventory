/**
 * Created by Albert Cai.
 *         Date: 2022/10/9
 *         Time: 2:25
 */

package com.lobsterWeb.controller;

import com.lobsterWeb.entity.messageContainer.MessageModel;
import com.lobsterWeb.service.LobsterClientService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LobsterClientServlet extends HttpServlet {
    //Instantiate LobsterClientService
    private LobsterClientService lobsterClientService=new LobsterClientService();

    @Override
    protected void service(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {
        //1. receive lobster client request (parameter: name, password)
        String uname=request.getParameter("uname");
        String upwd=request.getParameter("upwd");
        //2. call service layer method which return message model entity
        MessageModel messageModel=
                lobsterClientService.lobsterClientLogin(uname,upwd);
        if(messageModel.getState()==1){//success
            //save lobster client info returned from service layer from database
            // into session scope, redirect to index.jsp
            request.getSession().setAttribute("lobsterClient",
                    messageModel.getObject());
            response.sendRedirect("index.jsp");
        }else{//failed to get lobster client info from database
            request.setAttribute("messageModel", messageModel);
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
