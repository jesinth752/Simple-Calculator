package org.example;
import java.util.Scanner;
import java.util.logging.Logger;



public class Main {
    private static final Logger log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        Caluclator c=new Caluclator();
        String exp;
        String opt;
        log.info("SIMPLE CALCULATOR ");
        log.info("value:");
        exp=input.nextLine();
        c.setvalue(exp);
        do {
            log.info("choose operator among these +,-,%,/. cmd .ext to exit");
            opt=input.nextLine();
            if(!opt.equals(".ext")) {
                switch (opt) {
                    case "+" -> {
                        log.info("value for addition");
                        exp = input.nextLine();
                        c.evaluate(exp, "+");
                        c.console();
                    }
                    case "-" -> {
                        log.info("value for subraction");
                        exp = input.nextLine();
                        c.evaluate(exp, "-");
                        c.console();
                    }
                    case "%" -> {
                        log.info("value for remainder");
                        exp = input.nextLine();
                        c.evaluate(exp, "%");
                        c.console();
                    }
                    case "/" -> {
                        log.info("value for division");
                        exp = input.nextLine();
                        c.evaluate(exp, "/");
                        c.console();
                    }
                    case "*" -> {
                        log.info("value for multiplication");
                        exp = input.nextLine();
                        c.evaluate(exp, "*");
                        c.console();
                    }
                    default -> log.info("Invalid operands");
                }
            }

        }while (!opt.equals(".ext"));



    }
}
