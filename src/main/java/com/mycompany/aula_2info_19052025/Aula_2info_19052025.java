

package com.mycompany.aula_2info_19052025;

import java.util.ArrayList;


public class Aula_2info_19052025 {

    public static void main(String[] args) {
      int[] dados = new int[10];
      dados[0]= 12;
      dados[1] = 4;
      
        ArrayList<Eleitor> ListaEleitores = new ArrayList<>();
        
        for(int x =0 ; x<10 ; x++)
        {
            Eleitor eleitor = new Eleitor();
            eleitor.setNome("Gilson" + x);
            eleitor.setCpf("1234234");
            eleitor.setTitulo("3423654");
            
            
            ArrayList<Telefone> Listatelefone = new ArrayList<>();
            Telefone tel = new Telefone();
            
            tel.setDdd("51");
            tel.setNumero("" + x);
            tel.setTipotelefone("Comercial");
            Listatelefone.add(tel);
            
            Telefone tel2 = new Telefone();
            
            tel2.setDdd("51");
            tel2.setNumero("64645756");
            tel2.setTipotelefone("Comercial");

            Listatelefone.add(tel2);
            
            eleitor.setTel(Listatelefone);
            
            
            ListaEleitores.add(eleitor);
        } 
        
        //ListaEleitores.remove(4);
        ///  ListaEleitores.removeLast();
        ///
     
        System.out.print(ListaEleitores.get(3).getNome());
        System.out.print(ListaEleitores.get(3).getTel().get(0).getNumero());
       
    }
}
