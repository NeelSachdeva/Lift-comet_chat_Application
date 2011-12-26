package XYZ.snippet


import net.liftweb._
import http._
import js._
import JsCmds._
import JE._
import XYZ.comet.ChatServer

/**
 * Created by IntelliJ IDEA.
 * User: nsachdeva
 * Date: 17/11/11
 * Time: 3:59 PM
 * To change this template use File | Settings | File Templates.
 */

class ChatIn {

  def render = SHtml.onSubmit(r => {

    ChatServer ! r
    SetValById("chat_in", "")
  })

}