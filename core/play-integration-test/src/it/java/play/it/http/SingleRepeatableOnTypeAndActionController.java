/*
 * Copyright (C) 2009-2019 Lightbend Inc. <https://www.lightbend.com>
 */

package play.it.http;

import play.mvc.Result;
import play.mvc.Results;

import play.it.http.ActionCompositionOrderTest.SomeRepeatable;

@SomeRepeatable // runs two actions
public class SingleRepeatableOnTypeAndActionController extends MockController {

<<<<<<< HEAD
    @SomeRepeatable // again runs two actions
    public Result action() {
        return Results.ok();
    }

=======
  @SomeRepeatable // again runs two actions
  public Result action(Http.Request request) {
    return Results.ok();
  }
>>>>>>> bd30e5f6aa... Java code format for integration tests
}
