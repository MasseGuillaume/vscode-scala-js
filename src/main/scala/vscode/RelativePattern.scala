package vscode
import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal("vscode.RelativePattern")
class RelativePattern protected () extends js.Object {
  def this(base: WorkspaceFolder | String, pattern: String) = this()
  var base: String = js.native
  var pattern: String = js.native
}