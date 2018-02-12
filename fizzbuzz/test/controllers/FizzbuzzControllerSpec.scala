package controllers

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.test.Helpers._
import play.api.test._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 *
 * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
 */
class FizzbuzzControllerSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "FizzbuzzController" should {

    "Return '1, 2, FIZZ!' when '3' is passed" in {
      val controller = new FizzbuzzController(stubControllerComponents())

      val result = controller.setUpFizzbuzz(3)

      result mustBe {1, 2, "FIZZ!"}
//      val home = controller.index().apply(FakeRequest(GET, "/"))
//
//      status(home) mustBe OK
//      contentType(home) mustBe Some("text/html")
//      contentAsString(home) must include ("Welcome to Play")
    }
  }
}
