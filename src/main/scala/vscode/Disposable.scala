package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.Disposable")
class Disposable protected () extends js.Object {
  def this(callOnDispose: js.Function) = this()
  def dispose(): js.Dynamic = js.native
}
@js.native
@JSGlobal("vscode.Disposable")
object Disposable extends js.Object {
  def from(disposableLikes: js.Any*): Disposable = js.native
}