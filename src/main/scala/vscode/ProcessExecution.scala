package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.ProcessExecution")
class ProcessExecution protected () extends js.Object {
  def this(process: String, options: ProcessExecutionOptions ) = this()
  def this(process: String, args: js.Array[String], options: ProcessExecutionOptions ) = this()
  var process: String = js.native
  var args: js.Array[String] = js.native
  var options: ProcessExecutionOptions = js.native
}