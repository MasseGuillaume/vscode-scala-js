package vscode
import scala.scalajs.js

@js.native
trait ReferenceProvider extends js.Object {
  def provideReferences(document: TextDocument, position: Position, context: ReferenceContext, token: CancellationToken): ProviderResult[js.Array[Location]] = js.native
}