package vscode
import scala.scalajs.js

@js.native
trait CodeLensProvider extends js.Object {
  var onDidChangeCodeLenses: Event[Unit] = js.native
  def provideCodeLenses(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[CodeLens]] = js.native
  def resolveCodeLens(codeLens: CodeLens, token: CancellationToken): ProviderResult[CodeLens] = js.native
}