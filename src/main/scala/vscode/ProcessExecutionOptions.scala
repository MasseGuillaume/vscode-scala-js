package vscode
import scala.scalajs.js
import js.annotation._

@js.native
trait ProcessExecutionOptions extends js.Object {
  var cwd: String = js.native
  var env: ProcessExecutionOptions.Env = js.native
}
object ProcessExecutionOptions {

@js.native
trait Env extends js.Object {
  @JSBracketAccess
  def apply(key: String): String = js.native
  @JSBracketAccess
  def update(key: String, v: String): Unit = js.native
}
}