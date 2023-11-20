 package Reinoanimal;

import java.time.LocalDate;
/**
 * 
 * @author vinicius
 *
 */
public class Aquatico extends Animal {
    private String tipoAgua;
    private boolean possuiEscamas;

    public Aquatico(String especie, char sexo, LocalDate dataNascimento, String tipoAgua, boolean possuiEscamas) {
        super(especie, sexo, dataNascimento);
        incrementarContador();
        this.tipoAgua = tipoAgua;
        this.possuiEscamas = possuiEscamas;
    }

    public void comer() {
        System.out.println("O animal aquático está comendo...");
    }

    
    public void perfil() {
        super.perfil(); 
        System.out.println("Tipo de Água: " + tipoAgua);
        System.out.println("Possui Escamas: " + possuiEscamas);
    }

public String getTipoAgua() {
 return tipoAgua;
}

public void setTipoAgua(String tipoAgua) {
 this.tipoAgua = tipoAgua;
}

public boolean isPossuiEscamas() {
 return possuiEscamas;
}

public void setPossuiEscamas(boolean possuiEscamas) {
 this.possuiEscamas = possuiEscamas;
}
}
