package cn.qyd.webflux.handler;

import org.omg.CORBA.ServerRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @Author qyd
 * @Date 19-5-27 下午6:20
 **/
@Component
public class BookHandler {

    public Mono<ServerResponse> getOne(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("这是一本书"));
    }
}
