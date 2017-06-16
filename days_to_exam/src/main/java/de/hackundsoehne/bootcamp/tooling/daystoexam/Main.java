package de.hackundsoehne.bootcamp.tooling.daystoexam;

import static spark.Spark.*;

/**
 */
public class Main {
    public static void main(String[] args) {
        addHeader();
        get("/hello", (req, res) -> "Hello World");
        get("/exams/:name", (req, res) -> {
            String exam = req.params(":name");
            int daysLeft = calculateDaysToExam(exam);
            if (daysLeft == -1) {
                return "exam \"" + exam + "\" not found";
            } else {
                return "You have " + daysLeft + " days left until you have to write "+exam+".";
            }
        });
    }

    /**
     * these headers are necessary to allow CORS
     */
    private static void addHeader() {
        before((request, response) -> {
            response.header("access-control-allow-origin", "*");
            response.header("access-control-allow-methods", "GET,PUT,POST,PATCH,DELETE,OPTIONS");
            response.header("access-control-allow-credentials", "true");
            response.header("access-control-allow-headers", "Authorization,Content-Type");
            response.header("access-control-expose-headers", "Link,Location");
            response.header("access-control-max-age", "600"); // see http://stackoverflow.com/a/23549398/2373138
            // Note: this may or may not be necessary in your particular application
            response.type("application/json");
        });
        options("/*", (request, response) -> {
            response.status(204);
            response.type("text/plain");
            return "";
        });
    }

    /**
     * calculates the days to the exam.
     * NO SPACES ETC. ARE ALLOWED IN THE NAME, ONLY CHARACTERS AND NUMBERS!
     * it is ok to just hardcode one or two exams.
     * Example: neuralnetworks (03.08) -> 48
     * @param name the name of the exam
     * @return the days to the exam or -1 if the exam is not found
     */
    private static int calculateDaysToExam(String name) {
    }
}
