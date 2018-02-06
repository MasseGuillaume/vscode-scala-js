package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.TextEdit")
class TextEdit protected () extends js.Object {
  def this(range: Range, newText: String) = this()
  var range: Range = js.native
  var newText: String = js.native
  var newEol: EndOfLine = js.native
}
@js.native
@JSGlobal("vscode.TextEdit")
object TextEdit extends js.Object {
  def replace(range: Range, newText: String): TextEdit = js.native
  def insert(position: Position, newText: String): TextEdit = js.native
  def delete(range: Range): TextEdit = js.native
  def setEndOfLine(eol: EndOfLine): TextEdit = js.native
}