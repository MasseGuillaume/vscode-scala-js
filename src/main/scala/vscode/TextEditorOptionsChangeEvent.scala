package vscode
import scala.scalajs.js

@js.native
trait TextEditorOptionsChangeEvent extends js.Object {
  var textEditor: TextEditor = js.native
  var options: TextEditorOptions = js.native
}