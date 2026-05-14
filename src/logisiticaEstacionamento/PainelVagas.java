package src.logisiticaEstacionamento;

import src.logisiticaEstacionamento.estacionamento.Vaga;

public class PainelVagas {

    public String descreverStatus(Vaga vaga) {
        if (vaga.isOcupada() && vaga.isCoberta()) {
            return "ocupada e coberta";
        }

        if (vaga.isOcupada()) {
            return "ocupada";
        }

        if (vaga.isCoberta()) {
            return "livre e coberta";
        }

        return "livre";
    }
}
