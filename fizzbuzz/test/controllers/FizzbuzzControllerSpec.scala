package controllers

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.test.Helpers._
import play.api.test._

class FizzbuzzControllerSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "FizzbuzzController" should {
    //setup
    val controller = new FizzbuzzController(stubControllerComponents())

    "Return '1, 2, FIZZ!' when '1 and 3' are passed" in {
      //execute
      val result = controller.setUpFizzbuzz(1, 3)

      //assertions
      result mustBe List("1", "2", "FIZZ!")
    }

    "Return '1, 2 , FIZZ!, 4 , BUZZ!' when '1 and 5' are passed in" in {
      //execute
      val result = controller.setUpFizzbuzz(1, 5)

      //assertions
      result mustBe List("1", "2", "FIZZ!", "4", "BUZZ!")
    }

    "Return error message when '0, 0' are passed in" in {
      //execute
      val result = controller.setUpFizzbuzz(0, 0)

      //assertions
      result mustBe List("ERROR: Don't pass in 0")
    }

    "Return length of 100 and 'FIZZBUZZ!' as 15th value in list when '1 and 100' are passed" in {
      //execute
      val result = controller.setUpFizzbuzz(1, 100)

      //assertions
      result.length mustBe 100
      result.indexOf("FIZZBUZZ!") mustBe 14
    }
  }
}
