package vscode
import scala.scalajs.js
import js.|

@js.native
trait TextEditorEdit extends js.Object {
  def replace(location: Position | Range | Selection, value: String): Unit = js.native
  def insert(location: Position, value: String): Unit = js.native
  def delete(location: Range | Selection): Unit = js.native
  def setEndOfLine(endOfLine: EndOfLine): Unit = js.native
}