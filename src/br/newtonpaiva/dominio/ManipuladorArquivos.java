package br.newtonpaiva.dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManipuladorArquivos {
    public static String[] leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        List<String> linhas = new ArrayList<>();
        String linha = "";
        while (true) {
            if (linha != null) {
                linha = buffRead.readLine();
                linhas.add(linha);
            } else {
                break;
            }
        }
        buffRead.close();
        return linhas.toArray(new String[0]);
    }
}
