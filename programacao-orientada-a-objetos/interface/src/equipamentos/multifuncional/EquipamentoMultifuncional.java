package equipamentos.multifuncional;

import equipamentos.copiadoras.Copiadora;
import equipamentos.digitalizadoras.Digitalizadora;
import equipamentos.impressoras.Impressora;

// Java não permite herança múltipla
public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora{
    public void imprimir(){
        System.out.println("Imprimindo via Equipamento Multifuncional...");
    }
    public void copiar(){
        System.out.println("Copiando via Equipamento Multifuncional...");
    }
    public void digitalizar(){
        System.out.println("Digitalizando via Equipamento Multifuncional...");
    }
}
