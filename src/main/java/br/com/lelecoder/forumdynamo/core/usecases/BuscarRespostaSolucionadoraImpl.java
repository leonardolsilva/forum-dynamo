package br.com.lelecoder.forumdynamo.core.usecases;

import br.com.lelecoder.forumdynamo.core.domain.Resposta;
import br.com.lelecoder.forumdynamo.core.domain.Topico;
import br.com.lelecoder.forumdynamo.core.exceptions.TopicoNaoEncontradoException;
import br.com.lelecoder.forumdynamo.core.ports.in.BuscarRespostaSolucionadora;
import br.com.lelecoder.forumdynamo.core.ports.out.TopicoPort;

import java.util.Optional;

public class BuscarRespostaSolucionadoraImpl implements BuscarRespostaSolucionadora {

    private TopicoPort topicoPort;

    public BuscarRespostaSolucionadoraImpl(TopicoPort topicoPort) {
        this.topicoPort = topicoPort;
    }

    public BuscarRespostaSolucionadoraImpl() {}

    @Override
    public Optional<Resposta> encontrar(String idTopico) {

        Optional<Topico> optionalTopico = topicoPort.buscar(idTopico);

        if (!optionalTopico.isPresent()) {
            throw new TopicoNaoEncontradoException("Não foi encontrado o tópico " +idTopico);
        }

        return optionalTopico
                .flatMap(Topico::getRespostaSolucionadora);
    }
}
