import java.util.Scanner;

public class Main {
    public static class Calculadora {
        static Scanner entrada = new Scanner(System.in);
        Calculadora(){
            while (true){
                int selecao = 0;
                while (selecao != 1 && selecao != 2 && selecao != 3) {
                    System.out.println("---------------------------------");
                    System.out.println("""
                            Digite a opção desejada
                            1 - Calculadora de Figuras Planas
                            2 - Calculadora de Figuras Geométricas
                            3 - Sair
                            """);
                    selecao = entrada.nextInt();
                    switch (selecao) {
                        case (1) -> {
                            CalculadoraPlanas();
                        }
                        case (2) -> {
                            CalculadoraEspaciais();
                        }
                        case (3) -> {
                        }
                        default -> {
                            System.out.println("Digite um valor válido!");
                        }
                    }
                }
                if (selecao == 3){
                    break;
                }
            }
        }
        private static void CalculadoraPlanas(){
            while(true) {
                System.out.println("---------------------------------");
                System.out.println("""
                                        Figuras Planas
                                        1 - Quadrado
                                        2 - Círculo
                                        3 - Triangulo
                                        4 - Retangulo
                                        5 - Hexagono
                                        6 - Sair
                                        """);
                int opcao = Calculadora.entrada.nextInt();
                switch (opcao) {
                    case (1) -> {
                        while (true) {
                            try {
                                System.out.println("Digite o valor do Lado em centímetros: \n");
                                double lado = Calculadora.entrada.nextDouble();
                                Quadrado q1 = new Quadrado(lado);
                                System.out.printf("Perímetro: %.2fcm\n", q1.calculaPerimetro());
                                System.out.printf("Área: %.2fcm²\n", q1.calculaArea());
                                break;
                            } catch (Exception e) {
                                System.out.println("Digite um número");
                                Calculadora.entrada.nextLine();
                            }
                        }
                    }
                    case (2) -> {
                        while (true) {
                            try {
                                System.out.println("Digite o valor do Raio em centímetros: \n");
                                double raio = Calculadora.entrada.nextDouble();
                                Circulo c1 = new Circulo(raio);
                                System.out.printf("Perímetro: %.2fcm\n", c1.calculaPerimetro());
                                System.out.printf("Área: %.2fcm²\n", c1.calculaArea());
                                break;
                            } catch (Exception e) {
                                System.out.println("Digite um número");
                                Calculadora.entrada.nextLine();
                            }
                        }
                    }
                    case (3) -> {
                        while (true) {
                            try {
                                System.out.println("Digite o valor do Base em centímetros: \n");
                                double base = Calculadora.entrada.nextDouble();
                                System.out.println("Digite o valor do Altura em centímetros: \n");
                                double altura = Calculadora.entrada.nextDouble();
                                System.out.println("Digite o valor do Lado 1 em centímetros: \n");
                                double lado1 = Calculadora.entrada.nextDouble();
                                System.out.println("Digite o valor do Lado 2 em centímetros: \n");
                                double lado2 = Calculadora.entrada.nextDouble();
                                System.out.println("Digite o valor do LAdo 3 em centímetros: \n");
                                double lado3 = Calculadora.entrada.nextDouble();

                                Triangulo t1 = new Triangulo(base, altura, lado1, lado2, lado3);
                                System.out.printf("Perímetro: %.2fcm\n", t1.calculaPerimetro());
                                System.out.printf("Área: %.2fcm²\n", t1.calculaArea());
                                break;
                            } catch (Exception e) {
                                System.out.println("Digite um número");
                                Calculadora.entrada.nextLine();
                            }
                        }
                    }
                    case (4) -> {
                        while (true) {
                            try {
                                System.out.println("Digite o valor do Comprímento em centímetros: \n");
                                double comprimento = Calculadora.entrada.nextDouble();
                                System.out.println("Digite o valor do Largura em centímetros: \n");
                                double largura = Calculadora.entrada.nextDouble();

                                Retangulo r1 = new Retangulo(comprimento, largura);
                                System.out.printf("Perímetro: %.2fcm\n", r1.calculaPerimetro());
                                System.out.printf("Área: %.2fcm²\n", r1.calculaArea());
                                break;
                            } catch (Exception e) {
                                System.out.println("Digite um número");
                                Calculadora.entrada.nextLine();
                            }
                        }
                    }
                    case (5) -> {
                        while (true) {
                            try {
                                System.out.println("Digite o valor do Lado em centímetros: \n");
                                double lado = Calculadora.entrada.nextDouble();

                                Hexagono h1 = new Hexagono(lado);
                                System.out.printf("Perímetro: %.2fcm\n", h1.calculaPerimetro());
                                System.out.printf("Área: %.2fcm²\n", h1.calculaArea());
                                break;
                            } catch (Exception e) {
                                System.out.println("Digite um número");
                                Calculadora.entrada.nextLine();
                            }
                        }
                    }
                    case (6) -> {
                    }
                    default -> {
                        System.out.println("Digite um valor válido!");
                    }
                }
                if (opcao == 6){
                    break;
                }
            }

        }
        private static void CalculadoraEspaciais(){
            while (true){
                System.out.println("---------------------------------");
                System.out.println("""
                                    Figuras Espaciais
                                    1 - Cubo
                                    2 - Paralelepípeddo
                                    3 - Piramide de Base Quadrado
                                    4 - Esfera
                                    5 - Cilindro
                                    6 - Cone
                                    7 - Sair
                                    """);
                int opcao = entrada.nextInt();
                switch(opcao){
                    case (1):{
                        while (true) {
                            try {
                                System.out.println("Digite o valor da Aresta em centímetros: \n");
                                double aresta = Calculadora.entrada.nextDouble();

                                Cubo c1 = new Cubo(aresta);
                                System.out.printf("Volume: %.2fcm\n", c1.calculaVolume());
                                System.out.printf("Área: %.2fcm²\n", c1.calculaArea());
                                break;
                            } catch (Exception e) {
                                System.out.println("Digite um número");
                                Calculadora.entrada.nextLine();
                            }
                        }
                    }
                    case (2):{
                        while (true) {
                            try {
                                System.out.println("Digite o valor da Aresta 1 em centímetros: \n");
                                double aresta1 = Calculadora.entrada.nextDouble();
                                System.out.println("Digite o valor da Aresta 2 em centímetros: \n");
                                double aresta2 = Calculadora.entrada.nextDouble();
                                System.out.println("Digite o valor da Aresta 3 em centímetros: \n");
                                double aresta3 = Calculadora.entrada.nextDouble();

                                Paralelepipedo p1 = new Paralelepipedo(aresta1, aresta2, aresta3);
                                System.out.printf("Volume: %.2fcm\n", p1.calculaVolume());
                                System.out.printf("Área: %.2fcm²\n", p1.calculaArea());
                                break;
                            } catch (Exception e) {
                                System.out.println("Digite um número");
                                Calculadora.entrada.nextLine();
                            }
                        }
                    }
                    case (3):{

                    }
                    case (4):{

                    }
                    case (5):{

                    }
                    case (6):{

                    }
                    case (7):{

                    }
                    default:{

                    }
                }
            }
        }
    }
}
