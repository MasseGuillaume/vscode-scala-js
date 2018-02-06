package vscode
import scala.scalajs.js

@js.native
trait TextDocumentWillSaveEvent extends js.Object {
  var document: TextDocument = js.native
  var reason: TextDocumentSaveReason = js.native
  def waitUntil(thenable: Thenable[js.Array[TextEdit]]): Unit = js.native
  // def waitUntil(thenable: Thenable[js.Any]): Unit = js.native
}