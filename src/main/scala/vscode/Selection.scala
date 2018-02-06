package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.Selection")
class Selection protected () extends Range {
  def this(anchor: Position, active: Position) = this()
  def this(anchorLine: Double, anchorCharacter: Double, activeLine: Double, activeCharacter: Double) = this()
  var anchor: Position = js.native
  var active: Position = js.native
  var isReversed: Boolean = js.native
}