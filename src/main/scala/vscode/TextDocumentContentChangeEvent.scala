package vscode
import scala.scalajs.js

@js.native
trait TextDocumentContentChangeEvent extends js.Object {
  var range: Range = js.native
  var rangeLength: Double = js.native
  var text: String = js.native
}