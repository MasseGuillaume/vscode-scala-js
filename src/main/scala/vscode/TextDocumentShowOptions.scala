package vscode
import scala.scalajs.js

@js.native
trait TextDocumentShowOptions extends js.Object {
  var viewColumn: ViewColumn = js.native
  var preserveFocus: Boolean = js.native
  var preview: Boolean = js.native
  var selection: Range = js.native
}