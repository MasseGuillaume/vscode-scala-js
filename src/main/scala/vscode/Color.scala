package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.Color")
class Color protected () extends js.Object {
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
  def red: Double = js.native
  def green: Double = js.native
  def blue: Double = js.native
  def alpha: Double = js.native
}