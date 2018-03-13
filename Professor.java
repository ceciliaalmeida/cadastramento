package Cadastramento;

import javax.swing.JOptionPane;

/**
 *
 * @author Cecília Almeida
 */
public class Professor extends Pessoa {
    public double valorHoraAula;
    
    public Professor(){
    }
    public int getMatricula(){
        return this.matricula;
    }
    public String getNome(){
        return this.nome;
    }
    public int getQuantidadeCreditoAtual(){
        return this.quantidadeCreditoAtual;
    }
    
    public void cadastrarProfessor(){
        super.cadastrarPessoa();
        valorHoraAula = (double) Integer.parseInt(JOptionPane.showInputDialog("Valor da hora por aula"));
    }
     public void exibirProfessor() {
        JOptionPane.showMessageDialog(null, super.exibirPessoa()
                   + "\nCurso: \t" + valorHoraAula);
}
     
}

