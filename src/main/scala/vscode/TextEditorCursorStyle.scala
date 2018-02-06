package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait TextEditorCursorStyle extends js.Object {
}
@js.native
@JSGlobal("vscode.TextEditorCursorStyle")
object TextEditorCursorStyle extends js.Object {
  var Line: TextEditorCursorStyle = js.native
  var Block: TextEditorCursorStyle = js.native
  var Underline: TextEditorCursorStyle = js.native
  var LineThin: TextEditorCursorStyle = js.native
  var BlockOutline: TextEditorCursorStyle = js.native
  var UnderlineThin: TextEditorCursorStyle = js.native
  @JSBracketAccess
  def apply(value: TextEditorCursorStyle): String = js.native
}