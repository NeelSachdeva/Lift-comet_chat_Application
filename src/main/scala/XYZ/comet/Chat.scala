package XYZ.comet

import net.liftweb._
import util._
import http._
import Helpers._

/**
 * Created by IntelliJ IDEA.
 * User: nsachdeva
 * Date: 17/11/11
 * Time: 3:34 PM
 * To change this template use File | Settings | File Templates.
 */

class Chat extends CometActor with CometListener {
  private var pieces: Vector[String] = Vector()

  def registerWith = ChatServer

  override def lowPriority = {
    case q: Vector[String] => pieces = q;
    reRender()
  }

  def render = "li *" #> pieces & ClearClearable

}