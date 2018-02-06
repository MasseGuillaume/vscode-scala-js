package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait TextDocumentSaveReason extends js.Object {
}
@js.native
@JSGlobal("vscode.TextDocumentSaveReason")
object TextDocumentSaveReason extends js.Object {
  var Manual: TextDocumentSaveReason = js.native
  var AfterDelay: TextDocumentSaveReason = js.native
  var FocusOut: TextDocumentSaveReason = js.native
  @JSBracketAccess
  def apply(value: TextDocumentSaveReason): String = js.native
}