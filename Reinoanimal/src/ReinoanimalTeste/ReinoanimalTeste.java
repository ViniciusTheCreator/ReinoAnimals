package ReinoanimalTeste;

import Reinoanimal.Aquatico;
import Reinoanimal.Terrestre;
import Reinoanimal.Aereo;
import Reinoanimal.Animal;

import java.time.LocalDate;
/**
 * 
 * @author vinicius
 *
 */
public class ReinoanimalTeste {
    public static void main(String[] args) {
        Aquatico tubarao = new Aquatico("Carcharias taurus", 'F', LocalDate.of(2016, 5, 20), "água salgada", false);
        Aquatico piranha = new Aquatico("Pygocentrus nattereri", 'M', LocalDate.of(2019, 8, 12), "água doce", true);

        Terrestre gato = new Terrestre("Felis catus", 'F', LocalDate.of(2021, 2, 3), "Ásia", true);
        Terrestre capivara = new Terrestre("Hydrochoerus hydrochaeris", 'M', LocalDate.of(2015, 11, 7), "América do Sul", true);

        Aereo urubu = new Aereo("Coragyps atratus", 'M', LocalDate.of(2019, 4, 15), 54.5);
        Aereo papagaio = new Aereo("Amazona aestiva", 'F', LocalDate.of(2013, 7, 10), 37.9);

        System.out.println("Perfil do Tubarão:");
        tubarao.perfil();
        System.out.println("\nPerfil da Piranha:");
        piranha.perfil();

        System.out.println("\nPerfil do Gato:");
        gato.perfil();
        System.out.println("\nPerfil da Capivara:");
        capivara.perfil();

        System.out.println("\nPerfil do Urubu:");
        urubu.perfil();
        System.out.println("\nPerfil do Papagaio:");
        papagaio.perfil();

        System.out.println("\nQuantidade total de animais instanciados: " + Animal.getContador());
    }
}
