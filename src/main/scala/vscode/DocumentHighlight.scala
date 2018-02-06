package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.DocumentHighlight")
class DocumentHighlight protected () extends js.Object {
  def this(range: Range, kind: DocumentHighlightKind ) = this()
  var range: Range = js.native
  var kind: DocumentHighlightKind = js.native
}