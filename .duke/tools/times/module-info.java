module times {
  requires run.duke;

  provides run.duke.ToolOperator with
      times.TimesToolOperator;
}
