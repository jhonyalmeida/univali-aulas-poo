package br.univali.web;

import io.javalin.Javalin;

public class WebMain {

    public static void main(String[] args) {
        Javalin app = Javalin.create()
                .get("/", ctx -> ctx.result("Hello World"))
                .start(8081);
    }

}
