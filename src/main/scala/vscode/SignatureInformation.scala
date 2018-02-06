package vscode
import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal("vscode.SignatureInformation")
class SignatureInformation protected () extends js.Object {
  def this(label: String, documentation: String | MarkdownString ) = this()
  var label: String = js.native
  var documentation: String | MarkdownString = js.native
  var parameters: js.Array[ParameterInformation] = js.native
}