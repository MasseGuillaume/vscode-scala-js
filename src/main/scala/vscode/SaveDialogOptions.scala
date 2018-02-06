package vscode
import scala.scalajs.js
import js.annotation._

@js.native
trait SaveDialogOptions extends js.Object {
  var defaultUri: Uri = js.native
  var saveLabel: String = js.native
  var filters: SaveDialogOptions.Filters = js.native
}
object SaveDialogOptions {

@js.native
trait Filters extends js.Object {
  @JSBracketAccess
  def apply(name: String): js.Array[String] = js.native
  @JSBracketAccess
  def update(name: String, v: js.Array[String]): Unit = js.native
}
}