package vscode
import scala.scalajs.js

@js.native
trait DefinitionProvider extends js.Object {
  def provideDefinition(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Definition] = js.native
}