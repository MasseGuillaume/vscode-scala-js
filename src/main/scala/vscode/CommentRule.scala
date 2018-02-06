package vscode
import scala.scalajs.js

@js.native
trait CommentRule extends js.Object {
  var lineComment: String = js.native
  var blockComment: CharacterPair = js.native
}