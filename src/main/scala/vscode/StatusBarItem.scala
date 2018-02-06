package vscode
import scala.scalajs.js
import js.|

@js.native
trait StatusBarItem extends js.Object {
  def alignment: StatusBarAlignment = js.native
  def priority: Double = js.native
  var text: String = js.native
  var tooltip: String | Unit = js.native
  var color: String | ThemeColor | Unit = js.native
  var command: String | Unit = js.native
  def show(): Unit = js.native
  def hide(): Unit = js.native
  def dispose(): Unit = js.native
}