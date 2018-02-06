package vscode
import scala.scalajs.js
import js.annotation._

@js.native
trait OpenDialogOptions extends js.Object {
  var defaultUri: Uri = js.native
  var openLabel: String = js.native
  var canSelectFiles: Boolean = js.native
  var canSelectFolders: Boolean = js.native
  var canSelectMany: Boolean = js.native
  var filters: OpenDialogOptions.Filters = js.native
}
object OpenDialogOptions {

@js.native
trait Filters extends js.Object {
  @JSBracketAccess
  def apply(name: String): js.Array[String] = js.native
  @JSBracketAccess
  def update(name: String, v: js.Array[String]): Unit = js.native
}
}