package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait TaskScope extends js.Object
@js.native
@JSGlobal("vscode.TaskScope")
object TaskScope extends js.Object {
  var Global: TaskScope = js.native
  var Workspace: TaskScope = js.native
  @JSBracketAccess
  def apply(value: TaskScope): String = js.native
}