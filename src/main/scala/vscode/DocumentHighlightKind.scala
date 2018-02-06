package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait DocumentHighlightKind extends js.Object {
}
@js.native
@JSGlobal("vscode.DocumentHighlightKind")
object DocumentHighlightKind extends js.Object {
  var Text: DocumentHighlightKind = js.native
  var Read: DocumentHighlightKind = js.native
  var Write: DocumentHighlightKind = js.native
  @JSBracketAccess
  def apply(value: DocumentHighlightKind): String = js.native
}