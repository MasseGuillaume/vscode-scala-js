package vscode
import scala.scalajs.js

@js.native
trait DocumentHighlightProvider extends js.Object {
  def provideDocumentHighlights(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[js.Array[DocumentHighlight]] = js.native
}