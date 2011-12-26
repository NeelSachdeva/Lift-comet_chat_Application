package XYZ.comet

import net.liftweb._
import http._
import actor._

/**
 * Created by IntelliJ IDEA.
 * User: nsachdeva
 * Date: 17/11/11
 * Time: 3:51 PM
 * To change this template use File | Settings | File Templates.
 */

object ChatServer extends LiftActor with ListenerManager {
  private var pieces = Vector("The Default Word")

  def createUpdate = pieces

  override def lowPriority = {
    case r: String => pieces :+= r;
    updateListeners()

  }

}

