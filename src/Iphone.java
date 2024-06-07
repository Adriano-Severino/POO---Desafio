
public class Iphone implements IAparelhoTelefonico, INavegador , IReprodutorMusical{

    @Override
    public void ligar(String numero) throws InterruptedException {
        System.out.println("Ligando para o número: " + numero);
        Thread.sleep(2000); 
        System.out.println("Chamada para o numero: " + numero + " atendida.");
    }

    @Override
    public void iniciarcorreio() throws InterruptedException {
        System.out.println("Iniciando Serviço de correio");
        Thread.sleep(2000); 
        System.out.println("Correio Iniciado.");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void exibirPagina(String url) throws InterruptedException {
        System.out.println("Carregando a pagina: " + url + " no navegador");
        Thread.sleep(2000); 
        System.out.println("Pagina " + url + " exibida.");
    }

    @Override
    public void adicionarNovaAba() throws InterruptedException {
        System.out.println("Adicionando uma nova aba no navegador");
        Thread.sleep(2000); 
        System.out.println("Aba adicionada.");
    }

    @Override
    public void atualizarPagina() throws InterruptedException {
        System.out.println("Atualizando a pagina no navegador");
        Thread.sleep(2000); 
        System.out.println("Pagina atualizada");
    }

    @Override
    public void selecionaMusica(String musica) throws InterruptedException {
        System.out.println("Selecionando a musica: " + musica);
        Thread.sleep(2000); 
        System.out.println("Musica" + musica + " selecionada.");
    }

    @Override
    public void pausar() throws InterruptedException {
        System.out.println("Pausando a musica");
        Thread.sleep(2000); 
        System.out.println("Musica pausada.");
    }

    @Override
    public void parar() throws InterruptedException {
        System.out.println("Parando a musica");
        Thread.sleep(2000); 
        System.out.println("Musica parada.");
    }

}
