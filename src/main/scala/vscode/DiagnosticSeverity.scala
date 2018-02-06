package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait DiagnosticSeverity extends js.Object {
}
@js.native
@JSGlobal("vscode.DiagnosticSeverity")
object DiagnosticSeverity extends js.Object {
  var Error: DiagnosticSeverity = js.native
  var Warning: DiagnosticSeverity = js.native
  var Information: DiagnosticSeverity = js.native
  var Hint: DiagnosticSeverity = js.native
  @JSBracketAccess
  def apply(value: DiagnosticSeverity): String = js.native
}