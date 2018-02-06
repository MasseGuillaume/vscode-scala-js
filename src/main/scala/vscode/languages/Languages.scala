package vscode.languages
import scala.scalajs.js
import js.annotation._
import vscode._

@js.native
@JSGlobal("vscode.languages")
object Languages extends js.Object {
  def getLanguages(): Thenable[js.Array[String]] = js.native
  def `match`(selector: DocumentSelector, document: TextDocument): Double = js.native
  def createDiagnosticCollection(name: String ): DiagnosticCollection = js.native
  def registerCompletionItemProvider(selector: DocumentSelector, provider: CompletionItemProvider, triggerCharacters: String*): Disposable = js.native
  def registerCodeActionsProvider(selector: DocumentSelector, provider: CodeActionProvider): Disposable = js.native
  def registerCodeLensProvider(selector: DocumentSelector, provider: CodeLensProvider): Disposable = js.native
  def registerDefinitionProvider(selector: DocumentSelector, provider: DefinitionProvider): Disposable = js.native
  def registerImplementationProvider(selector: DocumentSelector, provider: ImplementationProvider): Disposable = js.native
  def registerTypeDefinitionProvider(selector: DocumentSelector, provider: TypeDefinitionProvider): Disposable = js.native
  def registerHoverProvider(selector: DocumentSelector, provider: HoverProvider): Disposable = js.native
  def registerDocumentHighlightProvider(selector: DocumentSelector, provider: DocumentHighlightProvider): Disposable = js.native
  def registerDocumentSymbolProvider(selector: DocumentSelector, provider: DocumentSymbolProvider): Disposable = js.native
  def registerWorkspaceSymbolProvider(provider: WorkspaceSymbolProvider): Disposable = js.native
  def registerReferenceProvider(selector: DocumentSelector, provider: ReferenceProvider): Disposable = js.native
  def registerRenameProvider(selector: DocumentSelector, provider: RenameProvider): Disposable = js.native
  def registerDocumentFormattingEditProvider(selector: DocumentSelector, provider: DocumentFormattingEditProvider): Disposable = js.native
  def registerDocumentRangeFormattingEditProvider(selector: DocumentSelector, provider: DocumentRangeFormattingEditProvider): Disposable = js.native
  def registerOnTypeFormattingEditProvider(selector: DocumentSelector, provider: OnTypeFormattingEditProvider, firstTriggerCharacter: String, moreTriggerCharacter: String*): Disposable = js.native
  def registerSignatureHelpProvider(selector: DocumentSelector, provider: SignatureHelpProvider, triggerCharacters: String*): Disposable = js.native
  def registerDocumentLinkProvider(selector: DocumentSelector, provider: DocumentLinkProvider): Disposable = js.native
  def registerColorProvider(selector: DocumentSelector, provider: DocumentColorProvider): Disposable = js.native
  def setLanguageConfiguration(language: String, configuration: LanguageConfiguration): Disposable = js.native
}