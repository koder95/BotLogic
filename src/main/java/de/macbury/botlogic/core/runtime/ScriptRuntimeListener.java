package de.macbury.botlogic.core.runtime;

import org.mozilla.javascript.RhinoException;

/**
 * Created by macbury on 28.03.14.
 */
public interface ScriptRuntimeListener {
  void onScriptStart(ScriptRunner runner);
  void onScriptInterput(ScriptRunner runner);
  void onScriptError(ScriptRunner runner, RhinoException error);
  void onScriptFinish(ScriptRunner runner);
}
