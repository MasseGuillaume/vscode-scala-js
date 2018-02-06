package vscode
import scala.scalajs.js

@js.native
trait Terminal extends js.Object {
  def name: String = js.native
  def processId: Thenable[Double] = js.native
  def sendText(text: String, addNewLine: Boolean ): Unit = js.native
  def show(preserveFocus: Boolean ): Unit = js.native
  def hide(): Unit = js.native
  def dispose(): Unit = js.native
}