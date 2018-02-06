package vscode
import scala.scalajs.js

@js.native
trait ImplementationProvider extends js.Object {
  def provideImplementation(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Definition] = js.native
}