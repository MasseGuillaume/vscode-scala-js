package vscode
import scala.scalajs.js

@js.native
trait CompletionContext extends js.Object {
  def triggerKind: CompletionTriggerKind = js.native
  def triggerCharacter: String = js.native
}