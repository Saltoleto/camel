package com.saltoleto.saltoletocamel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;




@Component
public class MembroRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("quartz2://simpleTimer?cron=0+0-59+0+*+*+?+*")
                .to("sql:{{camel-consulta.membros}}?outputType=SelectList&outputClass=com.saltoleto.saltoletocamel.domain.MembroDTO")
                .routeId("membroProcessor")
                .bean("membroProcessor")
                .log("process row ${body}");

    }
}
