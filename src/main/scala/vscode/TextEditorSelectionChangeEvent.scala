package vscode
import scala.scalajs.js

@js.native
trait TextEditorSelectionChangeEvent extends js.Object {
  var textEditor: TextEditor = js.native
  var selections: js.Array[Selection] = js.native
  var kind: TextEditorSelectionChangeKind = js.native
}