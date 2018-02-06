package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait DecorationRangeBehavior extends js.Object {
}
@js.native
@JSGlobal("vscode.DecorationRangeBehavior")
object DecorationRangeBehavior extends js.Object {
  var OpenOpen: DecorationRangeBehavior = js.native
  var ClosedClosed: DecorationRangeBehavior = js.native
  var OpenClosed: DecorationRangeBehavior = js.native
  var ClosedOpen: DecorationRangeBehavior = js.native
  @JSBracketAccess
  def apply(value: DecorationRangeBehavior): String = js.native
}