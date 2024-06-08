import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = sc.nextInt();

        try{
            contar(parametroUm,parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro ");
        }

    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
            if (parametroUm < parametroDois){
                int contagem = parametroDois-parametroUm;

                for (int i = 1; i < contagem+1; i++) {
                    System.out.printf("Imprimindo o número %d\n", i);
                }
            }
            else {
                throw new ParametrosInvalidosException();
            }
    }
}
