package vscode
import scala.scalajs.js

@js.native
trait DocumentLinkProvider extends js.Object {
  def provideDocumentLinks(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[DocumentLink]] = js.native
  def resolveDocumentLink(link: DocumentLink, token: CancellationToken): ProviderResult[DocumentLink] = js.native
}