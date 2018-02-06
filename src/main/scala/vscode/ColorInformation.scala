package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.ColorInformation")
class ColorInformation protected () extends js.Object {
  def this(range: Range, color: Color) = this()
  var range: Range = js.native
  var color: Color = js.native
}