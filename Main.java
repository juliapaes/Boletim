
  import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int f;
    ArrayList<Aluno> turma = new ArrayList<Aluno>();
    ArrayList<Boletim> b = new ArrayList<Boletim>();

    do{
      Utilidades.menu();
      f = Utilidades.leOp();
      switch(f){
        case 1 : String n,m,c;
                 n = Leitura.leNome();
                 m = Leitura.leMatricula();
                 c = Leitura.leCurso();
                 Aluno a = new Aluno(m,n,c);
                 turma.add(a);
                 b.add(new Boletim(a));
                 //leitura e atualização do ano e trimestre do Boletim
                 System.out.println("Qual o trimestre de avaliação: ");
                 int tri = leitor.nextInt();
                 System.out.println("Qual o ano da avaliação: ");
                 int ano = leitor.nextInt();
                 b.get(b.size()-1).setTrimestre(tri);
                 b.get(b.size()-1).setAno(ano);
                 // --------------------------------------------------
                 System.out.println("Aluno cadastrado com sucesso!");
                 break;
        case 2 : if (turma.size() ==0 ){
                    System.out.println("Não há alunos cadastrados!");
                 }else{
                   for(int i = 0; i<b.size();i++){
                     System.out.printf("%d - ", i+1);
                     b.get(i).getAluno().exibeSimples();
                   }
                   int cod;
                   System.out.println("Informe o código do aluno para inserir a avaliação: ");
                   cod = leitor.nextInt(); //índice do boletim a ter a avaliação inserida
                   
                   String mat;
                   double med;
                   mat = Leitura.leMateria();
                   med = Leitura.leMedia();
                   Avaliacao av = new Avaliacao(mat,med);
                   b.get(cod-1).insereAvaliacao(av);  
                   System.out.println("Avaliação inserida com sucesso!");
                 }
                 break;
        case 3 : if (turma.size() ==0 ){
                    System.out.println("Não há alunos cadastrados!");
                 }else{
                   for(int i = 0; i<b.size();i++){
                     System.out.printf("--- BOLETIM PARCIAL ---\n");
                     b.get(i).exibeSimples();
                     System.out.printf("\n");
                   }
                 }
                 break;
        case 4 : if (turma.size() ==0 ){
          System.out.println("Não há alunos cadastrados!");
       }else{
         for(int i = 0; i<b.size();i++){
           BoletimFinal bf = new BoletimFinal(b.get(i).getTrimestre(),b.get(i).getAno(),b.get(i).getAluno()); 
           System.out.printf("--- BOLETIM FINAL ---\n");
           
           System.out.printf("\n");
         }
       }
                 break;
        case 5 : if (turma.size() ==0 ){
                    System.out.println("Não há alunos cadastrados!");
                 }else{
                   for(int i = 0; i<turma.size();i++){
                    System.out.println("---- Lista de Alunos ----");
                     turma.get(i).exibeCompleto();
                     System.out.println();
                     
                   }
                 }
                 break;
        case 0 : System.out.println("Encerrando ...");
                 break;
        default : System.out.println("Opção inválida!");
      }
      System.out.printf("\n\n");
    }while (f != 0);
  }
} 
    
