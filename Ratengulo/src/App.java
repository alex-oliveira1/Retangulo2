import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo r = new Retangulo();
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Calcular área do retângulo");
            System.out.println("2 - Calcular perímetro do retângulo");
            System.out.println("3 - Calcular diagonal do retângulo");
            System.out.println("4 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a base do retângulo: ");
                    double base = sc.nextDouble();
                    r.setBase(base);

                    System.out.print("Digite a altura do retângulo: ");
                    double altura = sc.nextDouble();
                    r.setAltura(altura);

                    System.out.println("A área do retângulo é: " + r.araaRetagulo());
                    break;

                case 2:
                    System.out.print("Digite a base do retângulo: ");
                    base = sc.nextDouble();
                    r.setBase(base);

                    System.out.print("Digite a altura do retângulo: ");
                    altura = sc.nextDouble();
                    r.setAltura(altura);

                    System.out.println("O perímetro do retângulo é: " + r.perimetroRetangulo());
                    break;

                case 3:
                    System.out.print("Digite a base do retângulo: ");
                    base = sc.nextDouble();
                    r.setBase(base);

                    System.out.print("Digite a altura do retângulo: ");
                    altura = sc.nextDouble();
                    r.setAltura(altura);

                    System.out.println("A diagonal do retângulo é: " + r.diagonalRetangulo());
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 4);

        sc.close();
    }
}
