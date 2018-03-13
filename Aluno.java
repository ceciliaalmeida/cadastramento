
package Cadastramento;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Cecília Almeida
 */
public class Aluno extends Pessoa {
    public Aluno aluno1;
    public ArrayList<Aluno> listaaluno = new ArrayList<>();
    
    public void cadastrarAluno(){
        super.cadastrarPessoa();
        listaaluno.add(aluno1); 
            
    }
    
    public void exibirAluno(){
         JOptionPane.showMessageDialog(null, super.exibirPessoa());
}

}