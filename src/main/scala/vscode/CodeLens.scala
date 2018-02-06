package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.CodeLens")
class CodeLens protected () extends js.Object {
  def this(range: Range, command: Command ) = this()
  var range: Range = js.native
  var command: Command = js.native
  def isResolved: Boolean = js.native
}