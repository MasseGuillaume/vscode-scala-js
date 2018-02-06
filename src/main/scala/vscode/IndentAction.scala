package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait IndentAction extends js.Object {
}
@js.native
@JSGlobal("vscode.IndentAction")
object IndentAction extends js.Object {
  var None: IndentAction = js.native
  var Indent: IndentAction = js.native
  var IndentOutdent: IndentAction = js.native
  var Outdent: IndentAction = js.native
  @JSBracketAccess
  def apply(value: IndentAction): String = js.native
}