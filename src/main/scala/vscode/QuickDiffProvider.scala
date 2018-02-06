package vscode
import scala.scalajs.js

@js.native
trait QuickDiffProvider extends js.Object {
  def provideOriginalResource(uri: Uri, token: CancellationToken): ProviderResult[Uri] = js.native
}