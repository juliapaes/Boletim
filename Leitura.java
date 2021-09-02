import java.util.Scanner;

public class Leitura{
  public static String leNome(){
    String nome;
    Scanner leitor = new Scanner(System.in);
    System.out.println("Informe o nome:");
    nome = leitor.nextLine();
    return nome;
  }
  
  public static String leMatricula(){
    String matricula;
    Scanner leitor = new Scanner(System.in);
    System.out.println("Informe o numero de Matrícula:");
    matricula = leitor.nextLine();
    return matricula;
  }

  public static String leCurso(){
    String curso;
    Scanner leitor = new Scanner(System.in);
    System.out.println("Informe o Curso:");
    curso = leitor.nextLine();
    return curso;
  }
  public static double leMedia(){
    double media;
    Scanner leitor = new Scanner(System.in);
    do{
      System.out.println("Informe a média:");
      media = leitor.nextDouble();
    }while(media<0 || media>10);
    return media;
  }
  public static String leParecer(){
    String parecer;
    Scanner leitor = new Scanner(System.in);
    System.out.println("Informe o parecer:");
    parecer = leitor.nextLine();
    return parecer;
  }
  public static String leMateria(){
    String materia;
    Scanner leitor = new Scanner(System.in);
    System.out.println("Informe a matéria:");
    materia = leitor.nextLine();
    return materia;
  }
  
}