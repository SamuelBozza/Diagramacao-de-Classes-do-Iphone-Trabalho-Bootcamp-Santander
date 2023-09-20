package edu.dio.aparelhosEletroncos;

import javax.sound.sampled.Line;

public interface NavegadorInternet{
    void navegarPelaInternet(String url);
    void novaAba();
    void fecharAba();
    void avancarPagina();
    void voltarPagina();
}
