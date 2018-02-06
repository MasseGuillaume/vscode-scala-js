package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.ColorPresentation")
class ColorPresentation protected () extends js.Object {
  def this(label: String) = this()
  var label: String = js.native
  var textEdit: TextEdit = js.native
  var additionalTextEdits: js.Array[TextEdit] = js.native
}