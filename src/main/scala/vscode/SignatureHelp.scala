package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.SignatureHelp")
class SignatureHelp extends js.Object {
  var signatures: js.Array[SignatureInformation] = js.native
  var activeSignature: Double = js.native
  var activeParameter: Double = js.native
}