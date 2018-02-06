package vscode
import scala.scalajs.js
import js.RegExp

@js.native
trait LanguageConfiguration extends js.Object {
  var comments: CommentRule = js.native
  var brackets: js.Array[CharacterPair] = js.native
  var wordPattern: RegExp = js.native
  var indentationRules: IndentationRule = js.native
  var onEnterRules: js.Array[OnEnterRule] = js.native
  var __electricCharacterSupport: LanguageConfiguration.__electricCharacterSupport = js.native
  var __characterPairSupport: LanguageConfiguration.__characterPairSupport = js.native
}
object LanguageConfiguration {

@js.native
trait __electricCharacterSupport extends js.Object {
  var brackets: js.Any = js.native
  var docComment: __electricCharacterSupport.DocComment = js.native
}

object __electricCharacterSupport {

@js.native
trait DocComment extends js.Object {
  var scope: String = js.native
  var open: String = js.native
  var lineStart: String = js.native
  var close: String = js.native
}
}

@js.native
trait __characterPairSupport extends js.Object {
  var autoClosingPairs: js.Array[js.Any] = js.native
}
}