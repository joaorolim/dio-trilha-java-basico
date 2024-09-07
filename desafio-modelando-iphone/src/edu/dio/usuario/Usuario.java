package edu.dio.usuario;

import edu.dio.iphone.iPhone;

public class Usuario {
    private String nome;
    private iPhone iphone;

    public Usuario(String nome, iPhone iphone) {
        this.nome = nome;
        this.iphone = iphone;
    }

    public void usarReprodutorMusical(String musica) {
        iphone.selecionarMusica(musica);
        iphone.tocar();
    }

    public void fazerLigacao(String numero) {
        iphone.ligar(numero);
    }

    public void navegarInternet(String url) {
        iphone.exibirPagina(url);
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}