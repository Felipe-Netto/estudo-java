package estabelecimento;

import equipamentos.copiadoras.Copiadora;
import equipamentos.copiadoras.Xerox;
import equipamentos.digitalizadoras.Digitalizadora;
import equipamentos.digitalizadoras.Scanner;
import equipamentos.impressoras.Deskjet;
import equipamentos.impressoras.Impressora;
import equipamentos.impressoras.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {

    // inteface - é o meio mais abstrato da POO, uma classe pode implementar várias interfaces, como o EquipamentoMultifuncional
    public static void main(String[] args) {
        Impressora impressoraDj = new Deskjet();
        Impressora impressoraLj = new Laserjet();
        Copiadora copiadoraX = new Xerox();
        Digitalizadora digitalizadoraS = new Scanner();
        EquipamentoMultifuncional equipMulti = new EquipamentoMultifuncional();

        System.out.println("Imprimir");
        impressoraDj.imprimir();
        impressoraLj.imprimir();
        System.out.println();

        System.out.println("Copiar");
        copiadoraX.copiar();
        System.out.println();

        System.out.println("Digitalizar");
        digitalizadoraS.digitalizar();
        System.out.println();

        System.out.println("Equipamento Multifuncional");
        equipMulti.imprimir();
        equipMulti.copiar();
        equipMulti.digitalizar();
        System.out.println();
    }
}
