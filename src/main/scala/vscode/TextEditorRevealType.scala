package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait TextEditorRevealType extends js.Object {
}
@js.native
@JSGlobal("vscode.TextEditorRevealType")
object TextEditorRevealType extends js.Object {
  var Default: TextEditorRevealType = js.native
  var InCenter: TextEditorRevealType = js.native
  var InCenterIfOutsideViewport: TextEditorRevealType = js.native
  var AtTop: TextEditorRevealType = js.native
  @JSBracketAccess
  def apply(value: TextEditorRevealType): String = js.native
}