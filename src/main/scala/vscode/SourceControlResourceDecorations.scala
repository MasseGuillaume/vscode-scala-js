package vscode
import scala.scalajs.js

@js.native
trait SourceControlResourceDecorations extends SourceControlResourceThemableDecorations {
  def strikeThrough: Boolean = js.native
  def faded: Boolean = js.native
  def tooltip: String = js.native
  def light: SourceControlResourceThemableDecorations = js.native
  def dark: SourceControlResourceThemableDecorations = js.native
}