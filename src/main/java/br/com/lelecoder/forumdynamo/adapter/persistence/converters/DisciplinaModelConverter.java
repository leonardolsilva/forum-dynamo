package br.com.lelecoder.forumdynamo.adapter.persistence.converters;

import br.com.lelecoder.forumdynamo.adapter.persistence.model.DisciplinaModel;
import software.amazon.awssdk.enhanced.dynamodb.AttributeConverter;
import software.amazon.awssdk.enhanced.dynamodb.AttributeValueType;
import software.amazon.awssdk.enhanced.dynamodb.EnhancedType;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

public class DisciplinaModelConverter implements AttributeConverter<DisciplinaModel> {
    @Override
    public AttributeValue transformFrom(DisciplinaModel disciplinaModel) {
        return null;
    }

    @Override
    public DisciplinaModel transformTo(AttributeValue attributeValue) {
        return null;
    }

    @Override
    public EnhancedType<DisciplinaModel> type() {
        return null;
    }

    @Override
    public AttributeValueType attributeValueType() {
        return null;
    }
}
