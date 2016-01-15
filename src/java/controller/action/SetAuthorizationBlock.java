/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sasha
 */
public class SetAuthorizationBlock extends Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = (String) request.getSession().getAttribute("userName");
        if (name != null) {
            request.getRequestDispatcher("/view/user/authorization.jsp").include(request, response);
        } else {
            request.getRequestDispatcher("/view/guest/authorization.jsp").include(request, response);
        }
    }
    
}
