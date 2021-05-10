package br.com.lelecoder.forumdynamo.adapter.persistence.converters;

import br.com.lelecoder.forumdynamo.adapter.persistence.model.AlunoModel;
import software.amazon.awssdk.enhanced.dynamodb.AttributeConverter;
import software.amazon.awssdk.enhanced.dynamodb.AttributeValueType;
import software.amazon.awssdk.enhanced.dynamodb.EnhancedType;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

public class AlunoModelConverter implements AttributeConverter<AlunoModel> {
    @Override
    public AttributeValue transformFrom(AlunoModel alunoModel) {
        return null;
    }

    @Override
    public AlunoModel transformTo(AttributeValue attributeValue) {
        return null;
    }

    @Override
    public EnhancedType<AlunoModel> type() {
        return null;
    }

    @Override
    public AttributeValueType attributeValueType() {
        return null;
    }
}
