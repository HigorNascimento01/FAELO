/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package funcionarios;

/**
 *
 * @author Higor
 */
public class Funcionarios {

    private String matricula;
    private double salario;
    
public String getMatricula(){
    return this.matricula;
    }
    
public double getSalario(){
    return this.salario;
    }
      
public double calculaAjudaCusto(int diasviagem, Double valorDeslocamento) throws ArithmeticException try{
    return (this.salario / 30)*diasviagem+valorDeslocamento;
    }catch (ArithmeticException ae){
    return 0.0;
    }   
    }
        
public Double calculaBonificacao(Double valorVendas){
    if(valorVendas < 25000.00){
    return this.salario * 0.05;
    }else{
    return this.salario * 0.10;
    }
        }


/**
  @author Higor
 * Version 1.0
 * tráz a matricula dos estagiarios, puxa o salario base deles e o possivel salario daquele mes baseado nas notas escolares.
 */


public class estagiarios {
    private String matricula;
    private double salario;
    private double mediaDeNotasDaEscola
    
public String getMatricula(){
    return this.matricula;
    }
public double getSalario(){
    return this.salario;
    }
public double getmediaDeNotasDaEscola(){
    return this.mediaDeNotasDaEscola;
    }
 
public double calcularemuneracao(double valorMediaNotas){
    if(valorMediaNotas <8.00){
    return this.salario-salario+350;
        }
    else{
    return this.salario+150;
}
}
}


/**
  @author Higor
 * Version 1.0
 * tráz o codigo do cliente, a razão social da empresa e o nome fantasia dela. 
 */


        
public class cliente {
    private String cod;
    private String razao;
    private String fantasia;
    
public String getMatricula(){
    return this.cod;
    }
public double getSalario(){
    return this.razao;
    }
}

/**
@author Higor
 * Version 1.0
 * tráz a quantidade de terceirizados na empresa, o tempo que falta de contrato e os codigos. 
 */


public class terceirazados {
    private String quant;
    private String contrato;
    private String cod;
    
public String getMatricula(){
    return this.cod;
    }
    
public double quant ( double total, double casa){
    return total-casa;
        }
  
public double contrato (double tempoTotal, double TempoDecorrido){
if(valorVendas <25000.00){
    return tempoTotal-TempoDecorrido;
}
}
}


/**
  @author Higor
 * Version 1.0
 * puxa a quantidade de vendas total, a media mensal e anual.
 */



public class vendas {
    private double mediamensal;
    private double mediaanual;
    private double vendastotal
            
public String getMatricula(){
    return this.vendastotal;
    }     
    
public double ano (){
    return mediaanual/12;
        }
public double mes (){
    return mediaanual/31;
        }
}

    
        
    
        
        
        
    
