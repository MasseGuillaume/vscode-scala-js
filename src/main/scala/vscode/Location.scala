package vscode
import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal("vscode.Location")
class Location protected () extends js.Object {
  def this(uri: Uri, rangeOrPosition: Range | Position) = this()
  var uri: Uri = js.native
  var range: Range = js.native
}