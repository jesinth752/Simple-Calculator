package org.example;

import jdk.jshell.JShell;

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
