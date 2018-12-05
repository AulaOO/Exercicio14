/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio14;

/**
 *
 * @author Luis Guilherme
 */
public class setorPessoal {
    private Funcionario vet[];
    private int indice;

    public setorPessoal(Funcionario[] vet) {
        this.vet = vet;
        this.indice = 0;
    }

    setorPessoal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void adicionaVetor(Funcionario funcionario){
        for(indice = 0; indice < vet.length; indice ++){
            vet[indice] = funcionario;
        }
    }
    
    public void imprimeFolhaPagamento(){
        for(indice = 0; indice < vet.length; indice ++){
            System.out.println(vet[indice].getNome());
            System.out.println(vet[indice].getSalario());
        }
    }
    
    public float valorTotal(){
        float total = 0;
        for(indice = 0; indice < vet.length; indice ++){
            total = total + vet[indice].getSalario();
        }
        return total;
    }
    
    public String nomeMaiorSalario(){
        float maiorSalario = vet[0].getSalario();
        String nomeMaiorSalario = vet[0].getNome();
        for(indice = 0; indice < vet.length; indice ++){
            if(vet[indice].getSalario() > maiorSalario){
                nomeMaiorSalario = vet[indice].getNome();
                return nomeMaiorSalario;
            }
        }
        return nomeMaiorSalario;
    }
    
    public void funcionariosDoDepartamento(int numero){
        for(indice = 0; indice < vet.length; indice ++){
            if(numero == vet[indice].getDepartamento()){
                System.out.println(vet[indice].getNome());
                System.out.println(vet[indice].getFuncao());
            }
        }
    }
    
    public void pessoasQueExercemFuncao(String funcao){
        for(indice = 0; indice < vet.length; indice ++){
            if(funcao.equals(vet[indice].getFuncao())){
                System.out.println(vet[indice].getNome());
            }
        }
    }
    
}
