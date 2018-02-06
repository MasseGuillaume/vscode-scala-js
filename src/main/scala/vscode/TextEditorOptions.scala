package vscode
import scala.scalajs.js
import js.|

@js.native
trait TextEditorOptions extends js.Object {
  var tabSize: Double | String = js.native
  var insertSpaces: Boolean | String = js.native
  var cursorStyle: TextEditorCursorStyle = js.native
  var lineNumbers: TextEditorLineNumbersStyle = js.native
}