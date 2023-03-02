package org.example;

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