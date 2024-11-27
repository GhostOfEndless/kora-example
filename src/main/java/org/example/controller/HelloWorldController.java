package org.example.controller;

import org.example.controller.payload.HelloWorldResponse;
import ru.tinkoff.kora.common.Component;
import ru.tinkoff.kora.http.common.HttpMethod;
import ru.tinkoff.kora.http.common.annotation.HttpRoute;
import ru.tinkoff.kora.http.server.common.annotation.HttpController;
import ru.tinkoff.kora.json.common.annotation.Json;

@Component
@HttpController
public class HelloWorldController {

    @Json
    @HttpRoute(method = HttpMethod.GET, path = "/hello/world")
    public HelloWorldResponse helloWorld() {
        return new HelloWorldResponse("hello World");
    }
}
