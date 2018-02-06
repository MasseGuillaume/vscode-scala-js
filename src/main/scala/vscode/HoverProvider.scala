package vscode
import scala.scalajs.js

@js.native
trait HoverProvider extends js.Object {
  def provideHover(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Hover] = js.native
}