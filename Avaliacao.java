public class Avaliacao {
    private String materia;
    private String parecer;
    private double media;

    public Avaliacao(String materia, double media){
        this.materia = materia;
        this.media = media;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
    public String getMateria(){
        return materia;
    }
    public void setMedia(double media){
        this.media = media;
    }
    public double getMedia(){
        return media;
    }
    public void setParecer(String parecer){
        this.parecer = parecer;
    }
    public String getParecer(){
        return parecer;
    }
    
}
