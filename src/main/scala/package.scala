import scala.scalajs.js
import js.|

package object vscode {
  @js.native
  trait Thenable[T] extends js.Object {
    def `then`[TResult](onfulfilled: js.Function1[T, TResult | Thenable[TResult]], onrejected: js.Function1[js.Any, TResult | Thenable[TResult]]): Thenable[TResult] = js.native
  }

  @js.native
  trait DocumentFilter extends js.Object {
    var language: String = js.native
    var scheme: String = js.native
    var pattern: GlobPattern = js.native
  }

  type GlobPattern = String | RelativePattern
  type DocumentSelector = String | DocumentFilter | js.Array[String | DocumentFilter]
  type ProviderResult[T] = T | Unit | Null | Thenable[T | Unit | Null]
  type Definition = Location | js.Array[Location]
  type MarkedString = MarkdownString | String | js.Any
  type CharacterPair = js.Tuple2[String, String]
}