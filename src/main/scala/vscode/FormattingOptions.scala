package vscode
import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait FormattingOptions extends js.Object {
  var tabSize: Double = js.native
  var insertSpaces: Boolean = js.native
  @JSBracketAccess
  def apply(key: String): Boolean | Double | String = js.native
  @JSBracketAccess
  def update(key: String, v: Boolean | Double | String): Unit = js.native
}