package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait CompletionItemKind extends js.Object {
}
@js.native
@JSGlobal("vscode.CompletionItemKind")
object CompletionItemKind extends js.Object {
  var Text: CompletionItemKind = js.native
  var Method: CompletionItemKind = js.native
  var Function: CompletionItemKind = js.native
  var Constructor: CompletionItemKind = js.native
  var Field: CompletionItemKind = js.native
  var Variable: CompletionItemKind = js.native
  var Class: CompletionItemKind = js.native
  var Interface: CompletionItemKind = js.native
  var Module: CompletionItemKind = js.native
  var Property: CompletionItemKind = js.native
  var Unit: CompletionItemKind = js.native
  var Value: CompletionItemKind = js.native
  var Enum: CompletionItemKind = js.native
  var Keyword: CompletionItemKind = js.native
  var Snippet: CompletionItemKind = js.native
  var Color: CompletionItemKind = js.native
  var Reference: CompletionItemKind = js.native
  var File: CompletionItemKind = js.native
  var Folder: CompletionItemKind = js.native
  var EnumMember: CompletionItemKind = js.native
  var Constant: CompletionItemKind = js.native
  var Struct: CompletionItemKind = js.native
  var Event: CompletionItemKind = js.native
  var Operator: CompletionItemKind = js.native
  var TypeParameter: CompletionItemKind = js.native
  @JSBracketAccess
  def apply(value: CompletionItemKind): String = js.native
}