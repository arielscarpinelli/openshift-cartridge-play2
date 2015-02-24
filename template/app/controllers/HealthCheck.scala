package controllers

import play.api.libs.json.Json
import play.api.mvc.{ Action, Controller }

object HealthCheck extends Controller {

  def index = Action {
    Ok(Json.obj(
      "healthCheck" -> Json.obj(
        "status" -> "OK",
        "requiredServices" -> Json.arr(),
        "optionalServices" -> Json.arr()
      )
    ))
  }
}
