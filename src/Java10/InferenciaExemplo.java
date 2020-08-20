package Java10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class InferenciaExemplo {
    public static void main(String[] args) throws IOException {
        connectAndPrintUrl();


    }

    private static void connectAndPrintUrl() throws IOException {
        //similar a um get no endpoint
        var url = new URL("https://globoesporte.globo.com/");
        var urlConnection = url.openConnection(); //abrindo conexão com o site

        //pegar todos os dados que estão chegando da conexão, separado em linhas
        try(var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));){
            System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n")); //concatenando as linhas
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
