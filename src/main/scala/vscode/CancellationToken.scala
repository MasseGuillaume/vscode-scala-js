package vscode
import scala.scalajs.js

@js.native
trait CancellationToken extends js.Object {
  var isCancellationRequested: Boolean = js.native
  var onCancellationRequested: Event[js.Any] = js.native
}