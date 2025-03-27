public class Main {
    public static void main(String[] args) {
        IPhone meuIphone = new IPhone();

        meuIphone.selecionarMusica("Superpowers");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("9876543210");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://github.com/IsisVct");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
