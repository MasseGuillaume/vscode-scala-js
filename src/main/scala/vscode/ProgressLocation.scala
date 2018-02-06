package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait ProgressLocation extends js.Object {
}
@js.native
@JSGlobal("vscode.ProgressLocation")
object ProgressLocation extends js.Object {
  var SourceControl: ProgressLocation = js.native
  var Window: ProgressLocation = js.native
  @JSBracketAccess
  def apply(value: ProgressLocation): String = js.native
}