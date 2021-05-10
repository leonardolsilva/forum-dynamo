package br.com.lelecoder.forumdynamo.adapter.web.mapper;

import br.com.lelecoder.forumdynamo.adapter.web.dto.TopicoDTO;
import br.com.lelecoder.forumdynamo.core.domain.Topico;
import org.mapstruct.factory.Mappers;

public interface TopicoMapper {

    TopicoMapper INSTANCE = Mappers.getMapper(TopicoMapper.class);

    TopicoDTO topicoToTopicoDTO(Topico topico);
}
