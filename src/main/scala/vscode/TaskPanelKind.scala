package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait TaskPanelKind extends js.Object {
}
@js.native
@JSGlobal("vscode.TaskPanelKind")
object TaskPanelKind extends js.Object {
  var Shared: TaskPanelKind = js.native
  var Dedicated: TaskPanelKind = js.native
  var New: TaskPanelKind = js.native
  @JSBracketAccess
  def apply(value: TaskPanelKind): String = js.native
}