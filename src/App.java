import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (sair == false) {
            try {
                System.out.println("===================================");
                System.out.println("Iphone escolha uma opição");
                System.out.println("1 - para ligar para um número");
                System.out.println("2 - para iniciar o correio de voz");
                System.out.println("3 - para atender uma chamada");
                System.out.println("4 - Abrir uma pagina da internet");
                System.out.println("5 - Adicionar uma nova aba no navegador");
                System.out.println("6 - Atualizar a pagina do navegador");
                System.out.println("7 - Escolher musica para tocar");
                System.out.println("8 - Pausar a musica");
                System.out.println("9 - Parar a musica");
                System.out.println("0 - Desligar o Iphone");
                System.out.println("===================================");
                int opicao = scanner.nextInt();
                scanner.nextLine();
                switch (opicao) {
                    case 1:
                        System.out.println("Digite o número para ligar.");
                        String numero = scanner.nextLine();
                        iphone.ligar(numero);
                        break;
                    case 2:
                        iphone.iniciarcorreio();
                        break;
                    case 3:
                        iphone.atender();
                        break;
                    case 4:
                        System.out.println("Digite o endereço da pagina.");
                        String url = scanner.nextLine();
                        iphone.exibirPagina(url);
                        break;
                    case 5:
                        iphone.adicionarNovaAba();
                        break;
                    case 6:
                        iphone.atualizarPagina();
                        break;
                    case 7:
                        System.out.println("Digite o nome da musica");
                        String nomeMusica = scanner.nextLine();
                        iphone.selecionaMusica(nomeMusica);
                        break;
                    case 8:
                        iphone.pausar();
                        break;
                    case 9:
                        iphone.parar();
                        break;
                    case 0:
                        sair = true;
                        System.out.println("Desligando o telefone...");
                        Thread.sleep(2000);
                        System.out.println("IPhone desligado");
                        break;

                    default:
                        System.out.println("Opição inválida!");
                }
            Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }

    }
}
