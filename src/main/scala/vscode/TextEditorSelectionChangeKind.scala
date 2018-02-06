package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait TextEditorSelectionChangeKind extends js.Object {
}
@js.native
@JSGlobal("vscode.TextEditorSelectionChangeKind")
object TextEditorSelectionChangeKind extends js.Object {
  var Keyboard: TextEditorSelectionChangeKind = js.native
  var Mouse: TextEditorSelectionChangeKind = js.native
  var Command: TextEditorSelectionChangeKind = js.native
  @JSBracketAccess
  def apply(value: TextEditorSelectionChangeKind): String = js.native
}