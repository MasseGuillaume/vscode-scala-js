package vscode
import scala.scalajs.js

@js.native
trait SourceControlResourceGroup extends js.Object {
  def id: String = js.native
  var label: String = js.native
  var hideWhenEmpty: Boolean = js.native
  var resourceStates: js.Array[SourceControlResourceState] = js.native
  def dispose(): Unit = js.native
}