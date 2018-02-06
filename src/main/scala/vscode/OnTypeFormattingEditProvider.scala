package vscode
import scala.scalajs.js

@js.native
trait OnTypeFormattingEditProvider extends js.Object {
  def provideOnTypeFormattingEdits(document: TextDocument, position: Position, ch: String, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]] = js.native
}