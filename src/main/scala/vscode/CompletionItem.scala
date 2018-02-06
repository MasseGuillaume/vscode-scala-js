package vscode
import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal("vscode.CompletionItem")
class CompletionItem protected () extends js.Object {
  def this(label: String, kind: CompletionItemKind ) = this()
  var label: String = js.native
  var kind: CompletionItemKind = js.native
  var detail: String = js.native
  var documentation: String | MarkdownString = js.native
  var sortText: String = js.native
  var filterText: String = js.native
  var insertText: String | SnippetString = js.native
  var range: Range = js.native
  var commitCharacters: js.Array[String] = js.native
  var textEdit: TextEdit = js.native
  var additionalTextEdits: js.Array[TextEdit] = js.native
  var command: Command = js.native
}