/*
 * Copyright © 2017 Ivar Grimstad (ivar.grimstad@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mvcspec.ozark.test.velocity;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * HelloController test.
 *
 * @author Rodrigo Turini
 */
@Path("hello")
public class HelloController {

    @Inject
    private Models models;

    @GET
    @Controller
    @Produces("text/html")
    @View("hello.vm")
    @Path("v1")
    public void hello(@QueryParam("user") String user) {
        models.put("user", user);
    }

    @GET
    @Controller
    @Produces("text/html")
    @View("hello2.vhtml")
    @Path("v2")
    public void hello2(@QueryParam("user2") String user2) {
        models.put("user2", user2);
    }
}
