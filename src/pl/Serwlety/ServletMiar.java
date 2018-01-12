package pl.Serwlety;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import pl.Obliczenia.ConverterMiar;

@WebServlet("/przelicznikMiar")
public class ServletMiar extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String meters = request.getParameter("metry");
        String centimeters = request.getParameter("centymetry");
        String milimeters = request.getParameter("milimetry");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        ConverterMiar converterMiar = new ConverterMiar();

        writer.println("<html>");
        writer.println("<head><title>Aplikacja do przeliczania miar</title>/<head>");

        writer.println("<body>");
        writer.println("<h1> Podana wartość w przeliczeniu na: </h1>");

            if (!meters.isEmpty()) {
                writer.println("<h2> metry: " + meters + "</h2>");
                writer.println("<h2> centymetry: " + converterMiar.metersToCentimeters(meters) + "</h2>");
                writer.println("<h2> milimetry: " + converterMiar.metersToMilimeters(meters) + "</h2>");
            }
            if (!centimeters.isEmpty()) {
                writer.println("<h2> metry: " + converterMiar.centimitersToMeters(centimeters) + "</h2>");
                writer.println("<h2> centymetry: " + centimeters + "</h2>");
                writer.println("<h2> milimetry: " + converterMiar.centimitersToMilimeters(centimeters) + "</h2>");
            }
            if (!milimeters.isEmpty()) {
                writer.println("<h2> metry: " + converterMiar.milimitersToMeters(milimeters) + "</h2>");
                writer.println("<h2> centymetry: " + converterMiar.milimitersToCentimeters(milimeters) + "</h2>");
                writer.println("<h2> milimetry: " + milimeters + "</h3>");
            }

        writer.println("</body>");
        writer.println("</html>");
    }
}


