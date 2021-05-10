package br.com.lelecoder.forumdynamo.adapter.persistence.converters;

import br.com.lelecoder.forumdynamo.adapter.persistence.model.TopicoModel;
import software.amazon.awssdk.enhanced.dynamodb.AttributeConverter;
import software.amazon.awssdk.enhanced.dynamodb.AttributeValueType;
import software.amazon.awssdk.enhanced.dynamodb.EnhancedType;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

public class TopicoModelConverter implements AttributeConverter<TopicoModel> {
    @Override
    public AttributeValue transformFrom(TopicoModel topicoModel) {
        return null;
    }

    @Override
    public TopicoModel transformTo(AttributeValue attributeValue) {
        return null;
    }

    @Override
    public EnhancedType<TopicoModel> type() {
        return null;
    }

    @Override
    public AttributeValueType attributeValueType() {
        return null;
    }
}
