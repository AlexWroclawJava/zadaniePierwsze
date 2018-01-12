package pl.Serwlety;

import pl.Obliczenia.ConverterWag;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/przelicznikWag")
public class ServletWag extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String kilos = request.getParameter("kilogramy");
        String grams = request.getParameter("gramy");
        String miligrams = request.getParameter("miligramy");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        ConverterWag converterWag = new ConverterWag();

        writer.println("<html>");
        writer.println("<head><title>Aplikacja do przeliczania wag</title>/<head>");
        writer.println("<body>");
        writer.println("<h1> Podana wartość w przeliczeniu na: </h1>");

            if (!kilos.isEmpty()) {
                writer.println("<h2> kilogramy: " + kilos + "</h2>");
                writer.println("<h2> gramy: " + converterWag.kilosToGrams(kilos) + "</h2>");
                writer.println("<h2> miligramy: " + converterWag.kilosToMiligrams(kilos) + "</h2>");
            }
            if (!grams.isEmpty()) {
                writer.println("<h2> kilogramy: " + converterWag.gramsToKilos(grams) + "</h2>");
                writer.println("<h2> gramy: " + grams + "</h2>");
                writer.println("<h2> miligramy: " + converterWag.gramsToMiligrams(grams) + "</h2>");
            }
            if (!miligrams.isEmpty()) {
                writer.println("<h2> kilogramy: " + converterWag.miligramsToKilos(miligrams) + "</h2>");
                writer.println("<h2> gramy: " + converterWag.miligramsToGrams(miligrams) + "</h2>");
                writer.println("<h2> miligramy: " + miligrams + "</h3>");
            }
        writer.println("</body>");
        writer.println("</html>");
    }
}
