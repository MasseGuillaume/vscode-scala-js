package vscode
import scala.scalajs.js
import js.annotation._

@js.native
trait DebugConfiguration extends js.Object {
  var `type`: String = js.native
  var name: String = js.native
  var request: String = js.native
  @JSBracketAccess
  def apply(key: String): js.Any = js.native
  @JSBracketAccess
  def update(key: String, v: js.Any): Unit = js.native
}