package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.TaskGroup")
class TaskGroup extends js.Object {
}
@js.native
@JSGlobal("vscode.TaskGroup")
object TaskGroup extends js.Object {
  var Clean: TaskGroup = js.native
  var Build: TaskGroup = js.native
  var Rebuild: TaskGroup = js.native
  var Test: TaskGroup = js.native
}