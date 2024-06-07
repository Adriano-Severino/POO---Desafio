public interface INavegador {
    void exibirPagina(String url) throws InterruptedException;
    void adicionarNovaAba() throws InterruptedException;
    void atualizarPagina() throws InterruptedException;

}
