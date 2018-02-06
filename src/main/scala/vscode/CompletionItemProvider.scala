package vscode
import scala.scalajs.js
import js.|

@js.native
trait CompletionItemProvider extends js.Object {
  def provideCompletionItems(document: TextDocument, position: Position, token: CancellationToken, context: CompletionContext): ProviderResult[js.Array[CompletionItem] | CompletionList] = js.native
  def resolveCompletionItem(item: CompletionItem, token: CancellationToken): ProviderResult[CompletionItem] = js.native
}