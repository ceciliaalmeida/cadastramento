
package Cadastramento;

import javax.swing.JOptionPane;

/**
 *
 * @author Cecília Almeida
 */
public class Pessoa {
    
   public int matricula;
    public String nome;
    public int quantidadeCreditoAtual;
    
    public void cadastrarPessoa(){
        nome = JOptionPane.showInputDialog("Nome");
        matricula = (int) Integer.parseInt(JOptionPane.showInputDialog("Matricula"));
        quantidadeCreditoAtual = (int) Integer.parseInt(JOptionPane.showInputDialog("Quantidade de créditos atual: "));
    }

    
    public String exibirPessoa() {
        String dados = "\nNome: \t" + nome
                + "\nMatricula:\t " + matricula
                + "\nQuantidade de crédito atual: \t" + quantidadeCreditoAtual;
        return dados;
    
}
}