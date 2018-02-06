package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait StatusBarAlignment extends js.Object {
}
@js.native
@JSGlobal("vscode.StatusBarAlignment")
object StatusBarAlignment extends js.Object {
  var Left: StatusBarAlignment = js.native
  var Right: StatusBarAlignment = js.native
  @JSBracketAccess
  def apply(value: StatusBarAlignment): String = js.native
}