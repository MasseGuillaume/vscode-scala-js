package vscode
import scala.scalajs.js

@js.native
trait TextEditorViewColumnChangeEvent extends js.Object {
  var textEditor: TextEditor = js.native
  var viewColumn: ViewColumn = js.native
}