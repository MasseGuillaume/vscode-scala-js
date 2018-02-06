package vscode
import scala.scalajs.js

@js.native
trait DocumentFormattingEditProvider extends js.Object {
  def provideDocumentFormattingEdits(document: TextDocument, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]] = js.native
}