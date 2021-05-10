package br.com.lelecoder.forumdynamo.config;

import br.com.lelecoder.forumdynamo.adapter.persistence.TopicoPortAdapter;
import br.com.lelecoder.forumdynamo.core.ports.in.BuscarRespostaSolucionadora;
import br.com.lelecoder.forumdynamo.core.ports.out.TopicoPort;
import br.com.lelecoder.forumdynamo.core.usecases.BuscarRespostaSolucionadoraImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCreator {

    @Bean
    TopicoPort topicoPort() {
        return new TopicoPortAdapter();
    }

    @Bean
    BuscarRespostaSolucionadora buscarRespostaSolucionadora(TopicoPort topicoPort) {
        return new BuscarRespostaSolucionadoraImpl(topicoPort);
    }
}
