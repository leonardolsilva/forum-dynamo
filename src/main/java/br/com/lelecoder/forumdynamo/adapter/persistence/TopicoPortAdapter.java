package br.com.lelecoder.forumdynamo.adapter.persistence;

import br.com.lelecoder.forumdynamo.core.domain.Topico;
import br.com.lelecoder.forumdynamo.core.ports.out.TopicoPort;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;

import java.util.Optional;

public class TopicoPortAdapter implements TopicoPort {

    private DynamoDbEnhancedClient dbEnhancedClient;

    @Override
    public Optional<Topico> buscar(String idTopico) {

        return Optional.empty();
    }

}
