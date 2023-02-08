package org.example;

import jdk.jshell.JShell;

import java.util.Scanner;
import java.util.logging.Logger;

abstract class Arithmetic
{
    public static final Logger log = Logger.getLogger("InfoLogging");
    String res;
    abstract void evaluate(String exp,String operator);



    JShell js= JShell.builder().build();

    String getvalue()
    {
        return res;
    }

    void setvalue(String val)
    {
        res=js.eval(val).get(0).value();

    }

}
class Caluclator extends Arithmetic
{
    String concat;
    void evaluate(String exp,String a)
    {
        concat=a+exp;
        setvalue(getvalue()+concat);
    }

    void console()
    {
        String rep="result  = "+getvalue();
        log.info(rep);
    }
}
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