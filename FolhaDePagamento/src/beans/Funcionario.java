package beans;

// @author Matheus Machado

public abstract class Funcionario extends Pessoa implements Empregado {
    
       protected String matricula;
       protected String departamento;
       protected String dataMatriculo;

    public Funcionario(String matricula, String departamento, String dataMatriculo,
            String RG, String nome, String email, String telefone, String endereco) {
        super(RG, nome, email, telefone, endereco);
        this.matricula = matricula;
        this.departamento = departamento;
        this.dataMatriculo = dataMatriculo;
    }

    @Override
    public double calcSalario() {
        double salario = calcSalarioBruto() - calcIRRF();
        return salario - calcINSS();
    }
            
    @Override
    public double calcINSS() {
        
        /*
            Até R$ 1.693,72    8%
            De R$ 1.693,73 a R$ 2.822,90    9%
            De R$ 2.822,91 até R$ 5.645,80    11%
        */
        double salario = this.calcSalarioBruto() - this.calcIRRF();
                
        if(salario <= (float)1693.72)
            return (float)(salario*0.08);
        else
            if(salario <= (float)2822.90)
                return (float)(salario*0.09);
            else
                return (float)(salario*0.11); 
    }

    public double calcIRRF() { 
    
        double salario = this.calcSalarioBruto();
        
        if(salario <= (float)1903.98)
            return (float) 0.0;
        else
            if(salario <= 2826.65)
                return (float)((salario * 0.075) - 142.8);
            else
                if(salario <= 3751.06)
                    return (float)((salario * 0.15) - 354.8);
                else
                    if(salario <= 4664.60)
                        return (float)((salario * 22.50) - 636.13);
                    else 
                        return (float)((salario * 27.50) - 869.36);
        
        
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataMatriculo() {
        return dataMatriculo;
    }

    public void setDataMatriculo(String dataMatriculo) {
        this.dataMatriculo = dataMatriculo;
    }

    @Override
    public String toString() {
        return "Funcionario{"+ ", matricula: " + matricula + ", departamento: " + departamento + ", dataMatriculo: " + dataMatriculo + 
                  ", salario: " + this.calcSalario() + ", salario bruto: " + this.calcSalarioBruto() +
                  ", INSS: " + this.calcINSS() + 
                  ", IRRF: " + this.calcIRRF() + '}';
    }
       
       
       
}
