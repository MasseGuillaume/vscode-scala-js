package vscode
import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal("vscode.Hover")
class Hover protected () extends js.Object {
  def this(contents: MarkedString | js.Array[MarkedString], range: Range ) = this()
  var contents: js.Array[MarkedString] = js.native
  var range: Range = js.native
}