public interface IAparelhoTelefonico {
    void ligar(String numero) throws InterruptedException;
    void iniciarcorreio() throws InterruptedException;
    void atender();

}
