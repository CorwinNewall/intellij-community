package com.jetbrains.python.testing.doctest;

import com.jetbrains.python.testing.AbstractPythonTestRunConfigurationParams;

/**
 * User: catherine
 */
public interface PythonDocTestRunConfigurationParams {
  String getPattern();
  void setPattern(String pattern);
  AbstractPythonTestRunConfigurationParams getTestRunConfigurationParams();

}
