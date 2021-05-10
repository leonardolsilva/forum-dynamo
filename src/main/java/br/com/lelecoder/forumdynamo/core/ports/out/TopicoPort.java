package br.com.lelecoder.forumdynamo.core.ports.out;

import br.com.lelecoder.forumdynamo.core.domain.Topico;

import java.util.Optional;

public interface TopicoPort {

    Optional<Topico> buscar(String idTopico);
}
