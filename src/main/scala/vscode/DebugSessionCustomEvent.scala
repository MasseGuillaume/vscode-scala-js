package vscode
import scala.scalajs.js

@js.native
trait DebugSessionCustomEvent extends js.Object {
  var session: DebugSession = js.native
  var event: String = js.native
  var body: js.Any = js.native
}