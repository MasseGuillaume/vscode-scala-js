package vscode
import scala.scalajs.js

@js.native
trait TypeDefinitionProvider extends js.Object {
  def provideTypeDefinition(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Definition] = js.native
}