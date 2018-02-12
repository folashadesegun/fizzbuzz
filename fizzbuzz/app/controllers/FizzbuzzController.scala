package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class FizzbuzzController @Inject()(cc: ControllerComponents) extends AbstractController(cc){

  def setUpFizzbuzz(a: Int, b: Int) = {
    val list = a to b
      for(n <- list) yield {
        if(n != 0){
          runFizzbuzz(n)
        }
        else {
          "ERROR: Don't pass in 0"
        }
      }
  }

  def runFizzbuzz(a: Int) = {
    if((a % 3 == 0) && (a % 5 == 0)){
      println("FIZZBUZZ!")
      "FIZZBUZZ!"
    }
    else if(a % 3 == 0){
      println("FIZZ!")
      "FIZZ!"
    }
    else if(a % 5 == 0){
      println("BUZZ!")
      "BUZZ!"
    }
    else {
      println(s"$a")
      s"$a"
    }
  }
}
