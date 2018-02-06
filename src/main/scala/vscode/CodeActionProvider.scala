package vscode
import scala.scalajs.js
import js.|

@js.native
trait CodeActionProvider extends js.Object {
  def provideCodeActions(document: TextDocument, range: Range, context: CodeActionContext, token: CancellationToken): ProviderResult[js.Array[Command | CodeAction]] = js.native
}