package beans;

// * @author Usuario

public class ProfessorMensalista extends Mensalista{
    
    protected String titulo;
    protected String regime;

    public ProfessorMensalista(String titulo, String regime, String cargo, String matricula, String departamento, String dataMatriculo, String RG, String nome, String email, String telefone, String endereco) {
        super("professor", matricula, departamento, dataMatriculo, RG, nome, email, telefone, endereco);
        this.titulo = titulo;
        this.regime = regime;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }
    
    protected double calcValorHora(){
    
        double valorHora = 0;
        if(titulo.equals("especialista"))
            valorHora = 30;
        else if (titulo.equals("mestre"))
            valorHora = 45;
        else if (titulo.equals("doutor"))
            valorHora = 50;
        else
            valorHora = 0;
        
        if(regime.equals("indeterminado"))
            valorHora = valorHora + (valorHora * 0.15);
            
        return valorHora;
        
    }
    
     @Override
    public double calcSalarioBruto() {
        double valorHora = this.calcValorHora();
        return  valorHora * 44;
    }
    
    @Override
    public String toString() {
        return "Professor Menssalista{" + 
                  "matricula: " + matricula + ", departamento: " + departamento +
                  ", titulo: " + titulo + ", regime: " + regime +
                  ", dataMatriculo: " + dataMatriculo + 
                  ", salario: " + this.calcSalario() + ", salario bruto: " + this.calcSalarioBruto() +
                  ", INSS: " + this.calcINSS() + 
                  ", IRRF: " + this.calcIRRF() + 
                   + '}';
    }
    
    
}
