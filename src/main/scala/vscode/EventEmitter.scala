package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.EventEmitter")
class EventEmitter[T] extends js.Object {
  var event: Event[T] = js.native
  def fire(data: T ): Unit = js.native
  def dispose(): Unit = js.native
}