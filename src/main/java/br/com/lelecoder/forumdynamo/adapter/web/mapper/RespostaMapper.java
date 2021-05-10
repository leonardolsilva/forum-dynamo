package br.com.lelecoder.forumdynamo.adapter.web.mapper;

import br.com.lelecoder.forumdynamo.adapter.web.dto.RespostaDTO;
import br.com.lelecoder.forumdynamo.core.domain.Resposta;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RespostaMapper {

    RespostaMapper INSTANCE = Mappers.getMapper(RespostaMapper.class);

    RespostaDTO respostaToRespostaDTO(Resposta resposta);

}
