package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class IndexController extends Controller{
	public Result root() {
	    return ok(index.render());
    }
}
