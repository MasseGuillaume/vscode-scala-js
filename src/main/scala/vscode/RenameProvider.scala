package vscode
import scala.scalajs.js

@js.native
trait RenameProvider extends js.Object {
  def provideRenameEdits(document: TextDocument, position: Position, newName: String, token: CancellationToken): ProviderResult[WorkspaceEdit] = js.native
}