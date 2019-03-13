/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Cinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Diretor diretor = new Diretor();
        //diretor.setNome(JOptionPane.showInputDialog(null,"nome do diretor"));
        //diretor.setCpf(JOptionPane.showInputDialog(null,"cpf do diretor"));
        //diretor.setNivel(Integer.parseInt(JOptionPane.showInputDialog(null,"nivel do direotr")));
        
        
        while(JOptionPane.showConfirmDialog(null,"Voce gostaria criar um filme?")==0){
         Filme filminho = new Filme();
        filminho.setTitulo(JOptionPane.showInputDialog(null,"nome do filme"));
        filminho.setDuracao(Integer.parseInt(JOptionPane.showInputDialog(null,"duracao do filme")));
        filminho.setCensura(Integer.parseInt(JOptionPane.showInputDialog(null,"censura do filme")));
        filminho.setGenero(JOptionPane.showInputDialog(null,"genero do filme"));
        filminho.setAno(Integer.parseInt(JOptionPane.showInputDialog(null,"Ano do filme")));
        diretor.setFilme(filminho);
        }
        int i=0;
        while(i<diretor.getFilmes().size()){
            JOptionPane.showMessageDialog(null, "Nome do filme:\n" + diretor.getFilmes().get(i).getTitulo() + "\n Duração:\n" + diretor.getFilmes().get(i).getDuracao());
            i++;
        }
        
        
        
    }
    
}
