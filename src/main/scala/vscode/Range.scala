package vscode
import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal("vscode.Range")
class Range protected () extends js.Object {
  def this(start: Position, end: Position) = this()
  def this(startLine: Double, startCharacter: Double, endLine: Double, endCharacter: Double) = this()
  def start: Position = js.native
  def end: Position = js.native
  var isEmpty: Boolean = js.native
  var isSingleLine: Boolean = js.native
  def contains(positionOrRange: Position | Range): Boolean = js.native
  def isEqual(other: Range): Boolean = js.native
  def intersection(range: Range): Range | Unit = js.native
  def union(other: Range): Range = js.native
  def `with`(start: Position , end: Position ): Range = js.native
  def `with`(change: js.Any): Range = js.native
}