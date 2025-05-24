
package com.mycompany.aula_2info_19052025;


public class Eleitor extends Pessoa
{
    
    private String titulo;
    private String dta_geracao_titulo;
    private String zona;
    private String secao;


    public String getDta_geracao_titulo() {
        return dta_geracao_titulo;
    }

    public void setDta_geracao_titulo(String dta_geracao_titulo) {
        this.dta_geracao_titulo = dta_geracao_titulo;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    
    
}
