package br.com.lelecoder.forumdynamo.adapter.persistence;

import br.com.lelecoder.forumdynamo.adapter.persistence.mapper.TopicoModelMapper;
import br.com.lelecoder.forumdynamo.adapter.persistence.mapper.TopicoModelMapperImpl;
import br.com.lelecoder.forumdynamo.adapter.persistence.model.TopicoModel;
import br.com.lelecoder.forumdynamo.core.domain.SituacaoTopico;
import br.com.lelecoder.forumdynamo.core.domain.Topico;
import br.com.lelecoder.forumdynamo.core.ports.out.TopicoPort;
import lombok.extern.slf4j.Slf4j;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.Key;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;
import software.amazon.awssdk.services.dynamodb.model.DynamoDbException;

import java.util.Optional;

@Slf4j
public class TopicoPortAdapter implements TopicoPort {

    private static final String NOME_TABELA = "forum_table";
    private final DynamoDbEnhancedClient dbEnhancedClient;
    private final TopicoModelMapper mapper = new TopicoModelMapperImpl();

    public TopicoPortAdapter(DynamoDbEnhancedClient dbEnhancedClient) {
        this.dbEnhancedClient = dbEnhancedClient;
    }

    @Override
    public Optional<Topico> buscar(String idTopico) {

        DynamoDbTable<TopicoModel> mappedTable = dbEnhancedClient.table(NOME_TABELA, TableSchema.fromBean(TopicoModel.class));

        Key key = Key
                .builder()
                .partitionValue(idTopico)
                .sortValue(SituacaoTopico.NAO_SOLUCIONADO.toString())
                .build();

        try {
            Optional<TopicoModel> optionalTopicoModel = Optional.ofNullable(mappedTable.getItem(key));

            return optionalTopicoModel
                    .map(mapper::modelToDominio);

        } catch (DynamoDbException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

}
