package de.hackundsoehne.bootcamp.tooling.daystoexam;

import static spark.Spark.*;

/**
 */
public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
        get("/exams/:name", (req, res) -> {
            String exam = req.params(":name");
            int daysLeft = calculateDaysToExam(exam);
            if (daysLeft == -1) {
                return "exam \"" + exam + "\" not found";
            } else {
                return "there are " + daysLeft + " days left until you have to write "+exam+".";
            }
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
