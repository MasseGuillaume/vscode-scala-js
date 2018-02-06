package vscode
import scala.scalajs.js

@js.native
trait SignatureHelpProvider extends js.Object {
  def provideSignatureHelp(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[SignatureHelp] = js.native
}