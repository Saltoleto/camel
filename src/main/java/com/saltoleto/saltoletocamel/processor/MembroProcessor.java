package com.saltoleto.saltoletocamel.processor;

import com.saltoleto.saltoletocamel.domain.MembroDTO;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MembroProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        List<MembroDTO> teste = exchange.getIn().getBody(ArrayList.class);
        System.out.println(teste);
        exchange.getIn().setBody(teste);
    }
}
