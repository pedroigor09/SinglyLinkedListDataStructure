import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List list = new List();

        int opcao;


        do {

            showMenu();
            opcao = teclado.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("Insira um numero qualquer");
                    Double value = teclado.nextDouble();
                    list.add(value);

                    break;

                case 2:
                    System.out.println(list.toString());

                    break;

                case 3:
                    break;
            }

        }while (opcao != 3);

        teclado.close();
    }


    public static void showMenu(){
        System.out.println("1 - Para inserir um elemento na lista!");
        System.out.println("2 - Para abrir o Menu de elementos!");
        System.out.println("3 - Sair!");

    }
}