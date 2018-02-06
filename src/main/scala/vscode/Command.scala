package vscode
import scala.scalajs.js

@js.native
trait Command extends js.Object {
  var title: String = js.native
  var command: String = js.native
  var tooltip: String = js.native
  var arguments: js.Array[js.Any] = js.native
}