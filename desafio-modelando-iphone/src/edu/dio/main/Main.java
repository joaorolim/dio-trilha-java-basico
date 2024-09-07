package edu.dio.main;

import edu.dio.iphone.iPhone;
import edu.dio.usuario.Usuario;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        Usuario usuario = new Usuario("João", meuIphone);

        usuario.usarReprodutorMusical("Minha Música Favorita");
        usuario.fazerLigacao("123-456-7890");
        usuario.navegarInternet("http://example.com");
    }
}