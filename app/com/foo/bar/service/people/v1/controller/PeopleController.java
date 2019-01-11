package com.foo.bar.service.people.v1.controller;

import play.mvc.Controller;
import play.mvc.Result;

public class PeopleController extends Controller {

    public Result foo() {
        return ok("PeopleController");
    }

}
