package vscode
import scala.scalajs.js
import js.annotation._

@js.native
trait TaskDefinition extends js.Object {
  def `type`: String = js.native
  @JSBracketAccess
  def apply(name: String): js.Any = js.native
  @JSBracketAccess
  def update(name: String, v: js.Any): Unit = js.native
}