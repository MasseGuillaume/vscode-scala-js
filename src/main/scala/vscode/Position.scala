package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.Position")
class Position protected () extends js.Object {
  def this(line: Double, character: Double) = this()
  def line: Double = js.native
  def character: Double = js.native
  def isBefore(other: Position): Boolean = js.native
  def isBeforeOrEqual(other: Position): Boolean = js.native
  def isAfter(other: Position): Boolean = js.native
  def isAfterOrEqual(other: Position): Boolean = js.native
  def isEqual(other: Position): Boolean = js.native
  def compareTo(other: Position): Double = js.native
  def translate(lineDelta: Double , characterDelta: Double ): Position = js.native
  def translate(change: js.Any): Position = js.native
  def `with`(line: Double , character: Double ): Position = js.native
  def `with`(change: js.Any): Position = js.native
}