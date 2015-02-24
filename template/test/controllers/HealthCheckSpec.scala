import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import play.api.libs.json.Json
import play.api.test.Helpers._
import play.api.test.{ FakeRequest, WithApplication }

@RunWith(classOf[JUnitRunner])
class HealthCheckSpec extends Specification {

  "HealthCheck" should {

    "render the index page" in new WithApplication {
      val healthCheck = route(FakeRequest(GET, "/")).get

      status(healthCheck) must equalTo(OK)
      contentType(healthCheck) must beSome.which(_ == "application/json")
      contentAsJson(healthCheck) must beEqualTo(Json.obj(
        "healthCheck" -> Json.obj(
          "status" -> "OK",
          "requiredServices" -> Json.arr(),
          "optionalServices" -> Json.arr()
        )
      ))
    }

    "render the health check page" in new WithApplication {
      val healthCheck = route(FakeRequest(GET, "/health-check")).get

      status(healthCheck) must equalTo(OK)
      contentType(healthCheck) must beSome.which(_ == "application/json")
      contentAsJson(healthCheck) must beEqualTo(Json.obj(
        "healthCheck" -> Json.obj(
          "status" -> "OK",
          "requiredServices" -> Json.arr(),
          "optionalServices" -> Json.arr()
        )
      ))
    }
  }
}
