package vscode
import scala.scalajs.js

@js.native
trait CodeActionContext extends js.Object {
  def diagnostics: js.Array[Diagnostic] = js.native
  def only: CodeActionKind = js.native
}