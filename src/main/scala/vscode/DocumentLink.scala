package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.DocumentLink")
class DocumentLink protected () extends js.Object {
  def this(range: Range, target: Uri ) = this()
  var range: Range = js.native
  var target: Uri = js.native
}