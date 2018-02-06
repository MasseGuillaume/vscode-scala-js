package vscode
import scala.scalajs.js

@js.native
trait TextDocumentContentProvider extends js.Object {
  var onDidChange: Event[Uri] = js.native
  def provideTextDocumentContent(uri: Uri, token: CancellationToken): ProviderResult[String] = js.native
}