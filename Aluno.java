public class Aluno implements IRelatorio{
    private String matricula;
    private String nome;
    private String curso;

    public Aluno(String matricula , String nome , String curso ){
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getCurso(){
        return curso;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void exibeSimples(){
        System.out.println("Aluno(a): " + nome + " ("+ matricula + ")");
    }
    public void exibeCompleto(){
        System.out.println("Aluno(a):" + nome);
        System.out.println("Matrícula:" + matricula);
        System.out.println("Curso:" + curso);

    }

}
