package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait ConfigurationTarget extends js.Object {
}
@js.native
@JSGlobal("vscode.ConfigurationTarget")
object ConfigurationTarget extends js.Object {
  var Global: ConfigurationTarget = js.native
  var Workspace: ConfigurationTarget = js.native
  var WorkspaceFolder: ConfigurationTarget = js.native
  @JSBracketAccess
  def apply(value: ConfigurationTarget): String = js.native
}