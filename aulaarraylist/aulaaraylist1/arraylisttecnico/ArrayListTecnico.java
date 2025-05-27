/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylisttecnico;

import java.util.ArrayList;

/**
 *
 * @author Oscar Ricardo
 */
public class ArrayListTecnico {

    public static void main(String[] args) {
       
       MedicamentodoCoracao medicam = new MedicamentodoCoracao(); 
       
       
       medicam.setNome("Losartana Potassica");
       medicam.setDosagem(50.0);
       medicam.setEfeitos("Reducao da pressao arterial, prevencao de AVCs e protecao renal em pacientes com diabetes tipo 2");
       medicam.setIndicação("Hipertensao arterial, insuficiencia cardiaca e protecao cardiovascular");
       medicam.setTecnico("Dr Joao da Silva - CRM 123456 SP");
       medicam.setPrescricao("Uso adulto Tomar 1 comprimido por via oral uma vez ao dia conforme orientacao medica");
       medicam.setLote(123456789);
       medicam.setDataValidade("2026-03-15");
       
       MedicamentodoCoracao medicam2 = new MedicamentodoCoracao(); 
              
        medicam2.setNome("Atenolol");
        medicam2.setDosagem(100.0);
        medicam2.setEfeitos("Diminuicao da frequencia cardiaca e da pressao arterial");
        medicam2.setIndicação("Hipertensao angina pectoris e arritmias cardiacas");
        medicam2.setTecnico("Dra Maria Oliveira - CRM 987654 SP");
        medicam2.setPrescricao("Uso adulto Tomar 1 comprimido por via oral duas vezes ao dia conforme orientacao medica");
        medicam2.setLote(987654321);
        medicam2.setDataValidade("2027-12-31");
        
        MedicamentodoCoracao medicam3 = new MedicamentodoCoracao();
        medicam3.setNome("Enalapril");
        medicam3.setDosagem(20.0);
        medicam3.setEfeitos("Vasodilatacao, reducao da pressao arterial e melhora da funcao cardiaca");
        medicam3.setIndicação("Hipertensao e insuficiencia cardiaca congestiva");
        medicam3.setTecnico("Dr Carlos Mendes - CRM 123789 SP");
        medicam3.setPrescricao("Tomar 1 comprimido de 20mg por via oral uma vez ao dia");
        medicam3.setLote(345678912);
        medicam3.setDataValidade("2026-11-10");

        MedicamentodoCoracao medicam4 = new MedicamentodoCoracao();
        medicam4.setNome("Captopril");
        medicam4.setDosagem(25.0);
        medicam4.setEfeitos("Reducao da pressao arterial e alivio da sobrecarga cardiaca");
        medicam4.setIndicação("Hipertensao e insuficiencia cardiaca");
        medicam4.setTecnico("Dra Fernanda Souza - CRM 456123 SP");
        medicam4.setPrescricao("Tomar meio comprimido a cada 8 horas conforme orientacao medica");
        medicam4.setLote(234567891);
        medicam4.setDataValidade("2027-05-20");

        MedicamentodoCoracao medicam5 = new MedicamentodoCoracao();
        medicam5.setNome("Amiodarona");
        medicam5.setDosagem(200.0);
        medicam5.setEfeitos("Controle de arritmias ventriculares e supraventriculares");
        medicam5.setIndicação("Arritmias cardiacas graves");
        medicam5.setTecnico("Dr Julio Cesar - CRM 654321 SP");
        medicam5.setPrescricao("Tomar 1 comprimido diariamente apos as refeicoes");
        medicam5.setLote(567891234);
        medicam5.setDataValidade("2028-01-15");

        MedicamentodoCoracao medicam6 = new MedicamentodoCoracao();
        medicam6.setNome("Propranolol");
        medicam6.setDosagem(40.0);
        medicam6.setEfeitos("Diminui a frequencia cardiaca e a pressao arterial");
        medicam6.setIndicação("Hipertensao, tremores e ansiedade");
        medicam6.setTecnico("Dra Renata Lima - CRM 789456 SP");
        medicam6.setPrescricao("Tomar 1 comprimido duas vezes ao dia conforme orientacao medica");
        medicam6.setLote(123789456);
        medicam6.setDataValidade("2026-08-30");

        MedicamentodoCoracao medicam7 = new MedicamentodoCoracao();
        medicam7.setNome("Furosemida");
        medicam7.setDosagem(40.0);
        medicam7.setEfeitos("Diuretico que reduz o volume sanguineo e a pressao arterial");
        medicam7.setIndicação("Edema e hipertensao arterial");
        medicam7.setTecnico("Dr Marcos Rocha - CRM 852963 SP");
        medicam7.setPrescricao("Tomar 1 comprimido ao dia pela manha");
        medicam7.setLote(321654987);
        medicam7.setDataValidade("2025-12-01");

        MedicamentodoCoracao medicam8 = new MedicamentodoCoracao();
        medicam8.setNome("Espironolactona");
        medicam8.setDosagem(25.0);
        medicam8.setEfeitos("Economiza potassio e reduz a retencao de liquidos");
        medicam8.setIndicação("Insuficiencia cardiaca e hipertensao");
        medicam8.setTecnico("Dra Paula Mendes - CRM 963852 SP");
        medicam8.setPrescricao("Tomar 1 comprimido por dia apos o almoco");
        medicam8.setLote(741258963);
        medicam8.setDataValidade("2027-07-14");

        MedicamentodoCoracao medicam9 = new MedicamentodoCoracao();
        medicam9.setNome("Digoxina");
        medicam9.setDosagem(0.25);
        medicam9.setEfeitos("Aumenta a forca de contracao do coracao");
        medicam9.setIndicação("Insuficiencia cardiaca e fibrilacao atrial");
        medicam9.setTecnico("Dr Eduardo Lima - CRM 147258 SP");
        medicam9.setPrescricao("Tomar 1 comprimido ao dia em jejum");
        medicam9.setLote(963147852);
        medicam9.setDataValidade("2028-03-22");

        MedicamentodoCoracao medicam10 = new MedicamentodoCoracao();
        medicam10.setNome("Clortalidona");
        medicam10.setDosagem(25.0);
        medicam10.setEfeitos("Diuretico que reduz a pressao arterial e edema");
        medicam10.setIndicação("Hipertensao e retencao de liquidos");
        medicam10.setTecnico("Dra Juliana Ferreira - CRM 369258 SP");
        medicam10.setPrescricao("Tomar 1 comprimido ao dia pela manha");
        medicam10.setLote(258963741);
        medicam10.setDataValidade("2026-09-09");

        ArrayList <Medicamento> ListaRemedios = new ArrayList<Medicamento>();
        
        ListaRemedios.add(medicam); 
        ListaRemedios.add(medicam2); 
        ListaRemedios.add(medicam3);
        ListaRemedios.add(medicam4);
        ListaRemedios.add(medicam5);
        ListaRemedios.add(medicam6);
        ListaRemedios.add(medicam7);
        ListaRemedios.add(medicam8);
        ListaRemedios.add(medicam9);
        ListaRemedios.add(medicam10);
        
        medicam.setListaREMEDIOS(ListaRemedios); 
        System.out.println(ListaRemedios);
        
       for (Medicamento m : ListaRemedios) {
        m.inf();
        System.out.println("--------");
}
        
    }
}
