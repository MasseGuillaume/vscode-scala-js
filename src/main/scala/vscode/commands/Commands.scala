package vscode.commands
import scala.scalajs.js
import js.annotation._
import js.|
import vscode._

@js.native
@JSGlobal("vscode.commands")
object Commands extends js.Object {
  def registerCommand(command: String, callback: js.Function, thisArg: js.Any ): Disposable = js.native
  def registerTextEditorCommand(command: String, callback: js.Function, thisArg: js.Any ): Disposable = js.native
  def executeCommand[T](command: String, rest: js.Any*): Thenable[T | Unit] = js.native
  def getCommands(filterInternal: Boolean ): Thenable[js.Array[String]] = js.native
}