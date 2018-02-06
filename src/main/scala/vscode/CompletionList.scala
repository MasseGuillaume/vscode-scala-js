package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.CompletionList")
class CompletionList protected () extends js.Object {
  def this(items: js.Array[CompletionItem] , isIncomplete: Boolean ) = this()
  var isIncomplete: Boolean = js.native
  var items: js.Array[CompletionItem] = js.native
}