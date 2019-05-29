//package cn.qyd.webflux.router;
//
//import cn.qyd.webflux.handler.BookHandler;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.web.reactive.function.server.*;
//
///**
// * @Author qyd
// * @Date 19-5-27 下午6:24
// **/
//@Configuration
//public class BookRouter {
//    @Bean
//    public RouterFunction<ServerResponse> routerBook(BookHandler bookHandler) {
//        return RouterFunctions.route(RequestPredicates.GET("/hello")
//                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
//        bookHandler::getOne);
//    }
//}
