package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait ViewColumn extends js.Object {
}
@js.native
@JSGlobal("vscode.ViewColumn")
object ViewColumn extends js.Object {
  var Active: ViewColumn = js.native
  var One: ViewColumn = js.native
  var Two: ViewColumn = js.native
  var Three: ViewColumn = js.native
  @JSBracketAccess
  def apply(value: ViewColumn): String = js.native
}