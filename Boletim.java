import java.util.ArrayList;

public class Boletim implements IRelatorio{
  protected int trimestre;
  protected int ano;
  protected Aluno aluno;
  protected ArrayList<Avaliacao> avs = new ArrayList<Avaliacao>();

  public Boletim(Aluno aluno){
    this.aluno = aluno;
  }
  
  public Boletim(int trimestre, int ano, Aluno aluno){
    this.trimestre = trimestre;
    this.ano = ano;
    this.aluno = aluno;
  }

  public void setTrimestre(int trimestre){
    this.trimestre = trimestre;
  }

  public int getTrimestre(){
    return trimestre;
  }

  public void setAno(int ano){
    this.ano = ano;
  }

  public int getAno(){
    return ano;
  }

  public void setAluno(Aluno aluno){
    this.aluno = aluno;
  }

  public Aluno getAluno(){
    return aluno;
  }

  public void insereAvaliacao(Avaliacao av){
    avs.add(av);
  }

  public ArrayList<Avaliacao> buscaAvs(){
    return avs;
  }

  public void setAvs(ArrayList<Avaliacao> avs){
    this.avs = avs;
  }
 
  public void exibeSimples(){
    aluno.exibeCompleto();
    for (int i = 0; i < avs.size(); i++){
      System.out.println(avs.get(i).getMateria() + " : " + avs.get(i).getMedia());
    }
  }

  public void exibeCompleto(){
    aluno.exibeCompleto();
    for (int i = 0; i < avs.size(); i++){
      System.out.println(avs.get(i).getMateria() + " : " + avs.get(i).getMedia());
      if (avs.get(i).getParecer() != null){
        System.out.println("Parecer: " + avs.get(i).getParecer());
      }
    }
  }

}