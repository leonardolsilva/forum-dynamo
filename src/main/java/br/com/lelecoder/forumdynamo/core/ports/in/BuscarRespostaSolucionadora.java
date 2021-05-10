package br.com.lelecoder.forumdynamo.core.ports.in;

import br.com.lelecoder.forumdynamo.core.domain.Resposta;

import java.util.Optional;

public interface BuscarRespostaSolucionadora {
    Optional<Resposta> encontrar(String idTopico);
}
