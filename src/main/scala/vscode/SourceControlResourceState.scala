package vscode
import scala.scalajs.js

@js.native
trait SourceControlResourceState extends js.Object {
  def resourceUri: Uri = js.native
  def command: Command = js.native
  def decorations: SourceControlResourceDecorations = js.native
}