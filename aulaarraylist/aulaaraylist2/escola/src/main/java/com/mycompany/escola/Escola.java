/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escola;

import java.util.ArrayList;

/**
 *
 * @author Oscar Ricardo
 */
public class Escola {

    public static void main(String[] args) {
       
        // instanciar Turma e setar coisas 
        Turma tur = new Turma(); 
        tur.setNameTurma("207");
        tur.setAnoTurma(2025);
        tur.setDateInicioTurma("02/06/2025");
        System.out.println(tur);
        //------------------------------------
        

        //Array Professor config Controler      
        ArrayList <Professor> arrayControleProfessor = new ArrayList <Professor>(); 
        
        //Professor 1 instanciando Professor
        Professor pro = new Professor(); 
        pro.setNomeProfessor("Ricardo");
        pro.setDisciplana("Logica Programacao");
        pro.setIdadeProfessor(65);
        
        //Professor 2       
        Professor pro2 = new Professor(); 
        pro2.setNomeProfessor("Celso");
        pro2.setDisciplana("Banco de Dados Mysql");
        pro2.setIdadeProfessor(92);
        
        // Aqui Adiciona os Professores 1 dentro do Controle
        arrayControleProfessor.add(pro); 
        //Aqui joga dentro do Array Professor 1 dentro da Classe Professor
        pro.setArraylistaprofessores(arrayControleProfessor);
        //---------------------------------------------------------------------
         // Aqui Adiciona os Professores 2 dentro do Controle
        arrayControleProfessor.add(pro2); 
        //Aqui joga dentro do Array Professor 2 dentro da Classe Professor
        pro2.setArraylistaprofessores(arrayControleProfessor);
        
        
        // Chamando as Informações da Turma, Alunos e Professores
        tur.infoTurma();
         
         for (Professor pf: arrayControleProfessor  ) {  // ANotação 
            pf.infoProfessor();                        // Professor ( Classe ) pf ( Identificado ) e ( : ) // na sequencia recebe o arrayList 
            System.out.println("-----");
        }
         
     
        
    }
}
