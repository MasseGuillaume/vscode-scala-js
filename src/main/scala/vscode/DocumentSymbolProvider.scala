package vscode
import scala.scalajs.js

@js.native
trait DocumentSymbolProvider extends js.Object {
  def provideDocumentSymbols(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[SymbolInformation]] = js.native
}