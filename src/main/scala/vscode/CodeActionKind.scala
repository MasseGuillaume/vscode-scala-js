package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.CodeActionKind")
class CodeActionKind extends js.Object {
  def value: String = js.native
  def append(parts: String): CodeActionKind = js.native
  def contains(other: CodeActionKind): Boolean = js.native
}
@js.native
@JSGlobal("vscode.CodeActionKind")
object CodeActionKind extends js.Object {
  def Empty: CodeActionKind = js.native
  def QuickFix: CodeActionKind = js.native
  def Refactor: CodeActionKind = js.native
  def RefactorExtract: CodeActionKind = js.native
  def RefactorInline: CodeActionKind = js.native
  def RefactorRewrite: CodeActionKind = js.native
}