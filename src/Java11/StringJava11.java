package Java11;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class StringJava11 {
    public static void main(String[] args) {
        //verficar se a string está com espaços em branco
        String teste = "    ";
        System.out.println(teste.isBlank());
        //tags HTML
        String html = "<html>\n<head>\n</head>\n <body> \n <body> \n<html>";
        System.out.println(html.lines().map(s -> "[TAG] :: "+s).collect(Collectors.toList()));
        //repeat
        String nome = "Jeans Carlos ::";
        System.out.println(nome.repeat(10));
        //um jeito mais simples de criar uma collection
        Collection<String> nomes = Set.of("Joao", "Paulo", "Oliveira", "Santos");
        System.out.println(nomes);

    }
}
