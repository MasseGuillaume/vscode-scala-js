package vscode
import scala.scalajs.js

@js.native
trait WorkspaceSymbolProvider extends js.Object {
  def provideWorkspaceSymbols(query: String, token: CancellationToken): ProviderResult[js.Array[SymbolInformation]] = js.native
  def resolveWorkspaceSymbol(symbol: SymbolInformation, token: CancellationToken): ProviderResult[SymbolInformation] = js.native
}