package folhadepagamento;

// @author Matheus Machado

// import beans.Aluno;
// import beans.Pessoa;
import beans.Aluno;
import beans.Disciplina;
import beans.Funcionario;
import beans.Horista;
import beans.Matricula;
import beans.Mensalista;
import beans.ProfessorHorista;
import beans.ProfessorMensalista;
 
public class FolhaDePagamento {

    public static void main(String[] args) {

        ProfessorMensalista pm0 = new ProfessorMensalista("doutor", "indeterminado",
                              "diretor", "12345", "academico", "12/09/2019",
                              "12.345.678", "Ana Renata Silva", "anarenata@fatec.sp.gov.br",
                              "12-987654321", "Av Italia, 150, Independencia, Taubaté - SP");
        // System.out.println(pm0);
        
        
        Aluno a0 = new Aluno("12345","ADS","01/02/2020",
                            "19.234.234", "Marco Aurelio Guevara", "ma.guevara@fatec.sp.gov.br",
                            "11-987654321", "Rua Um, 2, Tres, Quatro-5");
       // System.out.println(a0);
        
       Disciplina d0 = new Disciplina("POO", "Programacao orientada a objeto", 4, "ADS", pm0);
       // System.out.println(d0);
       
       Matricula m0 = new Matricula(4325, a0, d0, "23/04/2002");
       System.out.println(m0);
        
    }
    
     
}