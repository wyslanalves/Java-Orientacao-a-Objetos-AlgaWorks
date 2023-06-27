package orientacao_a_objetos_02.interfaces.impressao.impressoras;

import orientacao_a_objetos_02.interfaces.Impressora;
import orientacao_a_objetos_02.interfaces.Imprimivel;

public class ImpressoraEpson implements Impressora {

    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println(imprimivel.getCabecalhoPagina());
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println(imprimivel.getCorpoPagina());
        System.out.println();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("==                   EPSON                  ==");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
    }
}
