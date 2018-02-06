package vscode
import scala.scalajs.js

@js.native
trait TextDocumentChangeEvent extends js.Object {
  var document: TextDocument = js.native
  var contentChanges: js.Array[TextDocumentContentChangeEvent] = js.native
}