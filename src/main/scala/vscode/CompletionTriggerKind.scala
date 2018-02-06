package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait CompletionTriggerKind extends js.Object {
}
@js.native
@JSGlobal("vscode.CompletionTriggerKind")
object CompletionTriggerKind extends js.Object {
  var Invoke: CompletionTriggerKind = js.native
  var TriggerCharacter: CompletionTriggerKind = js.native
  var TriggerForIncompleteCompletions: CompletionTriggerKind = js.native
  @JSBracketAccess
  def apply(value: CompletionTriggerKind): String = js.native
}