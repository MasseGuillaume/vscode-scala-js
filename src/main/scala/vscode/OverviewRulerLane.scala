package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait OverviewRulerLane extends js.Object {
}
@js.native
@JSGlobal("vscode.OverviewRulerLane")
object OverviewRulerLane extends js.Object {
  var Left: OverviewRulerLane = js.native
  var Center: OverviewRulerLane = js.native
  var Right: OverviewRulerLane = js.native
  var Full: OverviewRulerLane = js.native
  @JSBracketAccess
  def apply(value: OverviewRulerLane): String = js.native
}