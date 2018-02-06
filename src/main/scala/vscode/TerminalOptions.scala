package vscode
import scala.scalajs.js
import js.annotation._
import js.|

@js.native
trait TerminalOptions extends js.Object {
  var name: String = js.native
  var shellPath: String = js.native
  var shellArgs: js.Array[String] = js.native
  var cwd: String = js.native
  var env: TerminalOptions.Env = js.native
}
object TerminalOptions {

@js.native
trait Env extends js.Object {
  @JSBracketAccess
  def apply(key: String): String | Null = js.native
  @JSBracketAccess
  def update(key: String, v: String | Null): Unit = js.native
}
}