package fr.univ_amu.iut.exercice1;

public class HelloWorld {
    public static String hello(String s) {
        if (s == "" || s == null || s.isEmpty())
            s = "World";
        return "Hello, " + s + "!";
    }
}
