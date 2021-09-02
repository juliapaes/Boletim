public class BoletimFinal extends Boletim{
  private double mediaGlobal;
  private String resultado;

  public BoletimFinal(int trimestre, int ano, Aluno aluno){
    super(trimestre,ano,aluno);
  }

  public double getMediaGlobal(){
    return mediaGlobal;
  }

  public String getResultado(){
    return resultado;
  }

  //calculaMediaGlobal 
  public void calculaMediaGlobal(){
    double media = 0;
    for(int i = 0; i<avs.size(); i++){
      media = media + avs.get(i).getMedia();
    }
    mediaGlobal = media/avs.size();
  }

  //defineResultado
  public void defineResultado(){
    int aux = 1; //se 1 = aprovado, se 0 reprovado
    for(int i = 0; i <avs.size(); i++){
      if (avs.get(i).getMedia() < 6.0){
        aux = 0;
      }
    }
    if (aux==0)
      resultado = "Reprovado";
    else resultado = "Aprovado";
  }

  //exibeSimples - polimorfismo do tipo sobreposição
  public void exibeSimples(){
    aluno.exibeCompleto();
    for (int i = 0; i < avs.size(); i++){
      System.out.println(avs.get(i).getMateria() + " : " + avs.get(i).getMedia());
    }
    System.out.println("Média Global: " + mediaGlobal + " - " + resultado);
  }

  //exibeCompleto - polimorfimo do tipo sobreposição + parecer
  public void exibeCompleto(){
    aluno.exibeCompleto();
    for (int i = 0; i < avs.size(); i++){
      System.out.println(avs.get(i).getMateria() + " : " + avs.get(i).getMedia());
      if (avs.get(i).getParecer() != null){
        System.out.println("Parecer: " + avs.get(i).getParecer());
      }
    }
    System.out.println("Média Global: " + mediaGlobal + " - " + resultado);
  }
}