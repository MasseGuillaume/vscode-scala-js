package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait EndOfLine extends js.Object {
}
@js.native
@JSGlobal("vscode.EndOfLine")
object EndOfLine extends js.Object {
  var LF: EndOfLine = js.native
  var CRLF: EndOfLine = js.native
  @JSBracketAccess
  def apply(value: EndOfLine): String = js.native
}