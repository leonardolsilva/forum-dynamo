package br.com.lelecoder.forumdynamo.adapter.persistence.converters;

import br.com.lelecoder.forumdynamo.adapter.persistence.model.RespostaModel;
import software.amazon.awssdk.enhanced.dynamodb.AttributeConverter;
import software.amazon.awssdk.enhanced.dynamodb.AttributeValueType;
import software.amazon.awssdk.enhanced.dynamodb.EnhancedType;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

import java.util.List;

public class ListRespostaModelConverter implements AttributeConverter<List<RespostaModel>> {
    @Override
    public AttributeValue transformFrom(List<RespostaModel> respostaModels) {
        return null;
    }

    @Override
    public List<RespostaModel> transformTo(AttributeValue attributeValue) {
        return null;
    }

    @Override
    public EnhancedType<List<RespostaModel>> type() {
        return null;
    }

    @Override
    public AttributeValueType attributeValueType() {
        return null;
    }
}
