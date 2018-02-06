package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.SymbolInformation")
class SymbolInformation protected () extends js.Object {
  def this(name: String, kind: SymbolKind, containerName: String, location: Location) = this()
  def this(name: String, kind: SymbolKind, range: Range, uri: Uri , containerName: String ) = this()
  var name: String = js.native
  var containerName: String = js.native
  var kind: SymbolKind = js.native
  var location: Location = js.native
}