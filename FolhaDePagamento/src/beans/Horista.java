package beans;

// @author Matheus Machado
 
public class Horista extends Funcionario {
 
       protected double numHorasSemana;
       protected double valorHora;

    public Horista(double numHoras, double valorHora, String matricula, String departamento, String dataMatriculo,
            String RG, String nome, String email, String telefone, String endereco) {
        super(matricula, departamento, dataMatriculo, RG, nome, email, telefone, endereco);
        this.numHorasSemana = numHoras;
        this.valorHora = valorHora;
    }


    public double getNumHorasSemana() {
        return numHorasSemana;
    }

    public void setNumHorasSemana(double numHorasSemana) {
        this.numHorasSemana = numHorasSemana;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcSalarioBruto() {
        return numHorasSemana * valorHora * 4;
    }

    @Override
    public double calcIRRF() {
      return super.calcIRRF();
    }

    @Override
    public String toString() {
        return "Horista{"+ ", matricula: " + matricula + ", departamento: " + departamento +
                  ", dataMatriculo: " + dataMatriculo + 
                  ", salario: " + this.calcSalario() + ", salario bruto: " + this.calcSalarioBruto() +
                  ", INSS: " + this.calcINSS() + 
                  ", IRRF: " + this.calcIRRF() + 
                  ", valor hora: " + valorHora + ", numero de horas semanais: " + numHorasSemana + '}';
    
    }
       
    
}
