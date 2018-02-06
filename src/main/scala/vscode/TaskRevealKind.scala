package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait TaskRevealKind extends js.Object {
}
@js.native
@JSGlobal("vscode.TaskRevealKind")
object TaskRevealKind extends js.Object {
  var Always: TaskRevealKind = js.native
  var Silent: TaskRevealKind = js.native
  var Never: TaskRevealKind = js.native
  @JSBracketAccess
  def apply(value: TaskRevealKind): String = js.native
}