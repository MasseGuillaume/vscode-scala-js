package vscode
import scala.scalajs.js

@js.native
trait DebugSession extends js.Object {
  def id: String = js.native
  def `type`: String = js.native
  def name: String = js.native
  def customRequest(command: String, args: js.Any ): Thenable[js.Any] = js.native
}