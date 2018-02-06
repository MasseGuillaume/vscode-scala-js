package vscode
import scala.scalajs.js
import js.annotation._

@js.native
trait ShellExecutionOptions extends js.Object {
  var executable: String = js.native
  var shellArgs: js.Array[String] = js.native
  var cwd: String = js.native
  var env: ShellExecutionOptions.Env = js.native
}
object ShellExecutionOptions {

@js.native
trait Env extends js.Object {
  @JSBracketAccess
  def apply(key: String): String = js.native
  @JSBracketAccess
  def update(key: String, v: String): Unit = js.native
}
}