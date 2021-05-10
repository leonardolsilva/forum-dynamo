package br.com.lelecoder.forumdynamo.adapter.web;

import br.com.lelecoder.forumdynamo.adapter.web.dto.RespostaDTO;
import br.com.lelecoder.forumdynamo.adapter.web.mapper.RespostaMapper;
import br.com.lelecoder.forumdynamo.core.domain.Resposta;
import br.com.lelecoder.forumdynamo.core.ports.in.BuscarRespostaSolucionadora;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@NoArgsConstructor
@RequestMapping("/respostas")
public class RespostaController {

    private BuscarRespostaSolucionadora buscarRespostaSolucionadora;

    @GetMapping(value = "/resposta_solucionadora")
    public ResponseEntity<RespostaDTO> buscarRespostaSolucionadora(
            @RequestParam("id_topico") String idTopico
    ) {

        Optional<Resposta> optionalResposta = buscarRespostaSolucionadora.encontrar(idTopico);

        RespostaDTO dtoSaida = RespostaMapper.INSTANCE.respostaToRespostaDTO(optionalResposta.get());

        return new ResponseEntity<>(dtoSaida, HttpStatus.OK);

    }
}
