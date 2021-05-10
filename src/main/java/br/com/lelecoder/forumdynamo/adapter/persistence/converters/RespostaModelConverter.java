package br.com.lelecoder.forumdynamo.adapter.persistence.converters;

import br.com.lelecoder.forumdynamo.adapter.persistence.model.RespostaModel;
import software.amazon.awssdk.enhanced.dynamodb.AttributeConverter;
import software.amazon.awssdk.enhanced.dynamodb.AttributeValueType;
import software.amazon.awssdk.enhanced.dynamodb.EnhancedType;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

public class RespostaModelConverter implements AttributeConverter<RespostaModel> {
    @Override
    public AttributeValue transformFrom(RespostaModel respostaModel) {
        return null;
    }

    @Override
    public RespostaModel transformTo(AttributeValue attributeValue) {
        return null;
    }

    @Override
    public EnhancedType<RespostaModel> type() {
        return null;
    }

    @Override
    public AttributeValueType attributeValueType() {
        return null;
    }
}
