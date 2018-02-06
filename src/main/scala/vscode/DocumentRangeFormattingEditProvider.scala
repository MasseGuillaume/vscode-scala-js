package vscode
import scala.scalajs.js

@js.native
trait DocumentRangeFormattingEditProvider extends js.Object {
  def provideDocumentRangeFormattingEdits(document: TextDocument, range: Range, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]] = js.native
}