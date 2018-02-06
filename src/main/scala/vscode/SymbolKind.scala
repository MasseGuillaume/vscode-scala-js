package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait SymbolKind extends js.Object {
}
@js.native
@JSGlobal("vscode.SymbolKind")
object SymbolKind extends js.Object {
  var File: SymbolKind = js.native
  var Module: SymbolKind = js.native
  var Namespace: SymbolKind = js.native
  var Package: SymbolKind = js.native
  var Class: SymbolKind = js.native
  var Method: SymbolKind = js.native
  var Property: SymbolKind = js.native
  var Field: SymbolKind = js.native
  var Constructor: SymbolKind = js.native
  var Enum: SymbolKind = js.native
  var Interface: SymbolKind = js.native
  var Function: SymbolKind = js.native
  var Variable: SymbolKind = js.native
  var Constant: SymbolKind = js.native
  var String: SymbolKind = js.native
  var Number: SymbolKind = js.native
  var Boolean: SymbolKind = js.native
  var Array: SymbolKind = js.native
  var Object: SymbolKind = js.native
  var Key: SymbolKind = js.native
  var Null: SymbolKind = js.native
  var EnumMember: SymbolKind = js.native
  var Struct: SymbolKind = js.native
  var Event: SymbolKind = js.native
  var Operator: SymbolKind = js.native
  var TypeParameter: SymbolKind = js.native
  @JSBracketAccess
  def apply(value: SymbolKind): String = js.native
}