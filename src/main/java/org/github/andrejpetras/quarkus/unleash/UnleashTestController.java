package org.github.andrejpetras.quarkus.unleash;

import no.finn.unleash.Unleash;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("unleash")
public class UnleashTestController {

    @Inject
    Unleash unleash;

    @GET
    public Response test() {
        return Response.ok(unleash.isEnabled("quarkus.unleash.test")).build();
    }
}
