package aula1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //List<Pessoa> arvoreG = new ArrayList();
        Pessoa[] arvore = new Pessoa[10];
        arvore[0] = new Pessoa("João");
        arvore[1] = new Pessoa("Odete");
        arvore[2] = new Pessoa("Silvana", 48);
        arvore[3] = new Pessoa("Edilson", 50, arvore[1], arvore[0]);
        arvore[4] = new Pessoa("Mateus", 21, arvore[2], arvore[3]);
        arvore[5] = new Pessoa("Miguel", 10, arvore[2], arvore[3]);
        //System.out.println(arvore[4].getNome() + " ==> Mãe " + arvore[4].getMae().getNome() + " & Pai " + arvore[4].getPai().getNome());
        System.out.println(arvore[4].nomeIrmaos());
    }
    
}
