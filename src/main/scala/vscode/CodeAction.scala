package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.CodeAction")
class CodeAction protected () extends js.Object {
  def this(title: String, kind: CodeActionKind ) = this()
  var title: String = js.native
  var edit: WorkspaceEdit = js.native
  var diagnostics: js.Array[Diagnostic] = js.native
  var command: Command = js.native
  var kind: CodeActionKind = js.native
}