package vscode
import scala.scalajs.js

@js.native
trait DocumentColorProvider extends js.Object {
  def provideDocumentColors(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[ColorInformation]] = js.native
  def provideColorPresentations(color: Color, context: js.Any, token: CancellationToken): ProviderResult[js.Array[ColorPresentation]] = js.native
}