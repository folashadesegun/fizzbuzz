package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class FizzbuzzController @Inject()(cc: ControllerComponents) extends AbstractController(cc){

  def setUpFizzbuzz(b: Int) = {
    for (n <- b) {
      println(runFizzbuzz(n))
    }
  }

  def runFizzbuzz(a: Int) = {
    if ((a % 3 == 0) && (a % 5 == 0)) {
      "FIZZBUZZ!"
    }
    else if (a % 3 == 0) {
      "FIZZ!"
    }
    else if (a % 5 == 0) {
      "BUZZ!"
    }
    else {
      s"$a"
    }
  }
}
