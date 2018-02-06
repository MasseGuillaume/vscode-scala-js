package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.CancellationTokenSource")
class CancellationTokenSource extends js.Object {
  var token: CancellationToken = js.native
  def cancel(): Unit = js.native
  def dispose(): Unit = js.native
}