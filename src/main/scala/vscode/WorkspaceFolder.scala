package vscode
import scala.scalajs.js

@js.native
trait WorkspaceFolder extends js.Object {
  def uri: Uri = js.native
  def name: String = js.native
  def index: Double = js.native
}