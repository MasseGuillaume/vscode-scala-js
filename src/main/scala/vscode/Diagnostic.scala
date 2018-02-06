package vscode
import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal("vscode.Diagnostic")
class Diagnostic protected () extends js.Object {
  def this(range: Range, message: String, severity: DiagnosticSeverity ) = this()
  var range: Range = js.native
  var message: String = js.native
  var source: String = js.native
  var severity: DiagnosticSeverity = js.native
  var code: String | Double = js.native
}