package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait TextEditorLineNumbersStyle extends js.Object {
}
@js.native
@JSGlobal("vscode.TextEditorLineNumbersStyle")
object TextEditorLineNumbersStyle extends js.Object {
  var Off: TextEditorLineNumbersStyle = js.native
  var On: TextEditorLineNumbersStyle = js.native
  var Relative: TextEditorLineNumbersStyle = js.native
  @JSBracketAccess
  def apply(value: TextEditorLineNumbersStyle): String = js.native
}