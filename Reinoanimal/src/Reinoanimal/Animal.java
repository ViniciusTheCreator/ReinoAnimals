package Reinoanimal;

import java.time.LocalDate;

public class Animal {
    private String especie;
    private char sexo;
    private LocalDate dataNascimento;
    private static int contador = 0;

    public Animal(String especie, char sexo, LocalDate dataNascimento) {
        this.especie = especie;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        incrementarContador();
    }

    public static void incrementarContador() {
        contador++;
    }


    public static int getContador() {
        return contador;
    }

    public void comer() {
        System.out.println("O animal está comendo...");
    }

    public void perfil() {
        System.out.println("Espécie: " + especie);
        System.out.println("Sexo: " + sexo);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }

public String getEspecie() {
 return especie;
}

public void setEspecie(String especie) {
 this.especie = especie;
}

public char getSexo() {
 return sexo;
}

public void setSexo(char sexo) {
 this.sexo = sexo;
}

public LocalDate getDataNascimento() {
 return dataNascimento;
}

public void setDataNascimento(LocalDate dataNascimento) {
 this.dataNascimento = dataNascimento;
}
}
