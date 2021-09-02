 import java.util.Scanner;
public class Utilidades {

    public static void menu(){
        System.out.println("1 - Cadastrar ALUNO");
        System.out.println("2 - Inserir AVALIAÇÃO");
        System.out.println("3 - Gerar BOLETIM PARCIAL");
        System.out.println("4 - Gerar BOLETIM FINAL");
        System.out.println("5 - Listar ALUNOS");
        System.out.println("0 - Sair");
    }
    public static int leOp(){
        int op;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a sua opção: ");
        op = leitor.nextInt();
        return op;

    }
    
}
