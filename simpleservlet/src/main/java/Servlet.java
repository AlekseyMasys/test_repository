import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;


@WebServlet("/get_users")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        User[] usersMas = {new User(1, "petya", "petrov"), new User(2, "vasya", "vasiliev"), new User(3, "roma", "romanov")};
        ArrayList<User> users = new ArrayList<>(Arrays.asList(usersMas));
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonUsers = objectMapper.writeValueAsString(users);
        try(PrintWriter printWriter = resp.getWriter()) {
            printWriter.println(jsonUsers);
        }

    }
}
