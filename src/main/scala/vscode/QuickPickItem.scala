package vscode
import scala.scalajs.js

@js.native
trait QuickPickItem extends js.Object {
  var label: String = js.native
  var description: String = js.native
  var detail: String = js.native
}