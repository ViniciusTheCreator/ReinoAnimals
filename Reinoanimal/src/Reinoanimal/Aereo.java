package Reinoanimal;

import java.time.LocalDate;

public class Aereo extends Animal {
    private double altitudeVoo;

    public Aereo(String especie, char sexo, LocalDate dataNascimento, double altitudeVoo) {
        super(especie, sexo, dataNascimento);
        incrementarContador(); 
        this.altitudeVoo = altitudeVoo;
    }

   
    public void comer() {
        System.out.println("O animal aéreo está comendo...");
    }

    
    public void perfil() {
        super.perfil(); 
        System.out.println("Altitude de Voo: " + altitudeVoo);
    }

public double getAltitudeVoo() {
 return altitudeVoo;
}

public void setAltitudeVoo(double altitudeVoo) {
 this.altitudeVoo = altitudeVoo;
}
}