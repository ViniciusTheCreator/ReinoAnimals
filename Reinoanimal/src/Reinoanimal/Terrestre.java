package Reinoanimal;

import java.time.LocalDate;
/**
 * 
 * @author vinicius
 *
 */
public class Terrestre extends Animal {
    private String regiao;
    private boolean possuiPelagem;

    public Terrestre(String especie, char sexo, LocalDate dataNascimento, String regiao, boolean possuiPelagem) {
        super(especie, sexo, dataNascimento);
        incrementarContador(); 
        this.regiao = regiao;
        this.possuiPelagem = possuiPelagem;
    }

    public void comer() {
        System.out.println("O animal terrestre está comendo...");
    }

    
    public void perfil() {
        super.perfil(); 
        System.out.println("Região: " + regiao);
        System.out.println("Possui Pelagem: " + possuiPelagem);
    }

public String getRegiao() {
 return regiao;
}

public void setRegiao(String regiao) {
 this.regiao = regiao;
}

public boolean isPossuiPelagem() {
 return possuiPelagem;
}

public void setPossuiPelagem(boolean possuiPelagem) {
 this.possuiPelagem = possuiPelagem;
}
}