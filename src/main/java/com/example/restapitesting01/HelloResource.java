package com.example.restapitesting01;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello()

     {
        return "Hello, World!";
     }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/test01")
    public Response test01()
    {
        String x = "{\"menu\": {\"popup\": \"sample\"}}";
        return Response.ok()
                .entity(x)
//               .header("Access-Control-Allow-Origin", "http://127.0.0.1:5500")
//                .header("Access-Control-Allow-Credentials", "true")S
//                .header("Access-Control-Allow-Headers",
//                        "origin, content-type, accept, authorization")
//                .header("Access-Control-Allow-Methods",
//                        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .build();
    }
}