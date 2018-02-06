package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.ShellExecution")
class ShellExecution protected () extends js.Object {
  def this(commandLine: String, options: ShellExecutionOptions ) = this()
  var commandLine: String = js.native
  var options: ShellExecutionOptions = js.native
}