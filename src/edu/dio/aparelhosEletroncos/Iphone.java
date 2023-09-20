package edu.dio.aparelhosEletroncos;

public class Iphone extends InfoAparelhosEletronicos implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{
    public void tirarFoto() {
        System.out.println("Click!");
    }
    public void editarFoto() {
        System.out.println("Editando fotos");
    }
    public void ligarLanterna() {
        System.out.println("Ligando lanterna");
    }
    public void desligarLanterna() {
        System.out.println("Desligando lanterna");
    }
    @Override
    public void ligar() {
        System.out.println("Aparelho ligado!");
    }
    @Override
    public void desligar() {
        System.out.println("Desligando aparelho");
    }
    @Override
    public void fazerChamada(int numero) {
        System.out.println("Ligando para o numero " + numero);
    }
    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada");
    }
    @Override
    public void desligarChamada() {
        System.out.println("Desligando chamada");
    }
    @Override
    public void navegarPelaInternet(String url) {
        System.out.println("Navegando por " + url);
    }
    @Override
    public void novaAba() {
        System.out.println("Nova aba aberta com sucesso");
    }
    @Override
    public void fecharAba() {
        System.out.println("Aba fechada com sucesso!");
    }
    @Override
    public void avancarPagina() {
        System.out.println("Avancando pagina!");
    }
    @Override
    public void voltarPagina() {
        System.out.println("Voltando pagina!");
    }
    @Override
    public void reproduzirMusica(String musica) {
        System.out.println("Tocando " + musica + " com sucesso!");
    }
    @Override
    public void pausarMusica() {
        System.out.println("Musica pausada");
    }
    @Override
    public void continuarMusica() {
        System.out.println("Musica tocando novamente com sucesso!");
    }
    @Override
    public void avancarMusica() {
        System.out.println("Proxima musica tocando!");
    }
    @Override
    public void voltarMusica() {
        System.out.println("Voltando para musica anterior!");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        /*
        * Testando os atributos de InfoAparelhosEletronicos
        */
        iphone.setModelo("Iphone X");
        iphone.setAnoFabricacao(2017);
        iphone.setPeso(0.6);

        System.out.println(
                "Modelo: " + iphone.getModelo() + "\n" +
                "Ano de fabricacao: " + iphone.getAnoFabricacao() + "\n" +
                "Peso: " + iphone.getPeso()
        );

        /*
        * Testando os metodos de ReprodutorMusical
        */

        iphone.reproduzirMusica("Musica teste");
        iphone.pausarMusica();
        iphone.continuarMusica();
        iphone.avancarMusica();
        iphone.voltarMusica();

        /*
        * Testando os metodos de AparelhoTelfonico
        */

        iphone.ligar();
        iphone.desligar();
        iphone.fazerChamada(1951741636);
        iphone.atenderChamada();
        iphone.desligarChamada();

        /*
        * Testando os metodos de NavegadorInternet
        */

        iphone.navegarPelaInternet("www.facebook.com");
        iphone.novaAba();
        iphone.fecharAba();
        iphone.avancarPagina();
        iphone.voltarPagina();

        /*
        * Testando os metodos criados no Iphone
        */

        iphone.tirarFoto();
        iphone.editarFoto();
        iphone.ligarLanterna();
        iphone.desligarLanterna();
    }
}
